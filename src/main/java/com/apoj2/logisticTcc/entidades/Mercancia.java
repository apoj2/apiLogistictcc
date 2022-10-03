package com.apoj2.logisticTcc.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mercancias")
public class Mercancia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iup")
    private Integer iup;
    @Column(name = "volumen")
    private Double volumen;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tiporemitente")
    private String tipoRemitente;
    @Column(name = "identificacionremitente")
    private String identificacionRemitente;
    @Column(name = "nombreremitente")
    private String nombreRemitente;
    @Column(name = "dptoremitente")
    private String dptoRemitente;
    @Column(name = "municipioremitente")
    private String municipioRemitente;
    @Column(name = "direccionremitente")
    private String direccionRemitente;

    @Column(name = "tipodestinatario")
    private String tipoDestinatario;
    @Column(name = "identificaciondestinatario")
    private String identificacionDestinatario;
    @Column(name = "nombredestinatario")
    private String nombreDestinatario;
    @Column(name = "dptodestinatario")
    private String dptoDestinatario;
    @Column(name = "municipiodestinatario")
    private String municipioDestinatario;
    @Column(name = "direcciondestinatario")
    private String direccionDestinatario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_zona",referencedColumnName = "idzona")
    @JsonBackReference
    private Zona zona;

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Mercancia() {
    }

    public Integer getIup() {
        return iup;
    }

    public void setIup(Integer iup) {
        this.iup = iup;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRemitente() {
        return tipoRemitente;
    }

    public void setTipoRemitente(String tipoRemitente) {
        this.tipoRemitente = tipoRemitente;
    }

    public String getIdentificacionRemitente() {
        return identificacionRemitente;
    }

    public void setIdentificacionRemitente(String identificacionRemitente) {
        this.identificacionRemitente = identificacionRemitente;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getDptoRemitente() {
        return dptoRemitente;
    }

    public void setDptoRemitente(String dptoRemitente) {
        this.dptoRemitente = dptoRemitente;
    }

    public String getMunicipioRemitente() {
        return municipioRemitente;
    }

    public void setMunicipioRemitente(String municipioRemitente) {
        this.municipioRemitente = municipioRemitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getTipoDestinatario() {
        return tipoDestinatario;
    }

    public void setTipoDestinatario(String tipoDestinatario) {
        this.tipoDestinatario = tipoDestinatario;
    }

    public String getIdentificacionDestinatario() {
        return identificacionDestinatario;
    }

    public void setIdentificacionDestinatario(String identificacionDestinatario) {
        this.identificacionDestinatario = identificacionDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDptoDestinatario() {
        return dptoDestinatario;
    }

    public void setDptoDestinatario(String dptoDestinatario) {
        this.dptoDestinatario = dptoDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }
}
