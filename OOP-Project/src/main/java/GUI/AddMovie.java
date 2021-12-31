package GUI;

import MovieReview.Controller;
import MovieReview.Movie;

/**
 * @author Hamza Akbar
 */
public class AddMovie extends javax.swing.JFrame {
    private String username;

    public AddMovie(String username) {
        this.username = username;
        initComponents();
    }
    
    public void addToMovieList() {
        if(movieNameField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter the name of the movie you wish to add");
        }
        else if(moviePosterField.getText().trim().isEmpty()){
            errorLabel.setText("Please, upload the movie poster");
        }
        else if(movieReleaseDateField.getText().trim().isEmpty()){
            errorLabel.setText("Please, add the movie release date.");
        }
        else if(synopsisField.getText().trim().isEmpty()){
            errorLabel.setText("Please, add the movie synopsis");
        }
        else{
            Movie movie = new Movie(movieNameField.getText(), synopsisField.getText(), moviePosterField.getText(), movieReleaseDateField.getText());
            Controller.addMovie(movie);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topHeading = new javax.swing.JLabel();
        movieNameLabel = new javax.swing.JLabel();
        synopsisLabel = new javax.swing.JLabel();
        movieNameField = new javax.swing.JTextField();
        releaseDateLabel = new javax.swing.JLabel();
        moviePosterField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        synopsisField = new javax.swing.JTextArea();
        moviePosterlLabel = new javax.swing.JLabel();
        movieReleaseDateField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        addMovieBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));
        jPanel1.setPreferredSize(new java.awt.Dimension(1009, 512));

        topHeading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        topHeading.setForeground(new java.awt.Color(255, 255, 255));
        topHeading.setText("Add a New Movie");

        movieNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        movieNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieNameLabel.setText("Movie Name");

        synopsisLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        synopsisLabel.setForeground(new java.awt.Color(255, 255, 255));
        synopsisLabel.setText("Synopsis");

        movieNameField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        releaseDateLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        releaseDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        releaseDateLabel.setText("Release date");

        moviePosterField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        synopsisField.setColumns(20);
        synopsisField.setRows(5);
        jScrollPane1.setViewportView(synopsisField);

        moviePosterlLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        moviePosterlLabel.setForeground(new java.awt.Color(255, 255, 255));
        moviePosterlLabel.setText("Movie Poster");

        movieReleaseDateField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        backBtn.setBackground(new java.awt.Color(57, 73, 99));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addMovieBtn.setBackground(new java.awt.Color(57, 73, 99));
        addMovieBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        addMovieBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMovieBtn.setText("Add");
        addMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieBtnActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(backBtn)
                        .addGap(264, 264, 264)
                        .addComponent(topHeading))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(synopsisLabel)
                            .addComponent(moviePosterlLabel)
                            .addComponent(releaseDateLabel)
                            .addComponent(movieNameLabel))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(moviePosterField)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                                .addComponent(movieReleaseDateField)
                                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(addMovieBtn)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topHeading)
                    .addComponent(backBtn))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(movieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(releaseDateLabel))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(moviePosterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(synopsisLabel))
                                .addGap(53, 53, 53)
                                .addComponent(errorLabel)
                                .addGap(18, 18, 18)
                                .addComponent(addMovieBtn))
                            .addComponent(moviePosterlLabel)))
                    .addComponent(movieNameLabel))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false); 
        new AddMovieReviewPage(this.username).setVisible(true); 
    }//GEN-LAST:event_backBtnActionPerformed

    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        if(movieNameField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter the name of the movie you wish to add");
        }
        else if(movieReleaseDateField.getText().trim().isEmpty()){
            errorLabel.setText("Please, add the movie release date");
        }
        else if(moviePosterField.getText().trim().isEmpty()){
            errorLabel.setText("Please, upload the movie poster");
        }
        else if(synopsisField.getText().trim().isEmpty()){
            errorLabel.setText("Please, add the movie synopsis");
        }
        else{
            Movie movie = new Movie(movieNameField.getText(), synopsisField.getText(), moviePosterField.getText(), movieReleaseDateField.getText());
            Controller.addMovie(movie);
            this.setVisible(false);
            new HomePage().setVisible(true);
        }
    }//GEN-LAST:event_addMovieBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField movieNameField;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JTextField moviePosterField;
    private javax.swing.JLabel moviePosterlLabel;
    private javax.swing.JTextField movieReleaseDateField;
    private javax.swing.JLabel releaseDateLabel;
    private javax.swing.JTextArea synopsisField;
    private javax.swing.JLabel synopsisLabel;
    private javax.swing.JLabel topHeading;
    // End of variables declaration//GEN-END:variables
}
