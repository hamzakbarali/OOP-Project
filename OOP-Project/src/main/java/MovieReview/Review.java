package MovieReview;

import java.io.Serializable;

/**
 *
 * @author Hamza Akbar
 */
public class Review implements Serializable{
    private String text;
    private String title;
    private User user;
    private String reviewDate;
    private Rating rating;

    public Review(String text, String title, User user, String reviewDate, Rating rating) {
        this.text = text;
        this.title = title;
        this.user = user;
        this.reviewDate = reviewDate;
        this.rating = rating;
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
    
    public Rating getRating(){
        return this.rating;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setRating(double value){
        this.rating = new Rating(value);
    }
}
