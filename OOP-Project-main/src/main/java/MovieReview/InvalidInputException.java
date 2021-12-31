package MovieReview;

/**
 * @author Hamza Akbar
 */
public class InvalidInputException extends Exception{
    private String errorMsg;

    public InvalidInputException(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    public String toString(){
        return this.errorMsg;
    }
}
