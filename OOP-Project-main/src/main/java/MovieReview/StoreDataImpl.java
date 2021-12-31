/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieReview;

import static MovieReview.Controller.movies;
import static MovieReview.Controller.users;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
public class StoreDataImpl implements StoreData{
    
    public boolean saveMovies(List<Movie> movies){
        
        try {
            File movieFile = new File("Movies.dat");
            movieFile.createNewFile();
            FileOutputStream outputFile = new FileOutputStream("Movies.dat");
            ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);

            outputObject.writeObject(movies);

            outputObject.close();
            outputFile.close();
            
            return true;

            
        } catch (IOException e) {
            System.out.println(e);
        }
       return false;
    }
    
    public boolean saveUsers(List<User> users){
        try {
            File reviewFile = new File("Users.dat");
            reviewFile.createNewFile();
            FileOutputStream outputFile = new FileOutputStream("Users.dat");
            ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);

            outputObject.writeObject(users);

            outputObject.close();
            outputFile.close();

            return true;

        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<Movie> loadMovies(){
        List<Movie> movies = new ArrayList<Movie>();
        try {
            
            FileInputStream inputFile = new FileInputStream("Movies.dat");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);

            movies = (ArrayList<Movie>) inputObject.readObject();

            inputObject.close();
            inputFile.close();

            System.out.println(movies.toString());
            
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException is caught");
        }
        return movies;
    }
        public List<User> loadUsers(){
            List<User> users = new ArrayList<User>();
        try {

            FileInputStream inputFile = new FileInputStream("Users.dat");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);

            users = (ArrayList<User>) inputObject.readObject();

            inputObject.close();
            inputFile.close();

            System.out.println(movies.toString());
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");        }
        return users;
    }
}
