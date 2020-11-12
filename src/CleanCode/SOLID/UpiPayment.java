package CleanCode.SOLID;

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
