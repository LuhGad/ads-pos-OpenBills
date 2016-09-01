/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luciana
 */
@Entity
public class ReceitaCandidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SG_UF;
    private String Sigla_PART;
    private String Nome_CAND;
    private int Numero_CAND;
    @Temporal(TemporalType.DATE)
    private Date Data_RECEITA;
    private String CD_CPF_CGC;
    private String SG_UF_DOADOR;
    private String Nome_DOADOR;
    private float Valor_RECEITA;
    @Enumerated(EnumType.STRING)
    private TipoDeRecursoENUM TP_RECURSO;

    public ReceitaCandidato() {
    }

    public ReceitaCandidato(String SG_UF, String Sigla_PART, String Nome_CAND, int Numero_CAND, Date Data_RECEITA, String CD_CPF_CGC, String SG_UF_DOADOR, String Nome_DOADOR, float Valor_RECEITA, TipoDeRecursoENUM TP_RECURSO) {
        this.SG_UF = SG_UF;
        this.Sigla_PART = Sigla_PART;
        this.Nome_CAND = Nome_CAND;
        this.Numero_CAND = Numero_CAND;
        this.Data_RECEITA = Data_RECEITA;
        this.CD_CPF_CGC = CD_CPF_CGC;
        this.SG_UF_DOADOR = SG_UF_DOADOR;
        this.Nome_DOADOR = Nome_DOADOR;
        this.Valor_RECEITA = Valor_RECEITA;
        this.TP_RECURSO = TP_RECURSO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSG_UF() {
        return SG_UF;
    }

    public void setSG_UF(String SG_UF) {
        this.SG_UF = SG_UF;
    }

    public String getSigla_PART() {
        return Sigla_PART;
    }

    public void setSigla_PART(String Sigla_PART) {
        this.Sigla_PART = Sigla_PART;
    }

    public String getNome_CAND() {
        return Nome_CAND;
    }

    public void setNome_CAND(String Nome_CAND) {
        this.Nome_CAND = Nome_CAND;
    }

    public int getNumero_CAND() {
        return Numero_CAND;
    }

    public void setNumero_CAND(int Numero_CAND) {
        this.Numero_CAND = Numero_CAND;
    }

    public Date getData_RECEITA() {
        return Data_RECEITA;
    }

    public void setData_RECEITA(Date Data_RECEITA) {
        this.Data_RECEITA = Data_RECEITA;
    }

    public String getCD_CPF_CGC() {
        return CD_CPF_CGC;
    }

    public void setCD_CPF_CGC(String CD_CPF_CGC) {
        this.CD_CPF_CGC = CD_CPF_CGC;
    }

    public String getSG_UF_DOADOR() {
        return SG_UF_DOADOR;
    }

    public void setSG_UF_DOADOR(String SG_UF_DOADOR) {
        this.SG_UF_DOADOR = SG_UF_DOADOR;
    }

    public String getNome_DOADOR() {
        return Nome_DOADOR;
    }

    public void setNome_DOADOR(String Nome_DOADOR) {
        this.Nome_DOADOR = Nome_DOADOR;
    }

    public float getValor_RECEITA() {
        return Valor_RECEITA;
    }

    public void setValor_RECEITA(float Valor_RECEITA) {
        this.Valor_RECEITA = Valor_RECEITA;
    }

    public TipoDeRecursoENUM getTP_RECURSO() {
        return TP_RECURSO;
    }

    public void setTP_RECURSO(TipoDeRecursoENUM TP_RECURSO) {
        this.TP_RECURSO = TP_RECURSO;
    }


}
