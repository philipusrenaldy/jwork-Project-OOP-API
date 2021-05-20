package philipuskristianrenaldy.jwork;

import java.util.ArrayList;

/**
 * Write a description of class DatabaseJobSeeker here.
 *
 * @author Philipus Kristian Renaldy
 * @version 25 - 3 - 2021
 */
public class DatabaseJobSeeker {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobDatabase() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker jobseeker1 : JOBSEEKER_DATABASE) {
            if (jobseeker1.getEmail().equals(jobseeker.getEmail())) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
            throw new JobSeekerNotFoundException(id);
        }
        return false;
    }

    public static Jobseeker getJobseekerLogin(String email, String password) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }
}
