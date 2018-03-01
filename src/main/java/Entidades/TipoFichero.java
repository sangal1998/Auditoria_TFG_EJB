/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Santiago
 */
@Entity
@Table(name = "TipoFichero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoFichero.findAll", query = "SELECT t FROM TipoFichero t")
    , @NamedQuery(name = "TipoFichero.findByIdTipoFichero", query = "SELECT t FROM TipoFichero t WHERE t.idTipoFichero = :idTipoFichero")
    , @NamedQuery(name = "TipoFichero.findByTipoFichero", query = "SELECT t FROM TipoFichero t WHERE t.tipoFichero = :tipoFichero")})
public class TipoFichero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IdTipoFichero")
    private String idTipoFichero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TipoFichero")
    private String tipoFichero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoFichero")
    private Collection<Fichero> ficheroCollection;

    public TipoFichero() {
    }

    public TipoFichero(String idTipoFichero) {
        this.idTipoFichero = idTipoFichero;
    }

    public TipoFichero(String idTipoFichero, String tipoFichero) {
        this.idTipoFichero = idTipoFichero;
        this.tipoFichero = tipoFichero;
    }

    public String getIdTipoFichero() {
        return idTipoFichero;
    }

    public void setIdTipoFichero(String idTipoFichero) {
        this.idTipoFichero = idTipoFichero;
    }

    public String getTipoFichero() {
        return tipoFichero;
    }

    public void setTipoFichero(String tipoFichero) {
        this.tipoFichero = tipoFichero;
    }

    @XmlTransient
    public Collection<Fichero> getFicheroCollection() {
        return ficheroCollection;
    }

    public void setFicheroCollection(Collection<Fichero> ficheroCollection) {
        this.ficheroCollection = ficheroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoFichero != null ? idTipoFichero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoFichero)) {
            return false;
        }
        TipoFichero other = (TipoFichero) object;
        if ((this.idTipoFichero == null && other.idTipoFichero != null) || (this.idTipoFichero != null && !this.idTipoFichero.equals(other.idTipoFichero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoFichero[ idTipoFichero=" + idTipoFichero + " ]";
    }
    
}
