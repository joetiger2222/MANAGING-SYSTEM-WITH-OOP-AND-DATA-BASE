//
//package GUI;
//
//import database.classdb;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//public class EmployeeClass {
// 
//// public static int currentUser;//to know which index in the array is the current user
//    //to invoke the admin functions
//    Scanner input=new Scanner(System.in);
//    private String attendance="false";//as default is false and when the employee login it will change to true
//    private String username;
//    private int id,adminId;
//    private String fName,lName,empType;
//    private String userPassword;
//    private int vactionBalance=21;//the default vacation balance for all employees
//    private int assignedTaskCode;//the code of the task that the employee is working on
//    //-----getters and setters for all the variables-----------
//    public void setId(int id){this.id=id;}
//    public int getId(){return this.id;}
//    public void setAdminId(int aId){this.adminId=aId;}
//    public int getAdminId(){return this.adminId;}
//    public void setFName(String fName){this.fName=fName;}
//    public String getFName(){return this.fName;}
//    public void setLName(String lName){this.lName=lName;}
//    public String getLName(){return this.lName;}
//    public void setEmpType(String empType){this.empType=empType;}
//    public String getEmpType(){return this.empType;}
//    public void setAssignedTasksCode(int code){this.assignedTaskCode=code;}
//    public int getAssignedTasksCode(){return this.assignedTaskCode;}
//    public void setUserName(String name){this.username=name;}
//    public String getUserName(){return this.username;}
//    public void setPassword(String pass){this.userPassword=pass;}
//    public String getPassword(){return this.userPassword;}
//    public void setAttendance(String att){this.attendance=att;}
//    public String getAttendance(){return this.attendance;}
//    public void setBalanceVacation(int balance){this.vactionBalance=balance;}
//    public int getBalanceVacation(){return this.vactionBalance;}
//
//   /* public boolean approveOrDissaprove(int taskCode){//function to recieve task code and approve or dissaprove the task
//        System.out.println("the admin asking you to take mission with code: "+taskCode);
//        System.out.println("enter 1 if you approve anyother to reject");
//        int choice=input.nextInt();
//        if(choice==1){
//            this.setAssignedTasksCode(taskCode);//if he agrees then change the assigned task code to the new code
////            updateEmployee();//updating employee file with the new code
//        }
//        
//        return choice==1;//will return true if choice = 1 false otherwise
//    }*/
//    
//    
//    
// 
//    
//    public static void resetAttendance(){
//        Connection con = classdb.getCon();
//        PreparedStatement ps = null ;
//       
//        try {
//            String insSql =  "UPDATE employee SET Attendance = 'False' ; ";
//            
//            ps = con.prepareStatement(insSql);
//            ps.execute();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "attendance has not been updated  successfully" +e,"",JOptionPane.ERROR_MESSAGE);
//        } finally {
//            try {
//                ps.close();
//                con.close();
//                
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, "attendance has not been updated successfully" +e,"",JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }
//    
//    
//    
//}
