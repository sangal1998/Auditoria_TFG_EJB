/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Auditorias;
import Entidades.Fichero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface AuditoriasFacadeLocal {

    void create(Auditorias auditorias);

    void edit(Auditorias auditorias);

    void remove(Auditorias auditorias);

    Auditorias find(Object id);

    List<Auditorias> findAll();

    List<Auditorias> findRange(int[] range);

    int count();

    public Auditorias findByIdAndDate(Fichero ficheroanalizado);

    public List<Auditorias> findById(Fichero ficheroanalizado);

    public List<Fichero> findAllFicheros();
    
}
