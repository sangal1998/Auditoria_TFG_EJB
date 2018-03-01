/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Santiago
 */
@Entity
@Table(name = "Fichero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fichero.findAll", query = "SELECT f FROM Fichero f")
    , @NamedQuery(name = "Fichero.findByIdFichero", query = "SELECT f FROM Fichero f WHERE f.idFichero = :idFichero")
    , @NamedQuery(name = "Fichero.findByNombreFichero", query = "SELECT f FROM Fichero f WHERE f.nombreFichero = :nombreFichero")})
public class Fichero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdFichero")
    private Integer idFichero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NombreFichero")
    private String nombreFichero;
    @JoinColumn(name = "NivelFichero", referencedColumnName = "IdNivelFichero")
    @ManyToOne(optional = false)
    private NivelFichero nivelFichero;
    @JoinColumn(name = "TipoFichero", referencedColumnName = "IdTipoFichero")
    @ManyToOne(optional = false)
    private TipoFichero tipoFichero;

    public Fichero() {
    }

    public Fichero(Integer idFichero) {
        this.idFichero = idFichero;
    }

    public Fichero(Integer idFichero, String nombreFichero) {
        this.idFichero = idFichero;
        this.nombreFichero = nombreFichero;
    }

    public Integer getIdFichero() {
        return idFichero;
    }

    public void setIdFichero(Integer idFichero) {
        this.idFichero = idFichero;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    public NivelFichero getNivelFichero() {
        return nivelFichero;
    }

    public void setNivelFichero(NivelFichero nivelFichero) {
        this.nivelFichero = nivelFichero;
    }

    public TipoFichero getTipoFichero() {
        return tipoFichero;
    }

    public void setTipoFichero(TipoFichero tipoFichero) {
        this.tipoFichero = tipoFichero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFichero != null ? idFichero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fichero)) {
            return false;
        }
        Fichero other = (Fichero) object;
        if ((this.idFichero == null && other.idFichero != null) || (this.idFichero != null && !this.idFichero.equals(other.idFichero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Fichero[ idFichero=" + idFichero + " ]";
    }
    
}
