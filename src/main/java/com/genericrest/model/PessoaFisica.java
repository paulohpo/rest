
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
@Table(name = "PessoasFisicas")
@NamedQueries({
    @NamedQuery(name = "PessoaFisica.findByCpf", query = "select p from pessoafisica p where p.cpf = :cpf")
})
@XmlRootElement(name="pessoasfisicas")
public class PessoaFisica extends Cliente {
    
@Column(length = 200, nullable = false)
private String cpf;

@Column(length = 200, nullable = false)
private String nome;

    public PessoaFisica() {
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void updateParameters(Object entity) {
       final PessoaFisica other = (PessoaFisica) entity;
       this.cpf = other.cpf;
       this.nome = other.nome;
            
    }
    
    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }   
}
