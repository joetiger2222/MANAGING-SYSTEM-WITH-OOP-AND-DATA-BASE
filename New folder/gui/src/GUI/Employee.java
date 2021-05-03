/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import javax.swing.*;
import static GUI.Loginemp.*;
import java.text.SimpleDateFormat;
import java.util.*;
import static GUI.requestingTask.code;
import database.classdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame {
//    public static int lastEmployee;
//    public static EmployeeClass[]employees=new EmployeeClass[30];
    public JButton annual;
    public JButton emerg;
    public JButton sick;
    public JLabel l1;
    String attendance;
    public Employee() {
        super("Employee UI [Employee]");
        initComponents();
        l1=new JLabel();
        l1.setText("choose vacation type:");
        l1.setBounds(20, 150, 50, 50);
        l1.setSize(200,30);
        this.add(l1);
        Date d=new Date();
        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
        jLabel2.setText("you logged in at "+dd.format(d));
        jLabel1.setText(fname2log+" "+lname2log);
        annual=new JButton();
        emerg=new JButton();
        sick=new JButton();
        annual.setText("annual");
        emerg.setText("emergency");
        sick.setText("sick");
        annual.setBounds(20, 175, 120, 50);
        emerg.setBounds(20, 210, 80, 50);
        sick.setBounds(20, 245, 80, 30);
        annual.setSize(100, 30);
        emerg.setSize(100, 30);
        sick.setSize(100, 30);
        this.add(l1);
        this.add(annual);
        this.add(emerg);
        this.add(sick);
        l1.setVisible(false);
        annual.setVisible(false);
        emerg.setVisible(false);
        sick.setVisible(false);
        
        
        annual.addActionListener((ActionEvent e) -> {
            AcceptVacation v=new AcceptVacation();
            v.vacationRequest(annual.getText());
            v.setVisible(true);
        });
        
        
        emerg.addActionListener((ActionEvent e) -> {
            AcceptVacation v=new AcceptVacation();
            v.vacationRequest(emerg.getText());
            v.setVisible(true);
        });
        
        
        
        
        sick.addActionListener((ActionEvent e) -> {
            AcceptVacation v=new AcceptVacation();
            v.vacationRequest(sick.getText());
            v.setVisible(true);
        });
        

        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestVacationButton = new javax.swing.JButton();
        requestTaskButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttask = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        requestVacationButton.setText("request vacation");
        requestVacationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVacationButtonActionPerformed(evt);
            }
        });

        requestTaskButton.setText("reqeust task");
        requestTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTaskButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        ttask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "TaskTitle", "Description", "TaskPhase", "Priority", "Project", "Evaluation", "CreatorName", "StartDate", "EndDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ttask);

        exit.setBackground(new java.awt.Color(51, 0, 0));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/log.png"))); // NOI18N
        logout1.setText("LOGOUT");
        logout1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(requestVacationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(requestTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addComponent(logout1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logout1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(requestTaskButton)
                        .addGap(18, 18, 18)
                        .addComponent(requestVacationButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(exit))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestVacationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVacationButtonActionPerformed
        l1.setVisible(true);
        annual.setVisible(true);
        emerg.setVisible(true);
        sick.setVisible(true);
        
    }//GEN-LAST:event_requestVacationButtonActionPerformed

    private void requestTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTaskButtonActionPerformed
        requestingTask r=new requestingTask();
        r.setLabel();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_requestTaskButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        Check c=new Check();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_logout1ActionPerformed

 
    
    
    public void read4emptask(){
        Connection con = classdb.getCon();
        PreparedStatement ps = null ;
        ResultSet rs = null ;
        
        try {
            String sql = "SELECT * FROM tasks WHERE Code = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, taskcode2show);
            rs = ps.executeQuery();
            while (rs.next()) {
                String code = String.valueOf(rs.getInt("Code"));
                String taskTitle = rs.getString("TaskTitle");
                String des = rs.getString("Description");
                String taskPh = rs.getString("TaskPhase");
                String pri = rs.getString("Priority");
                String pro = rs.getString("Project");
                String eva = String.valueOf(rs.getInt("Evaluation"));
                String creaName = String.valueOf(rs.getInt("CreatorName"));
                String sDate = rs.getString("StartDate");
                String eDate = rs.getString("EndDate");
                
                // 2 show in table
                String dataTable[] = {code,taskTitle,des,taskPh,pri,pro,eva,creaName,sDate,eDate};
                DefaultTableModel dtm1 = (DefaultTableModel)ttask.getModel();
                dtm1.addRow(dataTable);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data was not been showed " +e,"",JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data was not been closed " +e,"",JOptionPane.ERROR_MESSAGE);
            }
        }
    
    
    }
    
    public void newread4emptask(){
        Connection con = classdb.getCon();
        PreparedStatement ps = null ;
        ResultSet rs = null ;
        
        try {
            String sql = "SELECT * FROM tasks WHERE Code = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {
                String code = String.valueOf(rs.getInt("Code"));
                String taskTitle = rs.getString("TaskTitle");
                String des = rs.getString("Description");
                String taskPh = rs.getString("TaskPhase");
                String pri = rs.getString("Priority");
                String pro = rs.getString("Project");
                String eva = String.valueOf(rs.getInt("Evaluation"));
                String creaName = String.valueOf(rs.getInt("CreatorName"));
                String sDate = rs.getString("StartDate");
                String eDate = rs.getString("EndDate");
                
                // 2 show in table
                String dataTable[] = {code,taskTitle,des,taskPh,pri,pro,eva,creaName,sDate,eDate};
                DefaultTableModel dtm1 = (DefaultTableModel)ttask.getModel();
                dtm1.addRow(dataTable);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data was not been showed " +e,"",JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data was not been closed " +e,"",JOptionPane.ERROR_MESSAGE);
            }
        }
    
    
    }
  
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout1;
    private javax.swing.JButton requestTaskButton;
    private javax.swing.JButton requestVacationButton;
    private javax.swing.JTable ttask;
    // End of variables declaration//GEN-END:variables

//     public static void updateEmployee(){//updating the employee file when something happen in it
//        try {
//          FileWriter w = new FileWriter("employee.txt");
//           int j=0;
//           while(j<lastEmployee){
//        w.write(employees[j].getUserName()+" ");
//        w.write(employees[j].getPassword()+" ");
//        w.write(employees[j].getAttendance()+" ");
//        w.write(employees[j].getBalanceVacation()+" ");
//        if(j==(lastEmployee-1)){w.write(Integer.toString(employees[j].getAssignedTasksCode()));}
//        else
//        w.write(employees[j].getAssignedTasksCode()+"\n");
//               j++;
//           }
//           w.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
    
    
    
    
    
}
