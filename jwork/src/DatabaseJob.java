import java.util.ArrayList;
/**
 * Write a description of class DatabaseJob here.
 *
 * @author Philipus Kristian Renaldy
 * @version 22 - 4 - 2021
 */
public class DatabaseJob {
    // instance variables dari class DatabaseJob
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;
    
    /**
     * method ini digunakan untuk mengisi data job
     * @param job berisi total Job
     * @return false
     */    
    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    /**
     * method ini digunakan untuk menghapus data job
     * @param job berisi total Job
     * @return false
     */    
    public static boolean remove(Job job)
    {
        for (Job jobs : JOB_DATABASE) {
            if (job.getId() == jobs.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }
    /**
       * method ini digunakan untuk mengambil data job
       * @return null
       */
    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    /**
       * method ini digunakan untuk mengambil data joblist
       * @param id
       * @return void
       */
    public static Job getJobById(int id){
        Job temp = null;
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (id == JOB_DATABASE.get(i).getId()) {
                temp = JOB_DATABASE.get(i);
            }
        }
        return temp;
    }
    
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }
}