
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Philipus Kristian Renaldy
 * @version 25 - 3 - 2021
 */
public enum PaymentType {
    BankPayment("Bank Payment"),EwalletPayment("E-Wallet Payment");

    private String payment;
    private PaymentType(String payment) 
    {
        this.payment = payment;
    }
    
    @Override
    public String toString(){
        return payment;
    }
    
    public static void main(String[] args)
    {
        PaymentType payment1 = PaymentType.BankPayment;
        PaymentType payment2 = PaymentType.EwalletPayment;
        System.out.println(payment1);
        System.out.println(payment2);
    }
}
