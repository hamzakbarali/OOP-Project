package MovieReview;

import java.util.List;

/**
 * @author Hamza Akbar
 */
public interface StoreData {
    
   public boolean saveMovies(List<Movie> movies);
   
   public List<Movie> loadMovies();
   
   public boolean saveUsers(List<User> users);
   
   public List<User> loadUsers();
}
