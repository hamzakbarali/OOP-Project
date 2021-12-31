package MovieReview;

import java.io.Serializable;

/**
 * @author Hamza Akbar
 */
public class Rating implements Serializable{
    private double rating;

    public Rating(double rating) {
        this.rating = rating;
    }
    
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
