/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class Recruiter
{
    // instance variables dari class recruiter
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor for objects of class Recruiter
     * @param id berisi data id penguji
     * @param name berisi data nama penguji
     * @param email berisi data email penguji
     * @param phoneNumber berisi data nomor telepon penguji
     * @param location berisi data lokasi penguji
     */

    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
       * method ini digunakan untuk mengambil data id penguji
       * @param id 
       * @return void
       */
    public int getId()
    {
        return this.id;
    }
    /**
       * method ini digunakan untuk mengambil data nama penguji
       * @param name 
       * @return void
       */
    public String getName()
    {
        return this.name;
    }   
    /**
       * method ini digunakan untuk mengambil data email penguji
       * @param email 
       * @return void
       */
    public String getEmail()
    {
        return this.email;
    }
    /**
       * method ini digunakan untuk mengambil data nomor telepon penguji
       * @param phoneNumber 
       * @return void
       */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    /**
       * method ini digunakan untuk mengambil data lokasi penguji
       * @param location 
       * @return void
       */
    public Location getLocation()
    {
        return this.location;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada id penguji
       * @param id 
       */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada email penguji
       * @param email 
       */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada nama penguji
       * @param name
       */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada nomor telepon penguji
       * @param phoneNumber 
       */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada lokasi penguji
       * @param location
       */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
       * method ini digunakan untuk melakukan output tulisan yang merujuk pada nama penguji
       * @param getName 
       */
    public void printData() 
    {
        System.out.println(getName());
    }
}
