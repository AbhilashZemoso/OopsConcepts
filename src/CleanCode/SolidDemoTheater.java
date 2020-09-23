package CleanCode;

import java.util.*;


interface IOfflineTicketBooking {
    public default void numberOfSeatsToBook() {
        System.out.println("Please mention number of seats to Book");
    }
}


interface IOnlineTicketBooking {
    void selectSeats();
}


//ISP
interface ITheater extends IOfflinePayment, IOfflineTicketBooking {
    void checkAvailability();

    void aboutTheater();

    default public void bookTicket() {
        numberOfSeatsToBook();

        checkAvailability();

        System.out.println("Request cash payment");

        payByCash(500);
    }

}


// DIP
interface IOfflinePayment {
    default void payByCash(int amountToPay) {
        System.out.println("Please provide Rs " + amountToPay + " inorder to complete transaction");

        //receives amount by cash

        System.out.println("Please take your change");
    }
}

interface IOnlinePayment {
    void makePayment(int amountToPay);
}

class NetBanking implements IOnlinePayment {
    private String accountNumber;

    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void makePayment(int amountToPay) {
        System.out.println("Please enter your account number and bank code");
        //authenticateUser
        setAccountNumber("123456786789");
        System.out.println("Enter OTP");
    }
}

//SRP
class UpiPayment implements IOnlinePayment {
    private String mobileNumber;

    private void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void makePayment(int amountToPay) {
        System.out.println("Please enter your mobile number");
        //authenticateUser
        setMobileNumber("999999999");
        System.out.println("Enter UPI Pin");
    }
}


class BookMyShow implements IOnlineTicketBooking {
    private boolean seatStatus[];

    BookMyShow() {
    }

    BookMyShow(int availableSeats) {
        seatStatus = new boolean[availableSeats];
        for (int seatNumber = 1; seatNumber <= seatStatus.length; seatNumber++) {
            seatStatus[seatNumber - 1] = true;
        }
    }

    public void selectSeats() {
        System.out.println("Available Seats are :");
        for (int seatNumber = 1; seatNumber <= seatStatus.length; seatNumber++) {
            if (seatStatus[seatNumber-1])
                System.out.print(seatNumber + "  ");
        }
    }

    public void bookTicket(IOnlinePayment onlinePayment) {
        selectSeats();

        System.out.println("Request online payment");

        onlinePayment.makePayment(500);
    }

}


//LIP
class Inox extends BookMyShow implements ITheater {
    private int availableOfflineSeats, availableOnlineSeats = 10;

    Inox(int availableSeats) {
        super(10);
        this.availableOfflineSeats = availableSeats - this.availableOfflineSeats;
    }

    public void aboutTheater() {
        System.out.println("4k HD display");
        System.out.println("Dolbey sound");
        System.out.println("Snacks available");
    }

    public void checkAvailability() {
        if (this.availableOfflineSeats > 0)
            System.out.println("Tickets available offline");
        else if (this.availableOnlineSeats > 0)
            System.out.println("Tickets available online");
        else
            System.out.println("Tickets not available");
    }
}

class LaksmiTheater implements ITheater {
    private int availableSeats;

    LaksmiTheater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void aboutTheater() {
        System.out.println("2k HD display");
        System.out.println("20db sound");
    }


    public void checkAvailability() {
        if(availableSeats>0)
            System.out.println("Tickets available offline");
    }
}


class SolidDemoTheater {
    public static void main(String[] args) {
        LaksmiTheater theater = new LaksmiTheater(30);
        theater.aboutTheater();
        System.out.println();
        theater.bookTicket();

        System.out.println("\n" + "----------------------" + "\n");

        Inox theater2 = new Inox(50);
        theater.aboutTheater();
        System.out.println();
        theater2.bookTicket(new NetBanking());
    }
}
