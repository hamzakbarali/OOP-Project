package MovieReview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamza Akbar
 */
public class Movie implements Serializable{
    private String name;
    private String synopsis;
    private String posterURL;
    private String releaseDate;
    private double averageRating;
    private ArrayList<Review> reviews;

    public Movie(String name, String synopsis, String posterURL, String releaseDate) {
        this.name = name;
        this.synopsis = synopsis;
        this.posterURL = posterURL;
        this.releaseDate = releaseDate;
        this.averageRating = 0;
        reviews = new ArrayList<Review>();
    }
     
    
    public String getName() {
        return name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getAverageRating() {
        return averageRating;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public void calculateAverageRating(){
        for(int i = 0; i < this.reviews.size(); i++){
            this.averageRating += reviews.get(i).getRating().getRating();
        }
        this.averageRating /= this.reviews.size();
    }
}
