/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Fichero;
import Entidades.Reglamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Santiago
 */
@Stateless
public class ReglamentoFacade extends AbstractFacade<Reglamento> implements ReglamentoFacadeLocal {

    @PersistenceContext(unitName = "com_Auditoria-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReglamentoFacade() {
        super(Reglamento.class);
    }

    @Override
    public List<Reglamento> findByFichero() {
        //devolvemos todas las preguntas
        Query q = em.createNamedQuery("Reglamento.findAll");
        return q.getResultList();
    }
    
}
