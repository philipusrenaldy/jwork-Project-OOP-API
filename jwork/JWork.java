import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author Philipus Kristian Renaldy
 * @version 8 - 4 - 2021
 */
public class JWork
{
    public static void main(String[] args)
    { 
        Jobseeker jobseeker1 = new Jobseeker(1, "Philipus", "phlipus..@ui.ac.id", "philipus", new GregorianCalendar(2021, 4, 8));
        Jobseeker jobseeker2 = new Jobseeker(2, "Kristian", "kristian@ui.ac.id", "PhilipusK2", 2021, 4, 8);
        Jobseeker jobseeker3 = new Jobseeker(3, "Renaldy", "renaldy@ui.ac.id", "PhilipusK3");
        //System.out.println("==================== Jobseeker 1 ====================");
        //System.out.println(jobseeker1);
        //System.out.println("==================== Jobseeker 2 ====================");
        //System.out.println(jobseeker2);
        //System.out.println("==================== Jobseeker 3 ====================");
        //System.out.println(jobseeker3);
        
        //jobseeker1.setEmail("philipus.kristian@ui.ac.id");
        //jobseeker1.setPassword("PhilipusK1");
        
        //System.out.println("==================== Jobseeker 1 FIXED ====================");
        //System.out.println(jobseeker1);
        
        Bonus bonus1 = new Bonus(123, "AKUBAHAGIA123", 20000, 30000, true);
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "UI/UX", recruiter1, 1000, JobCategory.UI);
        Job job2 = new Job(1, "Mobile Development", recruiter1, 100000, JobCategory.FrontEnd);
        EwalletPayment inv1 = new EwalletPayment(1, job1, jobseeker1, bonus1, InvoiceStatus.OnGoing);
        EwalletPayment inv2 = new EwalletPayment(2, job1, jobseeker1, bonus1, InvoiceStatus.Finished);
        EwalletPayment inv3 = new EwalletPayment(3, job2, jobseeker1, bonus1, InvoiceStatus.OnGoing);  
        BankPayment bank1 = new BankPayment(1, job1, jobseeker1, InvoiceStatus.Finished, 0);
        BankPayment bank2 = new BankPayment(2, job1, jobseeker1, InvoiceStatus.Finished, 12);
        
        inv1.setTotalFee();
        inv2.setTotalFee();
        inv3.setTotalFee();
        bank1.setTotalFee();
        bank2.setTotalFee();
        
        System.out.println("\n==================== E-Wallet ====================");
        System.out.println(inv1);
        System.out.println("\n==================== Bank ====================");
        System.out.println(bank1);
    }
}
