package storage.keeper;
import java.sql.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SURAJ
 */
public class dcon {
     public static Connection getCon()
    {
        Connection cn=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
            if(cn!=null){
                System.out.println("connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
     
    
}
