package CleanCode.SOLID;

// DIP
interface IOfflinePayment {
    default void payByCash(int amountToPay) {
        System.out.println("Please provide Rs " + amountToPay + " inorder to complete transaction");

        //receives amount by cash

        System.out.println("Please take your change");
    }
}
