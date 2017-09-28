
package com.genericrest.service.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.DAO;
import com.genericrest.dao.ClienteDAO;
import com.genericrest.model.Cliente;
import com.genericrest.service.ClienteService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author PauloHenrique
 */
@ManagedBean
@Path("/cliente")
public class ClienteRestService extends GenericCRUDRestService<Cliente> implements ClienteService {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteRestService.class);

    @Inject
    private ClienteDAO clienteDAO;

    public ClienteRestService() {
        super(Cliente.class);
    }

    /**
     *
     * @return
     */
    @GET
    @Path("/codigo/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        

    @Override
    public GenericEntity listToGenericEntity(List<Cliente> list) {
        return new GenericEntity<List<Cliente>>(list){};
    }
    
    @Override
    public DAO getDao() {
        return clienteDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}  