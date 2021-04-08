/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (18 - 3 - 2021)
 */
public class Location
{
    // instance variables dari class location
    private String province;
    private String city;
    private String description;
    
    /**
     * Constructor for objects of class Location
     * @param province berisi data provinsi
     * @param city berisi data kota
     * @param description berisi data deskripsi
     */
    
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
       * method ini digunakan untuk mengambil data provinsi
       * @param province 
       * @return void
       */
    public String getProvince()
    {
        return this.province;
    }
    /**
       * method ini digunakan untuk mengambil data kota
       * @param city 
       * @return void
       */
    public String getCity()
    {
        return this.city;
    }
    /**
       * method ini digunakan untuk mengambil data deskripsi kota
       * @param city 
       * @return void
       */
    public String getDescription()
    {
        return this.description;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada provinsi
       * @param province 
       */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada kota
       * @param city 
       */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada deskripsi kota
       * @param desciption 
       */
    public void setDescription(String description)
    {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Province = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}
