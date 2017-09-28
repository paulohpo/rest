
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PauloHenrique
 */
@Entity
@Table(name = "clientes")
@NamedQueries({
    @NamedQuery(name = "Cliente.findByCodigo", query = "select p from Cliente p where p.codigo = :codigo")
})
@XmlRootElement(name="clientes")
public class Cliente extends AbstractEntity {
    
    @Column(length = 200, nullable = false)
    private String codigo;

    public Cliente() {
    }

    public Cliente(String codigo) {
        this.codigo = codigo;
    }

     
    
    @Override
    public void updateParameters(Object entity) {
      final Cliente other = (Cliente) entity;
       this.codigo = other.codigo;
        
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + '}' ;
    }
    
    
}
