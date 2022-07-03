/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.udla.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebastianbelalcazar
 */
@Entity
@Table(catalog = "gestion_de_compras", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaContacto.findAll", query = "SELECT p FROM PersonaContacto p"),
    @NamedQuery(name = "PersonaContacto.findByIdPersonaContacto", query = "SELECT p FROM PersonaContacto p WHERE p.idPersonaContacto = :idPersonaContacto"),
    @NamedQuery(name = "PersonaContacto.findByNombre", query = "SELECT p FROM PersonaContacto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PersonaContacto.findByPosicion", query = "SELECT p FROM PersonaContacto p WHERE p.posicion = :posicion"),
    @NamedQuery(name = "PersonaContacto.findByNumCelular", query = "SELECT p FROM PersonaContacto p WHERE p.numCelular = :numCelular"),
    @NamedQuery(name = "PersonaContacto.findByTelefonoFijo", query = "SELECT p FROM PersonaContacto p WHERE p.telefonoFijo = :telefonoFijo"),
    @NamedQuery(name = "PersonaContacto.findByEmail", query = "SELECT p FROM PersonaContacto p WHERE p.email = :email")})
public class PersonaContacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer idPersonaContacto;
    @Size(max = 45)
    private String nombre;
    @Size(max = 45)
    private String posicion;
    @Size(max = 45)
    private String numCelular;
    @Size(max = 45)
    private String telefonoFijo;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    private String email;

    public PersonaContacto() {
    }

    public PersonaContacto(Integer idPersonaContacto) {
        this.idPersonaContacto = idPersonaContacto;
    }

    public Integer getIdPersonaContacto() {
        return idPersonaContacto;
    }

    public void setIdPersonaContacto(Integer idPersonaContacto) {
        this.idPersonaContacto = idPersonaContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonaContacto != null ? idPersonaContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaContacto)) {
            return false;
        }
        PersonaContacto other = (PersonaContacto) object;
        if ((this.idPersonaContacto == null && other.idPersonaContacto != null) || (this.idPersonaContacto != null && !this.idPersonaContacto.equals(other.idPersonaContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ec.udla.domain.PersonaContacto[ idPersonaContacto=" + idPersonaContacto + " ]";
    }
    
}
