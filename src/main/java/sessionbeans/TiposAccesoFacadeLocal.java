/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.TiposAcceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface TiposAccesoFacadeLocal {

    void create(TiposAcceso tiposAcceso);

    void edit(TiposAcceso tiposAcceso);

    void remove(TiposAcceso tiposAcceso);

    TiposAcceso find(Object id);

    List<TiposAcceso> findAll();

    List<TiposAcceso> findRange(int[] range);

    int count();
    
}
