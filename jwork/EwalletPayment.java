
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (1 - 4 - 2021)
 */
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    
    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker,
        InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker,
        Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.setBonus(bonus);
    }
    
    @Override
    public PaymentType getPaymentType() 
    {
        return PAYMENT_TYPE;
    }
    public Bonus getBonus()
    {
        return bonus;
    }
    public void setBonus(Bonus bonus) 
    {
        this.bonus = bonus;
    }
    @Override
    public void setTotalFee() 
    {
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) 
        {
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } 
        else 
        {
            super.totalFee = getJob().getFee();
        }
    }
    @Override
    public void printData()
    {
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Job Seeker: " + getJobseeker().getName());
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) 
        {
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
    }
}
