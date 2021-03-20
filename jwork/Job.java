/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class Job
{
    // instance variables dari class Job
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;
    
    /**
     * Constructor for objects of class Job
     * @param id berisi data id job
     * @param name berisi data nama job
     * @param fee berisi data fee job
     * @param category berisi data kategori job
     * @param Recruiter merujuk pada list Recruiter
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
    }
    
    /**
       * method ini digunakan untuk mengambil data id job
       * @param id 
       * @return void
       */
    public int getId()
    {
        return id;
    }
    /**
       * method ini digunakan untuk mengambil data nama job
       * @param name 
       * @return void
       */
    public String getName()
    {
        return name;
    }
    /**
       * method ini digunakan untuk mengambil data fee job
       * @param fee 
       * @return void
       */
    public int getFee()
    {
        return fee;
    }
    /**
       * method ini digunakan untuk mengambil data kategori job
       * @param category 
       * @return void
       */
    public String getCategory()
    {
        return category;
    }
    /**
       * method ini digunakan untuk mengambil data recruiter
       * @param recruiter 
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
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void printData()
    {
        System.out.println(getName()); 
    }
}
