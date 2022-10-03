package com.apoj2.logisticTcc.entidades;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.apache.tomcat.util.threads.ResizableExecutor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zonas")
public class Zona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idzona")
    private Integer idZona;
    @Column(name = "nombrezona")
    private String nombre;
    @Column(name = "capacidadzona")
    private Double capacidad;
    @Column(name = "disponiblezona")
    private Double disponible;

    @OneToMany(mappedBy = "zona")
    @JsonManagedReference
    private List<Mercancia> mercancias = new ArrayList<Mercancia>();

    public Zona() {
    }

    public List<Mercancia> getMercancias() {
        return mercancias;
    }

    public void setMercancias(List<Mercancia> mercancias) {
        this.mercancias = mercancias;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getDisponible() {
        return disponible;
    }

    public void setDisponible(Double disponible) {
        this.disponible = disponible;
    }
}
