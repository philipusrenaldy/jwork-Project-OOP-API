package philipuskristianrenaldy.jwork;

public class RecruiterNotFoundException extends Exception{

    private int recruiter_error;
    public RecruiterNotFoundException(int recruiter_error)
    {
        super("Recruiter Id: ");
        this.recruiter_error = recruiter_error;
    }

    public String getMessage()
    {
        return super.getMessage() + recruiter_error + " Not Found";
    }
}