/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jmcastellano
 */
@Embeddable
public class AuditoriasPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    private int idFichero;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Transient
    private String nombre;

    public AuditoriasPK() {
    }

    public AuditoriasPK(int idFichero, Date fecha) {
        this.idFichero = idFichero;
        this.fecha = fecha;
    }

    public int getIdFichero() {
        return idFichero;
    }

    public void setIdFichero(int idFichero) {
        this.idFichero = idFichero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getFechaFormateada(){
        if(this.fecha == null){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.fecha);
    }
    
    public void setFechaFormateada(String fechaformateada){
        
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idFichero;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditoriasPK)) {
            return false;
        }
        AuditoriasPK other = (AuditoriasPK) object;
        if (this.idFichero != other.idFichero) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AuditoriasPK[ idFichero=" + idFichero + ", fecha=" + fecha + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
