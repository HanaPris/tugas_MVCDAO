/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Hana.main;

import edu.Hana.database.MyshopDatabase;
import edu.Hana.entity.Pelanggan;
import edu.Hana.error.PelangganException;
import java.sql.SQLException;
import edu.Hana.service.PelangganDAO;

/**
 *
 * @author Hana-101165552-PBO12
 */
public class MVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.Hana.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        PelangganDAO dao = MyshopDatabase.getPelangganDAO();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Hana Priska ");
        pelanggan.setAlamat("Bandung tubagus dalam");
        pelanggan.setTelepon("089655987875");
        pelanggan.setEmail("hanapris2010@gmail.com");
        
        dao.insertPelanggan(pelanggan);
    }
    
}
