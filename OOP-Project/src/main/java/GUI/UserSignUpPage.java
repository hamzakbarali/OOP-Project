package GUI;

import MovieReview.Controller;
import MovieReview.User;

/**
 * @author Hamza Akbar
 */
public class UserSignUpPage extends javax.swing.JFrame {

    public UserSignUpPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topHeading = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        roleList = new javax.swing.JComboBox<>();
        roleLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 73, 99));

        topHeading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        topHeading.setForeground(new java.awt.Color(255, 255, 255));
        topHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topHeading.setText("Sign Up");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Username");

        usernameField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        emailField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        roleList.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        roleList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Critic" }));
        roleList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleListActionPerformed(evt);
            }
        });

        roleLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role");

        submitBtn.setBackground(new java.awt.Color(57, 73, 99));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setBackground(new java.awt.Color(57, 73, 99));
        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setBorder(null);
        backBtn.setBorderPainted(false);
        backBtn.setLabel("Back");
        backBtn.setMinimumSize(new java.awt.Dimension(257, 281));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(topHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel)
                            .addComponent(roleLabel))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField)
                            .addComponent(passwordField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(roleList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitBtn)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topHeading)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleLabel))
                .addGap(28, 28, 28)
                .addComponent(errorLabel)
                .addGap(18, 18, 18)
                .addComponent(submitBtn)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void roleListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleListActionPerformed
        if(roleList.getSelectedItem().equals("Critic")){
            this.setVisible(false);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriticSignUpPage().setVisible(true);
            }
        });
    }//GEN-LAST:event_roleListActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(emailField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter an email");
        }
        else if(passwordField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter a password");
        }
        else if(usernameField.getText().trim().isEmpty()){
            errorLabel.setText("Please, enter a username");
        }
        else{
            boolean alreadyExists = false;
            for(User user: Controller.users){
                if(emailField.getText().trim().equals(user.getEmail())){
                    alreadyExists = !alreadyExists;
                    errorLabel.setText("This email has already been chosen");
                    break;
                }
                if(usernameField.getText().trim().equals(user.getUserName())){
                    alreadyExists = !alreadyExists;
                    errorLabel.setText("This username has already been chosen");
                    break;
                }
            }
            if(!alreadyExists){
                Controller.users.add(new User(usernameField.getText().trim(), emailField.getText().trim(), passwordField.getText().trim(), "User"));
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new LoginPage().setVisible(true);
                    }
                });
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JComboBox<String> roleList;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel topHeading;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
