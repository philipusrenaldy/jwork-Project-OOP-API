
/**
 * Write a description of class BankPayment here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (3 - 4 - 2021)
 */
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker,
    InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker,
    InvoiceStatus invoiceStatus, int adminFee)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.setAdminFee(adminFee);
    }

    @Override
    public PaymentType getPaymentType() 
    {
        return PAYMENT_TYPE;
    }
    public int getAdminFee()
    {
        return adminFee;
    }
    public void setAdminFee(int adminFee) 
    {
        this.adminFee = adminFee;
    }
    @Override
    public void setTotalFee() 
    {
        if(adminFee > 0)
        {
            super.totalFee = getJob().getFee() - adminFee;
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
        System.out.println("Admin Fee: " + getAdminFee());
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
    }
}
