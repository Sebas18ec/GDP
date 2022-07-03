/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.udla.services;

import edu.ec.udla.domain.Proveedor;
import edu.ec.udla.session.ProveedorFacade;
import javax.inject.Inject;

/**
 *
 * @author sebastianbelalcazar
 */
public class ProveedorServiceImpl implements ProveedorService {
    
     @Inject
    private ProveedorFacade proveedorFacade;
    
    @Override
    public void agregarProveedor(Proveedor proveedor) {
        proveedorFacade.create(proveedor);
    }

    @Override
    public void actualizarProveedor(Proveedor proveedor) {
        proveedorFacade.edit(proveedor);
    }

    @Override
    public void eliminarProveedor(Proveedor proveedor) {
        proveedorFacade.remove(proveedor);
    }
}
