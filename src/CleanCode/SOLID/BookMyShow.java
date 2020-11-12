package CleanCode.SOLID;

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
