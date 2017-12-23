/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author José Carlos Grijalva González
 */
@Entity
@Table(name = "documento_real", catalog = "gestion_documentos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoReal.findAll", query = "SELECT d FROM DocumentoReal d"),
    @NamedQuery(name = "DocumentoReal.findByIdDocumentoReal", query = "SELECT d FROM DocumentoReal d WHERE d.idDocumentoReal = :idDocumentoReal"),
    @NamedQuery(name = "DocumentoReal.findByUbicacion", query = "SELECT d FROM DocumentoReal d WHERE d.ubicacion = :ubicacion"),
    @NamedQuery(name = "DocumentoReal.findByEmisor", query = "SELECT d FROM DocumentoReal d WHERE d.emisor = :emisor"),
    @NamedQuery(name = "DocumentoReal.findByReceptor", query = "SELECT d FROM DocumentoReal d WHERE d.receptor = :receptor"),
    @NamedQuery(name = "DocumentoReal.findByFechaEmision", query = "SELECT d FROM DocumentoReal d WHERE d.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "DocumentoReal.findByActivo", query = "SELECT d FROM DocumentoReal d WHERE d.activo = :activo"),
    @NamedQuery(name = "DocumentoReal.findByDocumento", query = "SELECT d FROM DocumentoReal d WHERE d.documento = :documento"),
    @NamedQuery(name = "DocumentoReal.findByDescripcion", query = "SELECT d FROM DocumentoReal d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "DocumentoReal.findByFechaRegistro", query = "SELECT d FROM DocumentoReal d WHERE d.fechaRegistro = :fechaRegistro")})
public class DocumentoReal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDocumentoReal", nullable = false)
    private Integer idDocumentoReal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ubicacion", nullable = false, length = 150)
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "emisor", nullable = false, length = 150)
    private String emisor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "receptor", nullable = false, length = 150)
    private String receptor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEmision", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "documento", nullable = false, length = 250)
    private String documento;
    @Size(max = 200)
    @Column(name = "descripcion", length = 200)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaRegistro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria", nullable = false)
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public DocumentoReal() {
    }

    public DocumentoReal(Integer idDocumentoReal) {
        this.idDocumentoReal = idDocumentoReal;
    }

    public DocumentoReal(Integer idDocumentoReal, String ubicacion, String emisor, String receptor, Date fechaEmision, boolean activo, String documento, Date fechaRegistro) {
        this.idDocumentoReal = idDocumentoReal;
        this.ubicacion = ubicacion;
        this.emisor = emisor;
        this.receptor = receptor;
        this.fechaEmision = fechaEmision;
        this.activo = activo;
        this.documento = documento;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdDocumentoReal() {
        return idDocumentoReal;
    }

    public void setIdDocumentoReal(Integer idDocumentoReal) {
        this.idDocumentoReal = idDocumentoReal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumentoReal != null ? idDocumentoReal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoReal)) {
            return false;
        }
        DocumentoReal other = (DocumentoReal) object;
        if ((this.idDocumentoReal == null && other.idDocumentoReal != null) || (this.idDocumentoReal != null && !this.idDocumentoReal.equals(other.idDocumentoReal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jc.entity.DocumentoReal[ idDocumentoReal=" + idDocumentoReal + " ]";
    }
    
}
