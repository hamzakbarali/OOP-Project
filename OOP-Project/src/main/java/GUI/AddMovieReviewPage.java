package GUI;

import MovieReview.Controller;
import MovieReview.InvalidInputException;
import MovieReview.Movie;
import MovieReview.Rating;
import MovieReview.Review;
import MovieReview.User;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

/**
 * @author Hamza Akbar
 */
public class AddMovieReviewPage extends javax.swing.JFrame {
    private String username;
    private Movie movie;
    
    public AddMovieReviewPage(String username) {
        this.movie = null;
        this.username = username;
        initComponents();
        addNewMovieBtn.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topHeading = new javax.swing.JLabel();
        movieLabel = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        reviewLabel = new javax.swing.JLabel();
        movieNameField = new javax.swing.JTextField();
        ratingField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        addNewMovieBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        reviewTitleLabel = new javax.swing.JLabel();
        reviewTitleField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));

        topHeading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        topHeading.setForeground(new java.awt.Color(255, 255, 255));
        topHeading.setText("Add a Review");

        movieLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        movieLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieLabel.setText("Movie Name");

        ratingLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel.setText("Rating");

        reviewLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        reviewLabel.setForeground(new java.awt.Color(255, 255, 255));
        reviewLabel.setText("Review");

        movieNameField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        ratingField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        reviewTextArea.setColumns(20);
        reviewTextArea.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        reviewTextArea.setRows(5);
        jScrollPane1.setViewportView(reviewTextArea);

        submitBtn.setBackground(new java.awt.Color(57, 73, 99));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        addNewMovieBtn.setBackground(new java.awt.Color(57, 73, 99));
        addNewMovieBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addNewMovieBtn.setForeground(new java.awt.Color(255, 255, 255));
        addNewMovieBtn.setText("Add New Movie");
        addNewMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMovieBtnActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setBackground(new java.awt.Color(57, 73, 99));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        reviewTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        reviewTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        reviewTitleLabel.setText("Review Title");

        reviewTitleField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(backBtn)
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(topHeading))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(movieNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(submitBtn)
                        .addGap(55, 55, 55)
                        .addComponent(addNewMovieBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(movieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reviewLabel)
                            .addComponent(ratingLabel)
                            .addComponent(reviewTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(reviewTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topHeading)
                    .addComponent(backBtn))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieLabel)
                    .addComponent(movieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reviewTitleLabel)
                    .addComponent(reviewTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingLabel)
                    .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(reviewLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(addNewMovieBtn))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(movieNameField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter the name of the movie you wish to review");
        }
        else if(ratingField.getText().trim().isEmpty()){
            errorLabel.setText("Please, rate the movie on a scale of 1 to 10");
        }
        else if(reviewTitleField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter the review title");
        }
        else if(reviewTextArea.getText().trim().isEmpty()){
            errorLabel.setText("Please, review the movie");
        }
        else{
            boolean alreadyExists = false;
            for(Movie movie: Controller.movies){
                if(movie.getName().toLowerCase().equals(movieNameField.getText().trim().toLowerCase())){
                    alreadyExists = !alreadyExists;
                    this.movie = movie;
                }
            }
            if(!alreadyExists){
                errorLabel.setText("The movie you entered does not seem to exist. Would you like to add it to the collection?");
                addNewMovieBtn.setVisible(true);
            }
            else{
                try{
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                    double rating = Double.parseDouble(ratingField.getText().trim());
                    for(User user: Controller.users){
                        if(user.getUserName().equals(username)){
                            movie.addReview(new Review(reviewTextArea.getText().trim(), reviewTitleField.getText().trim(), user, dtf.format(LocalDateTime.now()) + "", new Rating(rating)));
                            this.setVisible(false);
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    new HomePage().setVisible(true);
                                }
                            });
                        }
                    } 
                }
                catch(IllegalArgumentException e){
                    errorLabel.setText("The rating can only be between 1 and 10 (inclusive)");
                }
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void addNewMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMovieBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddMovie(username).setVisible(true);
    }//GEN-LAST:event_addNewMovieBtnActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewMovieBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JTextField movieNameField;
    private javax.swing.JTextField ratingField;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel reviewLabel;
    private javax.swing.JTextArea reviewTextArea;
    private javax.swing.JTextField reviewTitleField;
    private javax.swing.JLabel reviewTitleLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel topHeading;
    // End of variables declaration//GEN-END:variables
}
