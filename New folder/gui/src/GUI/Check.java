package GUI;

public class Check extends javax.swing.JFrame {
    
    public Check() {
      //initComponents();
        super("Choose Your Type Please [Check]");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_ID = new javax.swing.JButton();
        Employee_ID = new javax.swing.JButton();
        Customer_ID = new javax.swing.JButton();
        choose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 80, 80));

        Admin_ID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Admin_ID.setText("Admin");
        Admin_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_IDActionPerformed(evt);
            }
        });

        Employee_ID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Employee_ID.setText("Employee");
        Employee_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_IDActionPerformed(evt);
            }
        });

        Customer_ID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Customer_ID.setText("Customer");
        Customer_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_IDActionPerformed(evt);
            }
        });

        choose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choose.setForeground(new java.awt.Color(80, 80, 80));
        choose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choose.setText("Choose Your Type :");
        choose.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Admin_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Employee_ID)
                .addGap(53, 53, 53)
                .addComponent(Customer_ID)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_ID)
                    .addComponent(Employee_ID)
                    .addComponent(Customer_ID))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_IDActionPerformed
        // TODO add your handling code here:
        
        Login a = new Login();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_Admin_IDActionPerformed

    private void Employee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_IDActionPerformed
        // TODO add your handling code here:
        Loginemp e = new Loginemp();
        this.setVisible(false);
        e.setVisible(true);
    }//GEN-LAST:event_Employee_IDActionPerformed

    private void Customer_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_IDActionPerformed
        // TODO add your handling code here:
        Logincus c = new Logincus();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_Customer_IDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Check().setVisible(true);
//                try {//log out button
//      File myObj = new File("employee.txt");
//      Scanner myReader = new Scanner(myObj);
//      lastEmployee=0;
//      while (myReader.hasNextLine()) {
//          
//        employees[lastEmployee]=new EmployeeClass();
//        employees[lastEmployee].setUserName(myReader.next());
//        employees[lastEmployee].setPassword(myReader.next());
//        employees[lastEmployee].setAttendance(myReader.next());
//        employees[lastEmployee].setBalanceVacation(myReader.nextInt());
//        employees[lastEmployee].setAssignedTasksCode(myReader.nextInt());
//        lastEmployee++;
//      }
//     
//      myReader.close();
//    } catch (FileNotFoundException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_ID;
    private javax.swing.JButton Customer_ID;
    private javax.swing.JButton Employee_ID;
    private javax.swing.JLabel choose;
    // End of variables declaration//GEN-END:variables
}
