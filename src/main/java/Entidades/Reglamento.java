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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Santiago
 */
@Entity
@Table(name = "Reglamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglamento.findAll", query = "SELECT r FROM Reglamento r")
    , @NamedQuery(name = "Reglamento.findByIdPregunta", query = "SELECT r FROM Reglamento r WHERE r.idPregunta = :idPregunta")
    , @NamedQuery(name = "Reglamento.findByPregunta", query = "SELECT r FROM Reglamento r WHERE r.pregunta = :pregunta")
    , @NamedQuery(name = "Reglamento.findByIncumplimiento", query = "SELECT r FROM Reglamento r WHERE r.incumplimiento = :incumplimiento")
    , @NamedQuery(name = "Reglamento.findByNivelFichero", query = "SELECT r FROM Reglamento r WHERE r.nivelFichero = :nivelFichero")
    , @NamedQuery(name = "Reglamento.findByTipoFichero", query = "SELECT r FROM Reglamento r WHERE r.tipoFichero = :tipoFichero")
    , @NamedQuery(name = "Reglamento.findByCategoria", query = "SELECT r FROM Reglamento r WHERE r.categoria = :categoria")})
public class Reglamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPregunta")
    private Integer idPregunta;
    @Size(max = 300)
    @Column(name = "Pregunta")
    private String pregunta;
    @Size(max = 300)
    @Column(name = "Incumplimiento")
    private String incumplimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "NivelFichero")
    private String nivelFichero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "TipoFichero")
    private String tipoFichero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Categoria")
    private String categoria;
    @Transient
    private int numpregunta;

    public Reglamento() {
    }

    public Reglamento(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Reglamento(Integer idPregunta, String nivelFichero, String tipoFichero, String categoria) {
        this.idPregunta = idPregunta;
        this.nivelFichero = nivelFichero;
        this.tipoFichero = tipoFichero;
        this.categoria = categoria;
    }

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getIncumplimiento() {
        return incumplimiento;
    }

    public void setIncumplimiento(String incumplimiento) {
        this.incumplimiento = incumplimiento;
    }

    public String getNivelFichero() {
        return nivelFichero;
    }

    public void setNivelFichero(String nivelFichero) {
        this.nivelFichero = nivelFichero;
    }

    public String getTipoFichero() {
        return tipoFichero;
    }

    public void setTipoFichero(String tipoFichero) {
        this.tipoFichero = tipoFichero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPregunta != null ? idPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reglamento)) {
            return false;
        }
        Reglamento other = (Reglamento) object;
        if ((this.idPregunta == null && other.idPregunta != null) || (this.idPregunta != null && !this.idPregunta.equals(other.idPregunta))) {
            return false;
        }
        return true;
    }

    public int getNumpregunta() {
        return numpregunta;
    }

    public void setNumpregunta(int numpregunta) {
        this.numpregunta = numpregunta;
    }
    
    @Override
    public String toString() {
        return "Entidades.Reglamento[ idPregunta=" + idPregunta + " ]";
    }
    
}
