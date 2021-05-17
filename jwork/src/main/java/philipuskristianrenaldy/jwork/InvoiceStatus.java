package philipuskristianrenaldy.jwork;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Philipus Kristian Renaldy
 * @version 27 - 3 - 2021
 */
public enum InvoiceStatus
{
    OnGoing("On Going"),Finished("Finished"),Cancelled("Cancelled");
    
    private String invoice;
    private InvoiceStatus(String invoice) 
    {
        this.invoice = invoice;
    }
    
    @Override
    public String toString(){
        return invoice;
    }
    
    public static void main(String[] args)
    {
        InvoiceStatus inv1 = InvoiceStatus.OnGoing;
        InvoiceStatus inv2 = InvoiceStatus.Finished;
        InvoiceStatus inv3 = InvoiceStatus.Cancelled;
        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);
    }
}
