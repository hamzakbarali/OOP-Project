/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;
/**
 *
 * @author madih
 */
public class Movie {

    private String name;
    private String description;
    private String trailerURL;
    private String posterURL;
    private String releaseDate;
    private double averageRating;
    private List<Rating> ratings;
    private List<Review> reviews;

    public Movie(String name, String description, String trailerURL, String posterURL, String releaseDate, double averageRating, List<Rating> ratings, List<Review> reviews) {
        this.name = name;
        this.description = description;
        this.trailerURL = trailerURL;
        this.posterURL = posterURL;
        this.releaseDate = releaseDate;
        this.averageRating = averageRating;
        this.ratings = ratings;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrailerURL() {
        return trailerURL;
    }

    public void setTrailerURL(String trailerURL) {
        this.trailerURL = trailerURL;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    
    public void addRating(Rating rating){
        ratings.add(rating);
    }
    
    public void addReview(Review review){
        reviews.add(review);
    }
    
//    public double calculateAverageRating(){
//        
//        for(int i = 0; i<ratings.size(); i++){
//             averageRating = (averageRating + ratings.get(i))/i;
//        }
//        return averageRating;
//    }
}
