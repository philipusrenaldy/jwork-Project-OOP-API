/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class DatabaseJob {
    // instance variables dari class DatabaseJob
    private String[] listJob;
    
    /**
     * Constructor for objects of class DatabaseJob
     * @param listJob berisi total Job
     */
    public DatabaseJob()
    {
       listJob = new String[100];
    }
    /**
     * method ini digunakan untuk mengambil data job
     * @param listJob berisi total Job
     */
    public DatabaseJob(String[] listJob)
    {
        this.listJob = listJob;
    }
    /**
     * method ini digunakan untuk mengisi data job
     * @param listJob berisi total Job
     * @return false
     */    
    public boolean addJob(Job job)
    {
        return false;
    }
    /**
     * method ini digunakan untuk menghapus data job
     * @param listJob berisi total Job
     * @return false
     */    
    public boolean remove(Job job)
    {
        return false;
    }
    /**
       * method ini digunakan untuk mengambil data job
       * @param job 
       * @return null
       */
    public Job getJob()
    {
        return null;
    }
    /**
       * method ini digunakan untuk mengambil data joblist
       * @param listJob 
       * @return void
       */
    public String[] getListJob()
    {
        return listJob;
    }
}

