package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Categoria")  

    private Long idcategoria;
    private String descripcion;
    private boolean activo;

    public Categoria() { 
        
    }

    public Categoria(Long idcategoria, String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
