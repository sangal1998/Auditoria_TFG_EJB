/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.TipoFichero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface TipoFicheroFacadeLocal {

    void create(TipoFichero tipoFichero);

    void edit(TipoFichero tipoFichero);

    void remove(TipoFichero tipoFichero);

    TipoFichero find(Object id);

    List<TipoFichero> findAll();

    List<TipoFichero> findRange(int[] range);

    int count();
    
}
