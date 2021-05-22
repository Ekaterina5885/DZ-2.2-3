public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double percent = 9.99;
        double creditTerm = 12;
        double monthlyPayment = payment.calculate(percent, creditAmount, creditTerm);
        System.out.println("Ежемесячный платеж" + monthlyPayment + " р.");


    }
}