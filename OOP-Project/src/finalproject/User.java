/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;
/**
 *
 * @author Hamza Akbar
 */
public class User {
    private String userID;
    private String userName;
    private String userDisplayPhotoURL;
    private List<Rating> ratingsGiven;

    public User(String userID, String userName, String userDisplayPhotoURL, List<Rating> ratingsGiven) {
        this.userID = userID;
        this.userName = userName;
        this.userDisplayPhotoURL = userDisplayPhotoURL;
        this.ratingsGiven = ratingsGiven;
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

    public List<Rating> getRatingsGiven() {
        return ratingsGiven;
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
    
    
}
