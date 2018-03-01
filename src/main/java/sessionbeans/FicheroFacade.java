/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Fichero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Santiago
 */
@Stateless
public class FicheroFacade extends AbstractFacade<Fichero> implements FicheroFacadeLocal {

    @PersistenceContext(unitName = "com_Auditoria-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FicheroFacade() {
        super(Fichero.class);
    }
    
}
