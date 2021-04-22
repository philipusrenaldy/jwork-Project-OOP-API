import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (22 - 4 - 2021)
 */
public abstract class Invoice
{
    // instance variables dari class Invoice
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus InvoiceStatus;

    /**
     * Constructor for objects of class Invoice
     * @param id berisi data id invoice
     * @param idJob berisi data idJob invoice
     * @param date berisi data waktu invoice
     * @param totalFee berisi data harga invoice
     * @param jobseeker merujuk pada list jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
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
       * @param job 
       * @return void
       */
    public ArrayList<Job> getJobs(){
        return jobs;
    }
    /**
       * method ini digunakan untuk mengambil data date invoice
       * @param date 
       * @return void
       */
    public Calendar getDate()
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
       * method ini digunakan untuk mengambil data jobseeker invoice
       * @param PaymentType 
       * @return void
       */
    public abstract PaymentType getPaymentType();
    /**
       * method ini digunakan untuk mengambil data jobseeker invoice
       * @param InvoiceStatus 
       * @return void
        */
    public InvoiceStatus getInvoiceStatus() 
    {
        return InvoiceStatus;
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
    public void setJob(ArrayList<Job> jobs)
    {
        this.jobs = jobs;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada waktu invoice
       * @param date 
       */
    public void setDate(Calendar date)
    {
        this.date = Calendar.getInstance();
    }
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada total fee invoice
       * @param totalFee
       */
    public abstract void setTotalFee();
    /**
       * method ini digunakan untuk melakukan set nilai pada jobseeker invoice
       * @param Jobseeker
       */
    public void setJobseeker(Jobseeker jobseeker) 
    {
        this.jobseeker = jobseeker;
    }
    /**
        * method ini digunakan untuk melakukan set nilai pada jobseeker invoice
        * @param InvoiceStatus
        */
    public void setInvoiceStatus(InvoiceStatus InvoiceStatus) 
    {
       this.InvoiceStatus = InvoiceStatus;
    }
    public abstract String toString();
}
