package CleanCode.SOLID;

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
