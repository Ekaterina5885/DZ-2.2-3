public class CreditPaymentService {
    public double calculate(double percent, double creditAmount, double creditTerm) {
        double monthlyInterestRate = percent / 12 / 100;

        double coefficientV1 = monthlyInterestRate + 1;
        double coefficient = Math.pow(coefficientV1, creditTerm);
        double coefficient1 = ((monthlyInterestRate * coefficient) / (coefficient - 1));
        int monthlyPayment = (int) (creditAmount * coefficient1);
        return monthlyPayment;

    }
}

