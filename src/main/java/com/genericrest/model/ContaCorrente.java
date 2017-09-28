
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
@Table(name = "ContasCorrentes")
@NamedQueries({
    @NamedQuery(name = "ContaCorrente.findByCodigo", query = "select p from contacorrente p where p.codigo = :codigo")
})
@XmlRootElement(name="contascorrentes")
public class ContaCorrente extends Conta{
    
    @Column(length = 200, nullable = false)
    private String codigo;
   
    @Column(length = 200, nullable = false)
    private String saldo;

    public ContaCorrente() {
    }
    
    

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
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
