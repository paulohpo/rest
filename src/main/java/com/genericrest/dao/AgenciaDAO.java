
package com.genericrest.dao;

import com.genericrest.model.Agencia;
import java.util.List;

/**
 *
 * @author PauloHenrique
 */
    public interface AgenciaDAO  extends DAO<Agencia, String>{
    List<Agencia>FindByNome(String nome);
}
