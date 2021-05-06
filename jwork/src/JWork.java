//import java.util.GregorianCalendar;

import java.util.ArrayList;

/**
 * Write a description of class JWork here.
 *
 * @author Philipus Kristian Renaldy
 * @version 8 - 4 - 2021
 */
public class JWork {
    public static void main(String[] args) {

        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Kenny", "mtimotik@gmail.com", "081297204160", location1));
        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Philipus", "philipus.kristian@ui.ac.id", "PhilipusK2", 2021, 4, 22));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Philipus", "philipus.kristian@ui.ac.id", "PhilipusK2", 2021, 4, 22));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Mikael", "mtimotik@gmail.com", "Mantab500", 2021, 4, 20));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hansaka", "hansaka.wijaya@ui.ac.id", "HansakaK3", 2021, 4, 20));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "AKUBAHAGIA123", 20000, 30000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "AKUBAHAGIA123", 15000, 50000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobSeeker.removeJobseeker(5);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(7);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(8);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(10);
        } catch (BonusNotFoundException bonusNotFound) {
            System.out.println(bonusNotFound.getMessage());
        }
        System.out.println("\n==================== Database JobSeeker ====================");
        System.out.println(DatabaseJobSeeker.getJobDatabase());
        System.out.println("\n==================== Database Bonus ====================");
        System.out.println(DatabaseBonus.getBonusDatabase());
        System.out.println("\n=========================================================");

        ArrayList<Job> job1 = new ArrayList<Job>();
        ArrayList<Job> job2 = new ArrayList<Job>();
        try {
            job1.add(new Job(1, "Backend Engineer 1", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            job2.add(new Job(2, "Backend Engineer 2", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(10, job1, DatabaseJobSeeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(11, job2, DatabaseJobSeeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(12, job1, DatabaseJobSeeker.getJobseekerById(3)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }

        //System.out.println("\n==================== JobSeeker by Category ====================");
        //System.out.println(DatabaseJob.getJobByCategory(JobCategory.BackEnd));
        //Bonus bonus1 = new Bonus(123, "AKUBAHAGIA123", 20000, 30000, true);
        //Recruiter recruiter1 = new Recruiter(1, "Philipus Kristian Renaldy", "philipus.kristian@ui.ac.id", "081297204160", location1);
        //Job job1 = new Job(1, "UI/UX", recruiter1, 1000, JobCategory.UI);
        //Job job2 = new Job(1, "Mobile Development", recruiter1, 100000, JobCategory.FrontEnd);
        //EwalletPayment inv1 = new EwalletPayment(1, job1, jobseeker1, bonus1, InvoiceStatus.OnGoing);
        //EwalletPayment inv2 = new EwalletPayment(2, job1, jobseeker1, bonus1, InvoiceStatus.Finished);
        //EwalletPayment inv3 = new EwalletPayment(3, job2, jobseeker1, bonus1, InvoiceStatus.OnGoing);
        //inv1.setTotalFee();
        //inv2.setTotalFee();
        //inv3.setTotalFee();
        //bank1.setTotalFee();
        //bank2.setTotalFee();
        //System.out.println("==================== E-Wallet ====================");
        //System.out.println(inv1);
        //System.out.println(inv2);
        //System.out.println(inv3);
        //System.out.println("\n==================== Bank ====================");
        //System.out.println(bank1);
        //System.out.println(bank2);

        //Jobseeker jobseeker1 = new Jobseeker(1, "Philipus", "phlipus..@ui.ac.id", "philipus", new GregorianCalendar(2021, 4, 8));
        //Jobseeker jobseeker2 = new Jobseeker(2, "Kristian", "kristian@ui.ac.id", "PhilipusK2", 2021, 4, 8);
        //Jobseeker jobseeker3 = new Jobseeker(3, "Renaldy", "renaldy@ui.ac.id", "PhilipusK3");
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
    }
}
