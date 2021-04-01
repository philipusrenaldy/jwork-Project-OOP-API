
/**
 * Write a description of class JWork here.
 *
 * @author Philipus Kristian Renaldy
 * @version 1 - 4 - 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "UI/UX", recruiter1, 1000, JobCategory.UI);
        Job job2 = new Job(1, "Mobile Development", recruiter1, 100000, JobCategory.FrontEnd);
        Jobseeker jobseeker1 = new Jobseeker(3, "BlueBlue", "blublu@gmail.com", "secret", "27/3/2021");
        
        Bonus bonus1 = new Bonus(123, "AKUBAHAGIA123", 20000, 30000, true);
        EwalletPayment inv1 = new EwalletPayment(1, job1, "1 April 2021", jobseeker1, bonus1, InvoiceStatus.OnGoing);
        EwalletPayment inv2 = new EwalletPayment(2, job1, "1 April 2021", jobseeker1, bonus1, InvoiceStatus.Finished);
        EwalletPayment inv3 = new EwalletPayment(3, job2, "2 April 2021", jobseeker1, bonus1, InvoiceStatus.OnGoing);  
        
        inv1.printData();
        inv2.printData();
        inv3.printData();
    }
}
