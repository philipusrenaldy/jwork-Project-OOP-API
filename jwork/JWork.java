/**
 * @Author: Your name
 * @Date:   2021-03-04 17:34:37
 * @Last Modified by:   Your name
 * @Last Modified time: 2021-03-27 09:47:34
 */

/**
 * Write a description of class JWork here.
 *
 * @author Philipus Kristian Renaldy
 * @version 27 - 3 - 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "Mobile Development", recruiter1, 1000000, JobCategory.UI);
        Jobseeker jobseeker1 = new Jobseeker(3, "BlueBlue", "blublu@gmail.com", "secret", "27/3/2021");
        Invoice inv1 = new Invoice(1, job1.getId(), "27/3/2021", 1000000, jobseeker1, PaymentType.BankPayment, InvoiceStatus.OnGoing);
        inv1.printData();
    }
}
