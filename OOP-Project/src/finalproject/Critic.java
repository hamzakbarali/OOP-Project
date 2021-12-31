/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.List;

/**
 *
 * @author madih
 */
public class Critic extends User{
    private String Organization;
    private String designation;

    public Critic(String Organization, String designation, String userID, String userName, String userDisplayPhotoURL, List<Rating> ratingsGiven) {
        super(userID, userName, userDisplayPhotoURL, ratingsGiven);
        this.Organization = Organization;
        this.designation = designation;
    }

    public String getOrganization() {
        return Organization;
    }

    public String getDesignation() {
        return designation;
    }
    
    
}
