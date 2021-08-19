public class CreditPaymentService {
    public double calculate(double creditAmount, double interestRate, int months) {
        double monthRate = interestRate / 12;
        double res = creditAmount * (monthRate + monthRate / (Math.pow(1 + monthRate, months) - 1));
        return res;
    }
}
