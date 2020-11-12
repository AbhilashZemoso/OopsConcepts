package CleanCode.SOLID;

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
