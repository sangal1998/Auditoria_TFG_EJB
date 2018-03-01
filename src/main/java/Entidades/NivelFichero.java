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
@Table(name = "NivelFichero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelFichero.findAll", query = "SELECT n FROM NivelFichero n")
    , @NamedQuery(name = "NivelFichero.findByIdNivelFichero", query = "SELECT n FROM NivelFichero n WHERE n.idNivelFichero = :idNivelFichero")
    , @NamedQuery(name = "NivelFichero.findByNivelFichero", query = "SELECT n FROM NivelFichero n WHERE n.nivelFichero = :nivelFichero")})
public class NivelFichero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "IdNivelFichero")
    private String idNivelFichero;
    @Size(max = 10)
    @Column(name = "NivelFichero")
    private String nivelFichero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nivelFichero")
    private Collection<Fichero> ficheroCollection;

    public NivelFichero() {
    }

    public NivelFichero(String idNivelFichero) {
        this.idNivelFichero = idNivelFichero;
    }
    
    public String getIdNivelFichero() {
        return idNivelFichero;
    }

    public void setIdNivelFichero(String idNivelFichero) {
        this.idNivelFichero = idNivelFichero;
    }

    public String getNivelFichero() {
        return nivelFichero;
    }

    public void setNivelFichero(String nivelFichero) {
        this.nivelFichero = nivelFichero;
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
        hash += (idNivelFichero != null ? idNivelFichero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelFichero)) {
            return false;
        }
        NivelFichero other = (NivelFichero) object;
        if ((this.idNivelFichero == null && other.idNivelFichero != null) || (this.idNivelFichero != null && !this.idNivelFichero.equals(other.idNivelFichero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.NivelFichero[ idNivelFichero=" + idNivelFichero + " ]";
    }
    
}
