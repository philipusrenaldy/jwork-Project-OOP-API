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
        System.out.println("==================== Jobseeker 1 ====================");
        System.out.println(jobseeker1);
        System.out.println("==================== Jobseeker 2 ====================");
        System.out.println(jobseeker2);
        System.out.println("==================== Jobseeker 3 ====================");
        System.out.println(jobseeker3);
        
        jobseeker1.setEmail("philipus.kristian@ui.ac.id");
        jobseeker1.setPassword("PhilipusK1");
        
        System.out.println("==================== Jobseeker 1 FIXED ====================");
        System.out.println(jobseeker1);
    }
}
