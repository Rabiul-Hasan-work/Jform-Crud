
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class DBconnector {
    
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/smobile","root","paimon");
        
        return cn;
        
        
    }

    static java.sql.Connection getConnetion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
