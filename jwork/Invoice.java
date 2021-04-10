import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (10 - 4 - 2021)
 */
public abstract class Invoice
{
    // instance variables dari class Invoice
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     * @param id berisi data id invoice
     * @param idJob berisi data idJob invoice
     * @param date berisi data waktu invoice
     * @param totalFee berisi data harga invoice
     * @param jobseeker merujuk pada list jobseeker
     */
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
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
    public Job getJob(){
        return job;
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
        return invoiceStatus;
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
    public void setJob(Job job) 
    {
        this.job = job;
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
    public void setInvoiceStatus(InvoiceStatus status) 
    {
       this.invoiceStatus = invoiceStatus;
    }
    public abstract String toString();
}
