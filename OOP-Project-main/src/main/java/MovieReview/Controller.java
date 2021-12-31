/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieReview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hamza Akbar
 */
public class Controller {
    public static List<User> users = new ArrayList<User>();
    public static List<Movie> movies = new ArrayList<Movie>();
    public static User activeUser;
    public static int reviewCount = 0;
    
    public static void populateMovies(){
        movies.add(new Movie("Batman", "The Dark Knight of Gotham City begins his war on crime with his first major enemy being Jack Napier, a criminal who becomes the clownishly homicidal Joker.", "https://i.guim.co.uk/img/media/57e138d1979b0d1bdb1400bc5906524d7b5844b2/0_140_651_390/master/651.jpg?width=445&quality=45&auto=format&fit=max&dpr=2&s=e2fecad09e62010ee973af51129d72b2", "1989"));
        movies.add(new Movie("Dead Silence","A young widower returns to his hometown to search for answers to his wife's murder, which may be linked to the ghost of a deceased ventriloquist","https://cdn.britannica.com/s:400x225,c:crop/49/127649-050-CCE87173/Heath-Ledger-Joker-Christian-Bale-Batman-2008.jpg",  "2007"));
    }
    public static void setDataFromFile(){
       StoreData storeData = new StoreDataImpl();
       movies = storeData.loadMovies();
       users = storeData.loadUsers();
    }
    
    public static boolean saveDataToFile(){
        StoreData storeData = new StoreDataImpl();
        boolean isSaved = storeData.saveMovies(movies) && storeData.saveUsers(users);
        return isSaved;
    }
    
    public static void addMovie(Movie movie){
        movies.add(movie);
    }

    public static void setActiveUser(User activeUser) {
        Controller.activeUser = activeUser;
    }
    
    public static void signOut(){
        Controller.activeUser = null;
    }
    
    public static boolean isUserLoggedIn(){
        return activeUser != null;
    }
    
}
