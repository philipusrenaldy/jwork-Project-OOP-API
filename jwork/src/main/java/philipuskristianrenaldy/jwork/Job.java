package philipuskristianrenaldy.jwork;
/**
 * Write a description of class Job here.
 *
 * @author Philipus Kristian Renaldy
 * @version 25 - 3 - 2021
 */
public class Job
{
    // instance variables dari class Job
    private int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;
    
    /**
     * Constructor for objects of class Job
     * @param id berisi data id job
     * @param name berisi data nama job
     * @param fee berisi data fee job
     * @param category berisi data kategori job
     * @param recruiter merujuk pada list Recruiter
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
    }
    
    /**
       * method ini digunakan untuk mengambil data id job
       * @return void
       */
    public int getId()
    {
        return id;
    }
    /**
       * method ini digunakan untuk mengambil data nama job
       * @return void
       */
    public String getName()
    {
        return name;
    }
    /**
       * method ini digunakan untuk mengambil data fee job
       * @return void
       */
    public int getFee()
    {
        return fee;
    }
    /**
       * method ini digunakan untuk mengambil data kategori job
       * @return void
       */
    public JobCategory getCategory()
    {
        return category;
    }
    /**
       * method ini digunakan untuk mengambil data recruiter
       * @return void
       */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada id job
       * @param id
       */
    public void setId(int id)
    {
       this.id = id;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada nama job
       * @param name 
       */
    public void setName(String name)
    {
       this.name = name;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada recruiter
       * @param recruiter 
       */
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada fee job
       * @param fee 
       */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada kategori job
       * @param category 
       */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    @Override
    public String toString() {
        return "\nId = " + getId() + "\nName = " + getName() + "\nRecruiter = " + getRecruiter() + "\nCity= " + getRecruiter().getLocation().getCity() + "\nFee = " + getFee() + "\nCategory = " + getCategory();

    }
}
