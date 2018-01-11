/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Hana.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.Hana.implement.PelangganDAOImplement;
import java.sql.Connection;
import java.sql.SQLException;
import edu.Hana.service.PelangganDAO;

/**
 *
 * @author Hana-101165552-PBO12
 */
public class MyshopDatabase {
    private static Connection connection ;
    
    private static PelangganDAO pelangganDAO;
    public static Connection getConnection() throws SQLException{
        if(connection==null) {
               
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setURL("jdbc:mysql://localhost:3306/myshop");
                
                dataSource.setUser("root");
                dataSource.setPassword("");
                connection = dataSource.getConnection();
                
            }
            return connection;
    }
    public static PelangganDAO getPelangganDAO() throws  SQLException{
        if (pelangganDAO == null){
            pelangganDAO =new PelangganDAOImplement(getConnection());
        }
        return pelangganDAO;
    }
}
