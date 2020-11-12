package CleanCode.SOLID;

interface IOfflineTicketBooking {
    public default void numberOfSeatsToBook() {
        System.out.println("Please mention number of seats to Book");
    }
}
