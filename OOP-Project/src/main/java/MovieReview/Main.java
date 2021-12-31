package MovieReview;
import GUI.HomePage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * @author Hamza Akbar
 */
public class Main {
    public static void main(String[] args) {
//        Controller.populateMovies();
        Controller.setDataFromFile();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
        
    }
    
}
