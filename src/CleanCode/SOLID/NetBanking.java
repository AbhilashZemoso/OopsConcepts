package CleanCode.SOLID;

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
