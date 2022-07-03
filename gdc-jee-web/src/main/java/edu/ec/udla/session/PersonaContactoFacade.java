/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.udla.session;

import edu.ec.udla.domain.PersonaContacto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sebastianbelalcazar
 */
@Stateless
public class PersonaContactoFacade extends AbstractFacade<PersonaContacto> {

    @PersistenceContext(unitName = "gdcPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaContactoFacade() {
        super(PersonaContacto.class);
    }
    
}
