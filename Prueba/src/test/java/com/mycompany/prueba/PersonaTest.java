/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    static Persona persona;
    @BeforeClass
    public static void setUpClass() {
        persona=new Persona();
    }
    
     @Test
     public void mayor5() {
         persona.setNombre("nombre1");
         assertTrue(persona.getNombre().length()>5);
     }
     
     @Test(expected = NullPointerException.class)
     public void nullpointer(){
         persona.setNombre(null);
        persona.getNombre().toUpperCase();
     }
}
