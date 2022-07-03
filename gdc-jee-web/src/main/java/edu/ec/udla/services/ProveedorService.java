/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ec.udla.services;

import edu.ec.udla.domain.Proveedor;

/**
 *
 * @author sebastianbelalcazar
 */
public interface ProveedorService {
    
    public void agregarProveedor(Proveedor proveedor);

    public void actualizarProveedor(Proveedor proveedor);

    public void eliminarProveedor(Proveedor proveedor);
    
}
