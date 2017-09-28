/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.connection.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Cliente;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PauloHenrique
 */
@ApplicationScoped
public class ClienteDAOImpl extends GenericDAO<Cliente, String> implements ClienteDAO {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteDAOImpl.class);

    public ClienteDAOImpl() {
        super(Cliente.class);
    }

  
    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Cliente findByCodigo(String codigo) {
        Query query = getEntityManager().createNamedQuery("Cliente.findByCodigo",Cliente.class);
        query.setParameter("codigo", codigo);
        List<Cliente> clientes = query.getResultList();
        
        if (clientes == null || clientes.isEmpty()) {
           return null;
        } else if (clientes.size() > 1) {
            throw new  NonUniqueResultException();
        } else {
            return clientes.get(0);
        }
    }
}
 
