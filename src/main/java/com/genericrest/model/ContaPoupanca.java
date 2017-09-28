
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
@Table(name = "ContasPoupancas")
@NamedQueries({
    @NamedQuery(name = "ContaPoupanca.findByCodigo", query = "select p from contapoupanca p where p.codigo = :codigo")
})
@XmlRootElement(name="contaspoupancas")
public class ContaPoupanca extends Conta {
    
    @Column(length = 200, nullable = false)
    private String codigo;
    
    @Column(length = 200, nullable = false)
    private String saldo;

    public ContaPoupanca() {
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
       final ContaPoupanca other = (ContaPoupanca) entity;
       this.codigo = other.codigo;
       this.saldo = other.saldo;
            
    }
    
    @Override
    public String toString() {
        return "ContaPoupanca{" + "codigo=" + codigo + ", saldo=" + saldo + '}';
    }
}
