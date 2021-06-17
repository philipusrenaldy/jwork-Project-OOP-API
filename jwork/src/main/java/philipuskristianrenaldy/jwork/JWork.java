package philipuskristianrenaldy.jwork;

import java.util.GregorianCalendar;
import javax.xml.crypto.Data;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("Jawa Barat", "Kota Bekasi", "Bekasi Utara");
        Location location2 = new Location("DKI Jakarta", "DKI Jakarta", "DKI Jakarta");
        Location location3 = new Location("Bali", "Denpasar", "Denpasar");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Kristian", "kristian.philipus@ui.ac.id", "081297204160", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Philipus", "philipus.renaldy@ui.ac.id", "081234567890", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Renaldy", "philipus.kristian@ui.ac.id", "081334567890", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer 1", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Backend Engineer 2", DatabaseRecruiter.getRecruiterById(2), 30000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "Frontend Engineer 1", DatabaseRecruiter.getRecruiterById(3), 20000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "Data Analyst 1", DatabaseRecruiter.getRecruiterById(3), 40000, JobCategory.DataAnalyst));
            DatabaseBonus.addBonus(new Bonus(1, "AKUBAHAGIA", 10000, 1000, true));
        } catch (RecruiterNotFoundException | ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        //Testing Insert Data to PostgreSQL
        /*DatabaseJobseekerPostgre.addJobseeker(new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, "Philipus", "philipus.kristian@ui.ac.id",
                "Mantab600", 2021, 3, 6));*/
        SpringApplication.run(JWork.class, args);
    }
}