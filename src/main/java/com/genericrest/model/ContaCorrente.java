
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author PauloHenrique
 */

@Entity
@Table(name = "ContasCorrentes")
@XmlRootElement()
public class ContaCorrente extends Conta{
    
    @Column(length = 200, nullable = false)
    
    private String codigo;
   
    @Column(length = 200, nullable = false)
    
    private String saldo;

    public ContaCorrente() {
    }
    
    

    
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    
    @Override
    public void updateParameters(Object entity) {
       final ContaCorrente other = (ContaCorrente ) entity;
       this.codigo = other.codigo;
       this.saldo = other.saldo;
            
    }
    
    @Override
    public String toString() {
        return "ContaCorrente{" + "codigo=" + codigo + ", saldo=" + saldo + '}';
    }

}
