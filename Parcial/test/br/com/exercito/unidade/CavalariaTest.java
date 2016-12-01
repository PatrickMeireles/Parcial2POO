/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito.unidade;

import org.junit.After;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raiane
 */
public class CavalariaTest {
    
   Cavalaria instance;

    public CavalariaTest() {
        instance = new Cavalaria();
    }

    /**
     * Test of getType method, of class Infantaria.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        assertEquals("Cavalaria", instance.getType());
    }

    /**
     * Test of ganhaQuandoAtacadoPor method, of class Infantaria.
     *  A infantaria vence a cavalaria e a cavalaria vence as catapultas
     */
    @Test
    public void GanhadorDaBatalha() {
        System.out.println("ganhaQuandoAtacadoPor");
        assertEquals(true, instance.ganhaQuandoAtacadoPor(new Catapulta()));
    }

    @Test
    public void PerdedorDaBatalha() {
        System.out.println("ganhaQuandoAtacadoPor");
        assertEquals(false, instance.ganhaQuandoAtacadoPor(new Infantaria()));
    }
    
}
