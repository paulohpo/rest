/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.connection.impl;

import com.genericrest.dao.AgenciaDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Agencia;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PauloHenrique
 */
public class AgenciaDAOImpl extends GenericDAO<Agencia, Long> implements AgenciaDAO{
    private static final Logger LOG = LoggerFactory.getLogger(AgenciaDAOImpl.class);

    public AgenciaDAOImpl() {
        super(Agencia.class);
    }

  
    @Override
    public Logger getLogger() {
        return LOG;
    }

    
        
}


