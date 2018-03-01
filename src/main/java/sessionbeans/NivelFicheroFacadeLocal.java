/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.NivelFichero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface NivelFicheroFacadeLocal {

    void create(NivelFichero nivelFichero);

    void edit(NivelFichero nivelFichero);

    void remove(NivelFichero nivelFichero);

    NivelFichero find(Object id);

    List<NivelFichero> findAll();

    List<NivelFichero> findRange(int[] range);

    int count();
    
}
