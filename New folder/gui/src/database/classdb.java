/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author 10
 */
import java.awt.HeadlessException;
import java.sql.* ;
import javax.swing.JOptionPane;
public class classdb {
    private static Connection con1;
    public static Connection getCon() {
        if (con1 == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con2 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\JOE\\Desktop\\New folder (2)\\java project\\New folder\\db\\db4pl2.sqlite");
                //JOptionPane.showMessageDialog(null, "connect successfully");
                return con2 ;
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "connect Failed " + e,"",JOptionPane.ERROR_MESSAGE);

            }
        }
        return null;
   
    }
}
