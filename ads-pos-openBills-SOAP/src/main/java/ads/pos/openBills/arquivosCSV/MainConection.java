/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBills.arquivosCSV;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciana
 */
public class MainConection {

    public static void main(String[] args) throws SQLException {

        try {
            String url = "jdbc:postgresql://localhost:5432/openbills";
            String password = "123";
            String user = "postgres";
            Class.forName("org.postgresql.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            String strFile = "C:\\Users\\lucia\\Desktop\\prestacao_contas_2002\\2002\\Candidato\\Receita\\ReceitaCandidato.csv";
            CSVReader reader = new CSVReader(new FileReader(strFile), ';');

            List<String[]> linhaReceita = new ArrayList();
            
            String[] nextLine;
            while((nextLine = reader.readNext()) != null){
                //System.out.println(nextLine.length);
                linhaReceita.add(nextLine);
                if(linhaReceita.size() > 999){
                    new ThreadReceitaCandidato2002(linhaReceita, c).run();
                    linhaReceita = new ArrayList<>();
                }
               
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

    }
    

}
