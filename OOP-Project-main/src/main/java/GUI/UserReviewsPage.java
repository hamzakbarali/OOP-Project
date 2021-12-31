package GUI;

import MovieReview.Controller;
import MovieReview.Movie;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import MovieReview.Controller;

/**
 *
 * @author Hamza Akbar
 */
public class UserReviewsPage extends javax.swing.JFrame {
    private Movie movie;
    
    public UserReviewsPage(Movie movie) {
        this.movie = movie;
        initComponents();
        displayData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        ratingLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Review Title");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("UsernameAndDate");

        textLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        textLabel.setForeground(new java.awt.Color(255, 255, 255));
        textLabel.setText("Review Text");
        textLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nextBtn.setBackground(new java.awt.Color(57, 73, 99));
        nextBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        ratingLabel.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel.setText("Rating");

        backBtn.setBackground(new java.awt.Color(57, 73, 99));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ratingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(nextBtn))
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(titleLabel)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addGap(37, 37, 37)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ratingLabel)
                .addGap(35, 35, 35)
                .addComponent(usernameLabel)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(backBtn))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(Controller.reviewCount == 0){
            this.setVisible(false);
            new MovieDetails(movie).setVisible(true);           
        }
        else{
            Controller.reviewCount--;
            this.setVisible(false);
            new UserReviewsPage(movie).setVisible(true);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if(Controller.reviewCount < movie.getReviews().size() - 1){
            ++Controller.reviewCount;
        }
        this.setVisible(false);
        new UserReviewsPage(movie).setVisible(true); 
    }//GEN-LAST:event_nextBtnActionPerformed

    public void displayData(){
        if(movie.getReviews().size() == 0){
            textLabel.setText("No reviews made so far");
        }
        else{
            titleLabel.setText(movie.getReviews().get(Controller.reviewCount).getTitle());
            ratingLabel.setText("Rating: " + movie.getReviews().get(Controller.reviewCount).getRating().getRating() + "");
            textLabel.setText(movie.getReviews().get(Controller.reviewCount).getText());
            usernameLabel.setText(movie.getReviews().get(Controller.reviewCount).getUser().getUserName() + "-" + movie.getReviews().get(Controller.reviewCount).getReviewDate());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
