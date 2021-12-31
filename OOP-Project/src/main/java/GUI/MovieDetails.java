package GUI;
import MovieReview.Controller;
import MovieReview.Movie;
import java.awt.Color;

/**
 * @author Hamza Akbar
 */
public class MovieDetails extends javax.swing.JFrame {
    private Movie movie;
    
    public MovieDetails(Movie movie) {
        this.movie = movie;
        initComponents();
        addMovie(movie);
    }
    public void addMovie(Movie movie){
        movieNameLabel.setText(movie.getName());
        releaseDateLabel.setText("(" + movie.getReleaseDate() + ")");       
        descriptionLabel.setText("<html><em> <p style=\"color: red;\">" + movie.getSynopsis() + "</p></em></html");
        posterLinkLabel.setText("<html><img style=\"width: 50; height: 50;\" src=\"" + movie.getPosterURL() + "\"></html>");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        movieNameLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        releaseDateLabel = new javax.swing.JLabel();
        posterLinkLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userReviewsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));

        movieNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        movieNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieNameLabel.setText("NAME");

        descriptionLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("STORY LINE");

        releaseDateLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        releaseDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        releaseDateLabel.setText("Release Date");

        posterLinkLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        posterLinkLabel.setForeground(new java.awt.Color(255, 255, 255));
        posterLinkLabel.setText("Poster URL");

        backBtn.setBackground(new java.awt.Color(57, 73, 99));
        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");

        userReviewsBtn.setBackground(new java.awt.Color(57, 73, 99));
        userReviewsBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        userReviewsBtn.setForeground(new java.awt.Color(255, 255, 255));
        userReviewsBtn.setText("User Reviews");
        userReviewsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userReviewsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addGap(273, 273, 273)
                .addComponent(movieNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(releaseDateLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(posterLinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(userReviewsBtn)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieNameLabel)
                    .addComponent(releaseDateLabel)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(58, 58, 58)
                .addComponent(posterLinkLabel)
                .addGap(39, 39, 39)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(userReviewsBtn)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
//        backBtn.setForeground(Color.white);
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void userReviewsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userReviewsBtnActionPerformed
        this.setVisible(false);
        new UserReviewsPage(movie).setVisible(true);
    }//GEN-LAST:event_userReviewsBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JLabel posterLinkLabel;
    private javax.swing.JLabel releaseDateLabel;
    private javax.swing.JButton userReviewsBtn;
    // End of variables declaration//GEN-END:variables
}
