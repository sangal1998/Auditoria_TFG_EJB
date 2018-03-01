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
@Table(name = "TiposAcceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposAcceso.findAll", query = "SELECT t FROM TiposAcceso t")
    , @NamedQuery(name = "TiposAcceso.findByIdAcceso", query = "SELECT t FROM TiposAcceso t WHERE t.idAcceso = :idAcceso")
    , @NamedQuery(name = "TiposAcceso.findByAcceso", query = "SELECT t FROM TiposAcceso t WHERE t.acceso = :acceso")})
public class TiposAcceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdAcceso")
    private Integer idAcceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Acceso")
    private String acceso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acceso")
    private Collection<Usuario> usuarioCollection;

    public TiposAcceso() {
    }

    public TiposAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public TiposAcceso(Integer idAcceso, String acceso) {
        this.idAcceso = idAcceso;
        this.acceso = acceso;
    }

    public Integer getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposAcceso)) {
            return false;
        }
        TiposAcceso other = (TiposAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TiposAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
