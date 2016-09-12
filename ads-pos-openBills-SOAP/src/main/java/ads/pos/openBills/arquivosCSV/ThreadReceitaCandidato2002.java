/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBills.arquivosCSV;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Luciana
 */
public class ThreadReceitaCandidato2002 extends Thread{
    
    private final List<String[]> linha;
    private final Connection con;

    public ThreadReceitaCandidato2002(List<String[]> linha, Connection con) {
        this.linha = linha;
        this.con = con;
    }


    @Override
    public void run() {
        persistirDespesa(linha);
    }

    private void persistirDespesa(List<String[]> lista) {
        try {
            String[] nextLine;
            for (String[] l : lista) {
                nextLine = l;                
                //String[] split = nextLine[0].split(";");                
                String sql = "INSERT INTO receitas_Candidato2002 VALUES"
                        + "('" + nextLine[0].replaceAll("'", "") + "'"
                        + ",'" + nextLine[1].replaceAll("'", "") + "'"
                        + ",'" + nextLine[2].replaceAll("'", "") + "'"
                        + ",'" + nextLine[3].replaceAll("'", "") + "'"
                        + ",'" + nextLine[4].replaceAll("'", "") + "'"
                        + ",'" + nextLine[5].replaceAll("'", "") + "'"
                        + ",'" + nextLine[6].replaceAll("'", "") + "'"
                        + ",'" + nextLine[7].replaceAll("'", "") + "'"
                        + ",'" + nextLine[8].replaceAll("'", "") + "'"
                        + ",'" + nextLine[9].replaceAll("'", "") + "'"
                        + ",'" + nextLine[10].replaceAll("'", "") + "'"
                        + ",'" + nextLine[11].replaceAll("'", "") + "')";
                //System.out.println(sql);
                con.prepareStatement(sql).executeUpdate();
                
            }
            System.out.println(" persistiu 500 linhas");
        } catch (Exception e) {
            System.out.println("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \n Recompile e execute novamente.");
            e.printStackTrace();
        }
    }
}
