/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDienSach;
import java.sql.*;

/**
 *
 * @author PC
 */
public class KetNoiMSSQL {
    public static Connection layKetNoi(){
        java.sql.Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://DESKTOP-MGN3IP8:1433;databaseName=QLS";
        String username = "sa";
        String password = "180301";
        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              ketNoi = DriverManager.getConnection(uRL,username,password);
              System.out.println("Ket noi thanh cong");
              
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ket noi khong thanh cong");
            
        }
        return ketNoi;
    }
}   
