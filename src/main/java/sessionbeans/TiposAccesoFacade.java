/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.TiposAcceso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Santiago
 */
@Stateless
public class TiposAccesoFacade extends AbstractFacade<TiposAcceso> implements TiposAccesoFacadeLocal {

    @PersistenceContext(unitName = "com_Auditoria-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposAccesoFacade() {
        super(TiposAcceso.class);
    }
    
}
