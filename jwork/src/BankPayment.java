import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Write a description of class BankPayment here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (10 - 4 - 2021)
 */
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee)
    {
        super(id, jobs, jobseeker);
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
        for(Job job : getJobs()){
            if(adminFee > 0)
            {
                super.totalFee = job.getFee() - getAdminFee();
            } 
            else 
            {
                super.totalFee = job.getFee();
            }   
        }
    }
    @Override
    public String toString()
    {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formattedDate.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) 
        {
            if (adminFee != 0)
            {
                res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                   + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " 
                   + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
            else
            {
                res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                    + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() 
                    + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}