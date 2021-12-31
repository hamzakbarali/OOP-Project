package MovieReview;
import java.util.List;

/**
 *
 * @author Hamza Akbar
 */
public class Critic extends User{
    private String organization;
    private String designation;

    public Critic(String userName, String email, String password, String organization, String designation) {
        super(userName, email, password, "Critic");
        this.organization = organization;
        this.designation = designation;
    }

    public String getOrganization() {
        return organization;
    }

    public String getDesignation() {
        return designation;
    }
    
    
}
