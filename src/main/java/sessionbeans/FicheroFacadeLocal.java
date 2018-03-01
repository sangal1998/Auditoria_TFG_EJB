/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Fichero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface FicheroFacadeLocal {

    void create(Fichero fichero);

    void edit(Fichero fichero);

    void remove(Fichero fichero);

    Fichero find(Object id);

    List<Fichero> findAll();

    List<Fichero> findRange(int[] range);

    int count();
    
}
