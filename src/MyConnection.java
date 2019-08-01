/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.sql.*;
public class MyConnection {
    Connection con;
    public MyConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Searching for Connection class.....");
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class not found and unable to connect....."+cnf.getLocalizedMessage());
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:330/house_renting","root","mniharika");
        }
        catch(SQLException e2)
        {
            e2.printStackTrace();
        }
    }
    /**
     *
     * @return
     */
    public Connection getConnection()
        {
            return con;
        }
}
