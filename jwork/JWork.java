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
        Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        Job job1 = new Job(1, "Mobile Development", recruiter1, 1000000, "Programmer");
        Jobseeker jobseeker1 = new Jobseeker(1, "Kenny", "mtimotik@gmail.com", "mantab500", "18 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "18 Maret 2021", 2, jobseeker1);
        System.out.println(recruiter1.getName());
        recruiter1.setName("Hansaka");
        System.out.println(recruiter1.getName());
        job1.printData();
    }
}
