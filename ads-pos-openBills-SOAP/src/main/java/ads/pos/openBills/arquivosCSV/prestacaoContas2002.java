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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciana
 */
public class prestacaoContas2002 {

    public static void main(String[] args) {
        try {
            //csv file containing data
            String strFile = "C:\\Users\\lucia\\Desktop\\prestacao_contas_2002\\2002\\Candidato\\Despesa\\DespesaCandidato.csv";

            long currentTimeMillis = System.currentTimeMillis();
            CSVReader reader = new CSVReader(new FileReader(strFile), ';');
            String[] nextLine;
            int lineNumber = 0;
            while ((nextLine = reader.readNext()) != null) {
                final int i = lineNumber++;
                final String[] l = nextLine;
                new Thread(() -> exec(i, l)).start();

//                    exec(lineNumber, nextLine);
            }
            long c = System.currentTimeMillis() - currentTimeMillis;
            System.out.println("Segundos: " + (c / 1000));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(prestacaoContas2002.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(prestacaoContas2002.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void exec(int lineNumber, String[] nextLine) {
        
        System.out.println("Line # " + lineNumber);

        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0] + "etc...");
    }

}
