package MovieReview;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author Hamza Akbar
 */
public class User implements Serializable{
    private String userID;
    private String userName;
    private String userDisplayPhotoURL;
    private List<Review> reviewsGiven;
    private String email;
    private String password;
    private String role;

    public User(String userName, String email, String password, String role) {
        this.userID = userName.length() + userName + userName.length();
        this.userName = userName;
        this.userDisplayPhotoURL = "";
        this.reviewsGiven = new ArrayList<Review>();
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserDisplayPhotoURL() {
        return userDisplayPhotoURL;
    }

    public List<Review> getReviewsGiven() {
        return reviewsGiven;
    }

    public String getRole() {
        return role;
    }
    
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserDisplayPhotoURL(String userDisplayPhotoURL) {
        this.userDisplayPhotoURL = userDisplayPhotoURL;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
