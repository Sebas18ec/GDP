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
    @NamedQuery(name = "DatosFinancieros.findAll", query = "SELECT d FROM DatosFinancieros d"),
    @NamedQuery(name = "DatosFinancieros.findByIdDatosFinancieros", query = "SELECT d FROM DatosFinancieros d WHERE d.idDatosFinancieros = :idDatosFinancieros"),
    @NamedQuery(name = "DatosFinancieros.findByTipoContribuyente", query = "SELECT d FROM DatosFinancieros d WHERE d.tipoContribuyente = :tipoContribuyente"),
    @NamedQuery(name = "DatosFinancieros.findByNumAutorizacionSRI", query = "SELECT d FROM DatosFinancieros d WHERE d.numAutorizacionSRI = :numAutorizacionSRI"),
    @NamedQuery(name = "DatosFinancieros.findByEspecialesFundaciones", query = "SELECT d FROM DatosFinancieros d WHERE d.especialesFundaciones = :especialesFundaciones"),
    @NamedQuery(name = "DatosFinancieros.findByNombreBanco", query = "SELECT d FROM DatosFinancieros d WHERE d.nombreBanco = :nombreBanco"),
    @NamedQuery(name = "DatosFinancieros.findByNumeroCuenta", query = "SELECT d FROM DatosFinancieros d WHERE d.numeroCuenta = :numeroCuenta"),
    @NamedQuery(name = "DatosFinancieros.findByTipoCuenta", query = "SELECT d FROM DatosFinancieros d WHERE d.tipoCuenta = :tipoCuenta"),
    @NamedQuery(name = "DatosFinancieros.findByCodigoSwiftActivo", query = "SELECT d FROM DatosFinancieros d WHERE d.codigoSwiftActivo = :codigoSwiftActivo"),
    @NamedQuery(name = "DatosFinancieros.findByBancoExterior", query = "SELECT d FROM DatosFinancieros d WHERE d.bancoExterior = :bancoExterior"),
    @NamedQuery(name = "DatosFinancieros.findByCodigoSwift", query = "SELECT d FROM DatosFinancieros d WHERE d.codigoSwift = :codigoSwift"),
    @NamedQuery(name = "DatosFinancieros.findByBajoPedido", query = "SELECT d FROM DatosFinancieros d WHERE d.bajoPedido = :bajoPedido")})
public class DatosFinancieros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer idDatosFinancieros;
    @Size(max = 45)
    private String tipoContribuyente;
    @Size(max = 45)
    private String numAutorizacionSRI;
    @Size(max = 45)
    private String especialesFundaciones;
    @Size(max = 45)
    private String nombreBanco;
    @Size(max = 45)
    private String numeroCuenta;
    private Short tipoCuenta;
    private Short codigoSwiftActivo;
    private Short bancoExterior;
    @Size(max = 45)
    private String codigoSwift;
    private Short bajoPedido;

    public DatosFinancieros() {
    }

    public DatosFinancieros(Integer idDatosFinancieros) {
        this.idDatosFinancieros = idDatosFinancieros;
    }

    public Integer getIdDatosFinancieros() {
        return idDatosFinancieros;
    }

    public void setIdDatosFinancieros(Integer idDatosFinancieros) {
        this.idDatosFinancieros = idDatosFinancieros;
    }

    public String getTipoContribuyente() {
        return tipoContribuyente;
    }

    public void setTipoContribuyente(String tipoContribuyente) {
        this.tipoContribuyente = tipoContribuyente;
    }

    public String getNumAutorizacionSRI() {
        return numAutorizacionSRI;
    }

    public void setNumAutorizacionSRI(String numAutorizacionSRI) {
        this.numAutorizacionSRI = numAutorizacionSRI;
    }

    public String getEspecialesFundaciones() {
        return especialesFundaciones;
    }

    public void setEspecialesFundaciones(String especialesFundaciones) {
        this.especialesFundaciones = especialesFundaciones;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Short getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(Short tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Short getCodigoSwiftActivo() {
        return codigoSwiftActivo;
    }

    public void setCodigoSwiftActivo(Short codigoSwiftActivo) {
        this.codigoSwiftActivo = codigoSwiftActivo;
    }

    public Short getBancoExterior() {
        return bancoExterior;
    }

    public void setBancoExterior(Short bancoExterior) {
        this.bancoExterior = bancoExterior;
    }

    public String getCodigoSwift() {
        return codigoSwift;
    }

    public void setCodigoSwift(String codigoSwift) {
        this.codigoSwift = codigoSwift;
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
        hash += (idDatosFinancieros != null ? idDatosFinancieros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosFinancieros)) {
            return false;
        }
        DatosFinancieros other = (DatosFinancieros) object;
        if ((this.idDatosFinancieros == null && other.idDatosFinancieros != null) || (this.idDatosFinancieros != null && !this.idDatosFinancieros.equals(other.idDatosFinancieros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ec.udla.domain.DatosFinancieros[ idDatosFinancieros=" + idDatosFinancieros + " ]";
    }
    
}
