package CleanCode.SOLID;

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
