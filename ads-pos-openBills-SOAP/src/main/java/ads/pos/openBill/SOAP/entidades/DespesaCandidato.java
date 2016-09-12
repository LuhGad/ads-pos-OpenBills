/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
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
    private String NO_CAND;
    private String DS_CARGO;
    private int NR_CAND;
    private String SG_UE_SUPERIOR;
    private String SG_PART;
    private Double VR_DESPESA;
    @Temporal(TemporalType.DATE)
    private Date DT_DESPESA;
    private String DS_TITULO;
    private String NM_FORNECEDOR;
    private String CD_CPF_CNPJ_FORNECEDOR;

    public DespesaCandidato() {
    }

    public DespesaCandidato(String SEQUENCIAL_CANDIDATO, String SG_UF, String NO_CAND, String DS_CARGO, int NR_CAND, String SG_UE_SUPERIOR, String SG_PART, Double VR_DESPESA, Date DT_DESPESA, String DS_TITULO, String NM_FORNECEDOR, String CD_CPF_CNPJ_FORNECEDOR) {
        this.SEQUENCIAL_CANDIDATO = SEQUENCIAL_CANDIDATO;
        this.SG_UF = SG_UF;
        this.NO_CAND = NO_CAND;
        this.DS_CARGO = DS_CARGO;
        this.NR_CAND = NR_CAND;
        this.SG_UE_SUPERIOR = SG_UE_SUPERIOR;
        this.SG_PART = SG_PART;
        this.VR_DESPESA = VR_DESPESA;
        this.DT_DESPESA = DT_DESPESA;
        this.DS_TITULO = DS_TITULO;
        this.NM_FORNECEDOR = NM_FORNECEDOR;
        this.CD_CPF_CNPJ_FORNECEDOR = CD_CPF_CNPJ_FORNECEDOR;
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

    public String getNO_CAND() {
        return NO_CAND;
    }

    public void setNO_CAND(String NO_CAND) {
        this.NO_CAND = NO_CAND;
    }

    public String getDS_CARGO() {
        return DS_CARGO;
    }

    public void setDS_CARGO(String DS_CARGO) {
        this.DS_CARGO = DS_CARGO;
    }

    public int getNR_CAND() {
        return NR_CAND;
    }

    public void setNR_CAND(int NR_CAND) {
        this.NR_CAND = NR_CAND;
    }

    public String getSG_UE_SUPERIOR() {
        return SG_UE_SUPERIOR;
    }

    public void setSG_UE_SUPERIOR(String SG_UE_SUPERIOR) {
        this.SG_UE_SUPERIOR = SG_UE_SUPERIOR;
    }

    public String getSG_PART() {
        return SG_PART;
    }

    public void setSG_PART(String SG_PART) {
        this.SG_PART = SG_PART;
    }

    public Double getVR_DESPESA() {
        return VR_DESPESA;
    }

    public void setVR_DESPESA(Double VR_DESPESA) {
        this.VR_DESPESA = VR_DESPESA;
    }

    public Date getDT_DESPESA() {
        return DT_DESPESA;
    }

    public void setDT_DESPESA(Date DT_DESPESA) {
        this.DT_DESPESA = DT_DESPESA;
    }

    public String getDS_TITULO() {
        return DS_TITULO;
    }

    public void setDS_TITULO(String DS_TITULO) {
        this.DS_TITULO = DS_TITULO;
    }

    public String getNM_FORNECEDOR() {
        return NM_FORNECEDOR;
    }

    public void setNM_FORNECEDOR(String NM_FORNECEDOR) {
        this.NM_FORNECEDOR = NM_FORNECEDOR;
    }

    public String getCD_CPF_CNPJ_FORNECEDOR() {
        return CD_CPF_CNPJ_FORNECEDOR;
    }

    public void setCD_CPF_CNPJ_FORNECEDOR(String CD_CPF_CNPJ_FORNECEDOR) {
        this.CD_CPF_CNPJ_FORNECEDOR = CD_CPF_CNPJ_FORNECEDOR;
    }

}
