/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class JWork
{
    public JWork()
    {
        
    }

    public static void main(String[] args)
    {
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Recruiter recruiter1 = new Recruiter(1, "Philipus", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "Philipus", recruiter1, 1000000, "Mobile Developer");
        Jobseeker jobseeker1 = new Jobseeker(1, "Philipus", "philipus.kristian@ui.ac.id", "mantab500", "18 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "18 Maret 2021", 2, jobseeker1);
    }
}
