/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class Invoice
{
    // instance variables dari class Invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor for objects of class Invoice
     * @param id berisi data id invoice
     * @param idJob berisi data idJob invoice
     * @param date berisi data waktu invoice
     * @param totalFee berisi data harga invoice
     * @param jobseeker merujuk pada list jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }
    
    /**
       * method ini digunakan untuk mengambil data id invoice
       * @param id 
       * @return void
       */
    public int getId()
    {
        return id;
    }
    /**
       * method ini digunakan untuk mengambil data idjob invoice
       * @param idJob 
       * @return void
       */
    public int getIdJob()
    {
        return idJob;
    }
    /**
       * method ini digunakan untuk mengambil data date invoice
       * @param date 
       * @return void
       */
    public String getDate()
    {
        return date;
    }
    /**
       * method ini digunakan untuk mengambil data total fee invoice
       * @param totalFee 
       * @return void
       */
    public int getTotalFee()
    {
        return totalFee;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada id invoice
       * @param id 
       */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada idjob invoice
       * @param idJob
       */
    public void setIdJobs(int idJobs)
    {
        this.idJob = idJobs;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada waktu invoice
       * @param date 
       */
    public void setDate(String date)
    {
        this.date = date;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada total fee invoice
       * @param totalFee
       */
    public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }
    /**
       * method ini digunakan untuk mengambil data jobseeker invoice
       * @param Jobseeker 
       * @return void
       */
    public Jobseeker getJobseeker() 
    {
        return jobseeker;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada jobseeker invoice
       * @param Jobseeker
       */
    public void setJobseeker(Jobseeker jobseeker) 
    {
        this.jobseeker = jobseeker;
    }
    public void printData()
    {
    
    }
}
