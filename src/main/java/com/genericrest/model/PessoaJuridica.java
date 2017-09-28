
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
@Table(name = "PessoasJuridicas")

@XmlRootElement()
public class PessoaJuridica extends Cliente {
    
@Column(length = 200, nullable = false)
private String cnpj;

@Column(length = 200, nullable = false)
private String razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
     @Override
    public void updateParameters(Object entity) {
       final PessoaJuridica other = (PessoaJuridica) entity;
       this.cnpj = other.cnpj;
       this.razaoSocial = other.razaoSocial;
            
    }
    
    @Override
    public String toString() {
        return "Pessoajuridica{" + "cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + '}';
    }   
}
