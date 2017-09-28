
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PauloHenrique
 */
@Entity
@Table(name = "agencias")

@XmlRootElement()
public class Agencia extends AbstractEntity {
    
    @Column(length = 200, nullable = false)
    private String codigo;
    
    @Column(length = 200, nullable = false)
    private String nome;

    public Agencia() {
    }

    public Agencia(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void updateParameters(Object entity) {
      final Agencia other = (Agencia) entity;
       this.codigo = other.codigo;
       this.nome = other.nome;  
    }
    
    @Override
    public String toString() {
        return "Agencia{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
}
