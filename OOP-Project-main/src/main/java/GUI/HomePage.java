package GUI;

import MovieReview.Controller;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author Hamza Akbar
 */
public class HomePage extends javax.swing.JFrame {
    private String username;
    
    public HomePage() {
        initComponents();
        if(Controller.isUserLoggedIn()){
            loginBtn.setVisible(false);
            signupBtn.setVisible(false);
            signoutBtn.setVisible(true);
            addReviewBtn.setVisible(true);
        }
        else{
            loginBtn.setVisible(true);
            signupBtn.setVisible(true);
            signoutBtn.setVisible(false);
            addReviewBtn.setVisible(false);
        }
        if(Controller.isUserLoggedIn() && Controller.activeUser.getUserName().length() > 0){
            this.username = Controller.activeUser.getUserName();
            loggedinUsernameLabel.setText("Hello, " + this.username);    
        }
        else{
            this.username = "";
            loggedinUsernameLabel.setText(this.username);  
        }
        createButtons();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topHeading = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        signoutBtn = new javax.swing.JButton();
        loggedinUsernameLabel = new javax.swing.JLabel();
        addReviewBtn = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        saveDataBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        topHeading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        topHeading.setForeground(new java.awt.Color(255, 255, 255));
        topHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topHeading.setText("MovieSketch");

        loginBtn.setBackground(new java.awt.Color(57, 73, 99));
        loginBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signupBtn.setBackground(new java.awt.Color(57, 73, 99));
        signupBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(null);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        signoutBtn.setBackground(new java.awt.Color(57, 73, 99));
        signoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        signoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutBtn.setText("Sign Out");
        signoutBtn.setBorder(null);
        signoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutBtnActionPerformed(evt);
            }
        });

        loggedinUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        loggedinUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));

        addReviewBtn.setBackground(new java.awt.Color(57, 73, 99));
        addReviewBtn.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        addReviewBtn.setForeground(new java.awt.Color(255, 255, 255));
        addReviewBtn.setText("Add Review");
        addReviewBtn.setBorder(null);
        addReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReviewBtnActionPerformed(evt);
            }
        });

        saveDataBtn.setBackground(new java.awt.Color(57, 73, 99));
        saveDataBtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        saveDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveDataBtn.setText("Save");
        saveDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(loggedinUsernameLabel)
                .addGap(44, 44, 44)
                .addComponent(addReviewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(topHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(signupBtn)
                .addGap(18, 18, 18)
                .addComponent(signoutBtn)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveDataBtn)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topHeading)
                    .addComponent(loginBtn)
                    .addComponent(signupBtn)
                    .addComponent(signoutBtn)
                    .addComponent(loggedinUsernameLabel)
                    .addComponent(addReviewBtn))
                .addGap(46, 46, 46)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveDataBtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSignUpPage().setVisible(true);
            }
        });
    }//GEN-LAST:event_signupBtnActionPerformed

    private void signoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutBtnActionPerformed
        Controller.signOut();
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new HomePage().setVisible(true);
          }
        });
    }//GEN-LAST:event_signoutBtnActionPerformed

    private void addReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReviewBtnActionPerformed
        this.setVisible(false); 
        new AddMovieReviewPage(this.username).setVisible(true); 
    }//GEN-LAST:event_addReviewBtnActionPerformed

    private void saveDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataBtnActionPerformed
        // TODO add your handling code here:
        if(Controller.saveDataToFile()){
         JOptionPane.showMessageDialog(null, "Your data was saved successfully");
        }
        else {
            JOptionPane.showMessageDialog(null, "There was an error while saving the data");
        }
    }//GEN-LAST:event_saveDataBtnActionPerformed

    
    private void createButtons() {

        for (int i = 0; i < Controller.movies.size(); i++) {
            JButton moviebtn = new JButton();
            moviebtn.setText(Controller.movies.get(i).getName());
            moviebtn.setForeground(Color.white);
            moviebtn.setBackground(new Color(57,73,99));
            moviebtn.setActionCommand("random text");
            final int index = i;
            ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    String command = actionEvent.getActionCommand();
                    System.out.println("Selected: " + command);
                    HomePage.this.setVisible(false);
                    new MovieDetails(Controller.movies.get(index)).setVisible(true);
                }
            };
            moviebtn.addActionListener(actionListener);
            GridLayout gl = new GridLayout(0, 1);
            buttonPanel.setLayout(gl);
            buttonPanel.add(moviebtn);
        }
    }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReviewBtn;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loggedinUsernameLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton saveDataBtn;
    private javax.swing.JButton signoutBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel topHeading;
    // End of variables declaration//GEN-END:variables

}
