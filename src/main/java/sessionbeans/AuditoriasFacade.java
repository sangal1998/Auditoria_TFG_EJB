/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Auditorias;
import Entidades.Fichero;
import java.util.Calendar;
import java.util.Date;
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
public class AuditoriasFacade extends AbstractFacade<Auditorias> implements AuditoriasFacadeLocal {

    @PersistenceContext(unitName = "com_Auditoria-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditoriasFacade() {
        super(Auditorias.class);
    }

    @Override
    public Auditorias findByIdAndDate(Fichero ficheroanalizado) {
        Query q = em.createNamedQuery("Auditorias.findByFicheroFecha");
        q.setParameter("idFichero", ficheroanalizado.getIdFichero() );
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        q.setParameter("fecha",c.getTime());
        List<Auditorias> auditorias = q.getResultList();
        if(auditorias!=null && !auditorias.isEmpty()){
            return auditorias.get(0);
        }
        else{
            return null;
        }
    }

    @Override
    public List<Auditorias> findById(Fichero ficheroanalizado) {
        Query q = em.createNamedQuery("Auditorias.findByIdFichero");
        q.setParameter("idFichero", ficheroanalizado.getIdFichero() );
        return q.getResultList();
        
    }

    @Override
    public List<Fichero> findAllFicheros() {
        Query q = em.createNamedQuery("Fichero.findAll");
        return q.getResultList();
    }
    
}
