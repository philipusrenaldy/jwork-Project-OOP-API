/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class Jobseeker
{
    // instance variables dari class jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id berisi data id pendaftar
     * @param name berisi data nama pendaftar
     * @param email berisi data email pendaftar
     * @param phoneNumber berisi data password pendaftar
     * @param location berisi data waktu pendaftar
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
       * method ini digunakan untuk mengambil data id pendaftar
       * @param id 
       * @return void
       */
    public int getId()
    {
        return this.id;
    }
    /**
       * method ini digunakan untuk mengambil data nama pendaftar
       * @param name 
       * @return void
       */
    public String getName()
    {
        return this.name;
    }
    /**
       * method ini digunakan untuk mengambil data email pendaftar
       * @param email 
       * @return void
       */
    public String getEmail()
    {
        return this.email;
    }
    /**
       * method ini digunakan untuk mengambil data password pendaftar
       * @param password 
       * @return void
       */
    public String getPassword()
    {
        return this.password;
    }
    /**
       * method ini digunakan untuk mengambil data waktu pendaftar
       * @param joinDate
       * @return void
       */
     public String getJoinDate()
    {
        return this.joinDate;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada id pendaftar
       * @param id 
       */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada nama pendaftar
       * @param name 
       */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada email pendaftar
       * @param email
       */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada password pendaftar
       * @param password
       */
    public void setPassword(String password)
    {
        this.password = password;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada waktu pendaftar
       * @param joinDate
       */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
       * method ini digunakan untuk melakukan output tulisan yang merujuk pada nama pendaftar
       * @param getName 
       */
    public void printData()
    {
        System.out.println(getName());
    }
}
