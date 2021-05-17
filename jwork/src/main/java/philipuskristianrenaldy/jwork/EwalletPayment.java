package philipuskristianrenaldy.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (10 - 4 - 2021)
 */
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    /**
     * Constructor for objects of class EwalletPaymentio
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }
    
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
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
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
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
            if ((bonus != null) && (bonus.getActive() == true) && (job.getFee() > bonus.getMinTotalFee()))
            {
            res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nReferral Code = " + bonus.getReferralCode() + "\nTotal Fee = " 
                    + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
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