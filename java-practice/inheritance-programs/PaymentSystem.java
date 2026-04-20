public class PaymentSystem {

    public static void main(String[] args) {
        UPIPayment p = new UPIPayment();
        p.pay(500);                                         // calling parent method
        p.payViaUPI("sohailiqbal@ok-axis", 500);       // child method
    }

}


    class Payment {
        void pay(double amount) {
            System.out.println("Processing generic payment: " + amount);
        }
    }

    class UPIPayment extends Payment {
        void payViaUPI(String upiId, double amount) {
            System.out.println("Paying " + amount + " via UPI ID: " + upiId);
        }
    }





