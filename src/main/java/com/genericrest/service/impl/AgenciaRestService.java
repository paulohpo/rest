/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.AgenciaDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Agencia;
import com.genericrest.service.AgenciaService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PauloHenrique
 */
@ManagedBean
@Path("/agencia")
public class AgenciaRestService extends GenericCRUDRestService<Agencia> implements AgenciaService {

    private static final Logger LOG = LoggerFactory.getLogger(AgenciaRestService.class);

    @Inject
    private AgenciaDAO agenciaDAO;

    public AgenciaRestService() {
        super(Agencia.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Agencia> list) {
        return new GenericEntity<List<Agencia>>(list){};
    }

    @Override
    public DAO getDao() {
        return agenciaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}
