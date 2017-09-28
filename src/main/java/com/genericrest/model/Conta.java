
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
@Table(name = "contas")

@XmlRootElement()
public class Conta extends Agencia {
    
    @Column(length = 200, nullable = false)
    private String numero;
    
        public Conta() {
    }
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public void updateParameters(Object entity) {
      final Conta other = (Conta) entity;
       this.numero = other.numero;
        
    }
    
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + '}' ;
    }
}
