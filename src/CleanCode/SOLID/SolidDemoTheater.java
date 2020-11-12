package CleanCode.SOLID;


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
