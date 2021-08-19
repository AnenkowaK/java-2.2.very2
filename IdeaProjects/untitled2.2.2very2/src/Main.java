public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double interestRate = 0.0999;
        int months = 12;
        long payment = (long) service.calculate(creditAmount, interestRate, months);
        System.out.println(payment);

    }
}
