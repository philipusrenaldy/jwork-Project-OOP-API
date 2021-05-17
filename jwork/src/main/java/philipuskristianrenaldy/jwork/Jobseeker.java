package philipuskristianrenaldy.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a description of class JWork here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (8 - 4 - 2021)
 */
public class Jobseeker
{
    // instance variables dari class jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id berisi data id pendaftar
     * @param name berisi data nama pendaftar
     * @param email berisi data email pendaftar
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }

    /**
       * method ini digunakan untuk mengambil data id pendaftar
       * @return void
       */
    public int getId()
    {
        return id;
    }
    /**
       * method ini digunakan untuk mengambil data nama pendaftar
       * @return void
       */
    public String getName()
    {
        return name;
    }
    /**
       * method ini digunakan untuk mengambil data email pendaftar
       * @return void
       */
    public String getEmail()
    {
        return email;
    }
    /**
       * method ini digunakan untuk mengambil data password pendaftar
       * @return void
       */
    public String getPassword()
    {
        return password;
    }
    /**
       * method ini digunakan untuk mengambil data waktu pendaftar
       * @return void
       */
     public Calendar getJoinDate()
    {
        return joinDate;
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
        String emailregex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(emailregex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
          this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada password pendaftar
       * @param password
       */
    public void setPassword(String password)
    {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
        {
            this.password = password;
        }
        else
        {
            this.password = "";
        }
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada waktu pendaftar
       * @param joinDate
       */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
       * method ini digunakan untuk melakukan set nilai pada waktu pendaftar
       * @param year, month, dayOfMonth
       */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }

    @Override
    public String toString()
    {
        if (this.joinDate == null)
        {
            return "\nId = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() +"\n";
        }
        else
        {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd MMMM yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "\nId = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() + "\nJoin Date = " + date + "\n";
        }
    }

}
