/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
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
public class DespesaCandidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SEQUENCIAL_CANDIDATO;
    private String SG_UF;
    private String SG_PART;
    private String DS_CARGO;
    private String NO_CAND;
    private String NR_CAND;
    @Temporal(TemporalType.DATE)
    private String Data_DOC_DESP;
    private String CD_CPF_CGC;
    private String SG_UF_FORNECEDOR;
    private String Nome_Fornecedor;
    private float VR_DESPESA;
    private String DS_TITULO;

    public DespesaCandidato() {
    }

    public DespesaCandidato(String SEQUENCIAL_CANDIDATO, String SG_UF, String SG_PART, String DS_CARGO, String NO_CAND, String NR_CAND, String Data_DOC_DESP, String CD_CPF_CGC, String SG_UF_FORNECEDOR, String Nome_Fornecedor, float VR_DESPESA, String DS_TITULO) {
        this.SEQUENCIAL_CANDIDATO = SEQUENCIAL_CANDIDATO;
        this.SG_UF = SG_UF;
        this.SG_PART = SG_PART;
        this.DS_CARGO = DS_CARGO;
        this.NO_CAND = NO_CAND;
        this.NR_CAND = NR_CAND;
        this.Data_DOC_DESP = Data_DOC_DESP;
        this.CD_CPF_CGC = CD_CPF_CGC;
        this.SG_UF_FORNECEDOR = SG_UF_FORNECEDOR;
        this.Nome_Fornecedor = Nome_Fornecedor;
        this.VR_DESPESA = VR_DESPESA;
        this.DS_TITULO = DS_TITULO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSEQUENCIAL_CANDIDATO() {
        return SEQUENCIAL_CANDIDATO;
    }

    public void setSEQUENCIAL_CANDIDATO(String SEQUENCIAL_CANDIDATO) {
        this.SEQUENCIAL_CANDIDATO = SEQUENCIAL_CANDIDATO;
    }

    public String getSG_UF() {
        return SG_UF;
    }

    public void setSG_UF(String SG_UF) {
        this.SG_UF = SG_UF;
    }

    public String getSG_PART() {
        return SG_PART;
    }

    public void setSG_PART(String SG_PART) {
        this.SG_PART = SG_PART;
    }

    public String getDS_CARGO() {
        return DS_CARGO;
    }

    public void setDS_CARGO(String DS_CARGO) {
        this.DS_CARGO = DS_CARGO;
    }

    public String getNO_CAND() {
        return NO_CAND;
    }

    public void setNO_CAND(String NO_CAND) {
        this.NO_CAND = NO_CAND;
    }

    public String getNR_CAND() {
        return NR_CAND;
    }

    public void setNR_CAND(String NR_CAND) {
        this.NR_CAND = NR_CAND;
    }

    public String getData_DOC_DESP() {
        return Data_DOC_DESP;
    }

    public void setData_DOC_DESP(String Data_DOC_DESP) {
        this.Data_DOC_DESP = Data_DOC_DESP;
    }

    public String getCD_CPF_CGC() {
        return CD_CPF_CGC;
    }

    public void setCD_CPF_CGC(String CD_CPF_CGC) {
        this.CD_CPF_CGC = CD_CPF_CGC;
    }

    public String getSG_UF_FORNECEDOR() {
        return SG_UF_FORNECEDOR;
    }

    public void setSG_UF_FORNECEDOR(String SG_UF_FORNECEDOR) {
        this.SG_UF_FORNECEDOR = SG_UF_FORNECEDOR;
    }

    public String getNome_Fornecedor() {
        return Nome_Fornecedor;
    }

    public void setNome_Fornecedor(String Nome_Fornecedor) {
        this.Nome_Fornecedor = Nome_Fornecedor;
    }

    public float getVR_DESPESA() {
        return VR_DESPESA;
    }

    public void setVR_DESPESA(float VR_DESPESA) {
        this.VR_DESPESA = VR_DESPESA;
    }

    public String getDS_TITULO() {
        return DS_TITULO;
    }

    public void setDS_TITULO(String DS_TITULO) {
        this.DS_TITULO = DS_TITULO;
    }

}
