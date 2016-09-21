/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.DespesaCandidato;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author nanda
 */
@Stateless
public class ServerSoapCandidato {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<DespesaCandidato> despesasCandidato(int ano){
        TypedQuery<DespesaCandidato> query = 
                entityManager.createQuery("", DespesaCandidato.class);
    
        return query.getResultList();
       
    }
    
}
