/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito.unidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raiane
 */
public class InfantariaTest {

    Infantaria instance;

    public InfantariaTest() {
        instance = new Infantaria();
    }

    /**
     * Test of getType method, of class Infantaria.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        assertEquals("Infantaria", instance.getType());
    }

    /**
     * Test of ganhaQuandoAtacadoPor method, of class Infantaria.
     * As catapultas vencem a infantaria e a infantaria vence a cavalaria
     */
    @Test
    public void GanhadorDaBatalha() {
        System.out.println("ganhaQuandoAtacadoPor");
        assertEquals(true, instance.ganhaQuandoAtacadoPor(new Cavalaria()));
    }

    @Test
    public void PerdedorDaBatalha() {
        System.out.println("ganhaQuandoAtacadoPor");
        assertEquals(false, instance.ganhaQuandoAtacadoPor(new Catapulta()));
    }

}
