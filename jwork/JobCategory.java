
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author Philipus Kristian Renaldy
 * @version 25-3-2021
 */
public enum JobCategory {
    WebDeveloper("Web Developer"), FrontEnd("Front End"), BackEnd("Back End"), 
    UI("UI"), UX("UX"), Devops("Devops"), DataScientist("Data Scientist"), 
    DataAnalyst("Data Analyst");
   
    private String jobcategory;
    private JobCategory(String category) 
    {
        this.jobcategory = category;
    }
    
    public static void main(String[] args) {
        JobCategory kategori1 = JobCategory.WebDeveloper;
        JobCategory kategori2 = JobCategory.FrontEnd;
        JobCategory kategori3 = JobCategory.BackEnd;
        JobCategory kategori4 = JobCategory.UI;
        JobCategory kategori5 = JobCategory.UX;
        JobCategory kategori6 = JobCategory.Devops;
        JobCategory kategori7 = JobCategory.DataScientist;
        JobCategory kategori8 = JobCategory.DataAnalyst;
        System.out.println(kategori1);
        System.out.println(kategori2);
        System.out.println(kategori3);
        System.out.println(kategori4);
        System.out.println(kategori5);
        System.out.println(kategori6);
        System.out.println(kategori7);
        System.out.println(kategori8);
    }
}