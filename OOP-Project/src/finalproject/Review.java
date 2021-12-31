/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author madih
 */
public class Review extends Rating{
    private String text;
    private String title;
    private User user;
    private String reviewDate;

    public Review(String text, String title, User user, String reviewDate, double rating) {
        super(rating);
        this.text = text;
        this.title = title;
        this.user = user;
        this.reviewDate = reviewDate;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}