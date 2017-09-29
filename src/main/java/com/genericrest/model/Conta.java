
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author PauloHenrique
 */

@Entity
@Table(name = "contas")

@XmlRootElement()
public class Conta {
    
    @Column(length = 200, nullable = false)
    
    @Id
    private String numero;
    
        public Conta() {
    }
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public void updateParameters(Object entity) {
      final Conta other = (Conta) entity;
       this.numero = other.numero;
        
    }
    
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + '}' ;
    }
}
