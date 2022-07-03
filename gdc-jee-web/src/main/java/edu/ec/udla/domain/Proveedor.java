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
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor"),
    @NamedQuery(name = "Proveedor.findByCedula", query = "SELECT p FROM Proveedor p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Proveedor.findByRazonSocial", query = "SELECT p FROM Proveedor p WHERE p.razonSocial = :razonSocial"),
    @NamedQuery(name = "Proveedor.findByNombreComercial", query = "SELECT p FROM Proveedor p WHERE p.nombreComercial = :nombreComercial"),
    @NamedQuery(name = "Proveedor.findByDireccion", query = "SELECT p FROM Proveedor p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Proveedor.findByCiudad", query = "SELECT p FROM Proveedor p WHERE p.ciudad = :ciudad"),
    @NamedQuery(name = "Proveedor.findByPais", query = "SELECT p FROM Proveedor p WHERE p.pais = :pais"),
    @NamedQuery(name = "Proveedor.findByRepLegal", query = "SELECT p FROM Proveedor p WHERE p.repLegal = :repLegal"),
    @NamedQuery(name = "Proveedor.findByPaginaWeb", query = "SELECT p FROM Proveedor p WHERE p.paginaWeb = :paginaWeb"),
    @NamedQuery(name = "Proveedor.findByIndustriaNacional", query = "SELECT p FROM Proveedor p WHERE p.industriaNacional = :industriaNacional"),
    @NamedQuery(name = "Proveedor.findByNumeroTrabajadores", query = "SELECT p FROM Proveedor p WHERE p.numeroTrabajadores = :numeroTrabajadores"),
    @NamedQuery(name = "Proveedor.findByNomina", query = "SELECT p FROM Proveedor p WHERE p.nomina = :nomina"),
    @NamedQuery(name = "Proveedor.findByNaturalezaNegocio", query = "SELECT p FROM Proveedor p WHERE p.naturalezaNegocio = :naturalezaNegocio"),
    @NamedQuery(name = "Proveedor.findByBajoPedido", query = "SELECT p FROM Proveedor p WHERE p.bajoPedido = :bajoPedido")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer idProveedor;
    @Size(max = 45)
    private String cedula;
    @Size(max = 45)
    private String razonSocial;
    @Size(max = 45)
    private String nombreComercial;
    @Size(max = 45)
    private String direccion;
    @Size(max = 45)
    private String ciudad;
    @Size(max = 45)
    private String pais;
    @Size(max = 45)
    private String repLegal;
    @Size(max = 45)
    private String paginaWeb;
    private Short industriaNacional;
    private Integer numeroTrabajadores;
    private Integer nomina;
    @Size(max = 45)
    private String naturalezaNegocio;
    private Short bajoPedido;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRepLegal() {
        return repLegal;
    }

    public void setRepLegal(String repLegal) {
        this.repLegal = repLegal;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Short getIndustriaNacional() {
        return industriaNacional;
    }

    public void setIndustriaNacional(Short industriaNacional) {
        this.industriaNacional = industriaNacional;
    }

    public Integer getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(Integer numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public Integer getNomina() {
        return nomina;
    }

    public void setNomina(Integer nomina) {
        this.nomina = nomina;
    }

    public String getNaturalezaNegocio() {
        return naturalezaNegocio;
    }

    public void setNaturalezaNegocio(String naturalezaNegocio) {
        this.naturalezaNegocio = naturalezaNegocio;
    }

    public Short getBajoPedido() {
        return bajoPedido;
    }

    public void setBajoPedido(Short bajoPedido) {
        this.bajoPedido = bajoPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ec.udla.domain.Proveedor[ idProveedor=" + idProveedor + " ]";
    }
    
}
