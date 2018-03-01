/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entidades.Reglamento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Santiago
 */
@Local
public interface ReglamentoFacadeLocal {

    void create(Reglamento reglamento);

    void edit(Reglamento reglamento);

    void remove(Reglamento reglamento);

    Reglamento find(Object id);

    List<Reglamento> findAll();

    List<Reglamento> findRange(int[] range);

    int count();

    public List<Reglamento> findByFichero();
    
}
