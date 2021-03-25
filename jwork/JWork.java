
/**
 * Write a description of class JWork here.
 *
 * @author Philipus Kristian Renaldy
 * @version 25 - 3 - 2021
 */
public class JWork
{
    public static void main(String[] args)
    {
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "Mobile Development", recruiter1, 1000000, JobCategory.UI);
        job1.printData();
    }
}
