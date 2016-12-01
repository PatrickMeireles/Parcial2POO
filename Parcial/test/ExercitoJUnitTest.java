/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import br.com.exercito.Exercito;

/**
 *
 * @author alunos
 */
public class ExercitoJUnitTest {
    
    Exercito exercito;
    
    public ExercitoJUnitTest() {
    }
    
    @Before
    public void setUp() {
    exercito= new Exercito();
    }
    
    @Test
    public void verificarSeObterUnidadeSempreRetornaAleatorio(){
        //assertEquals(null, exercito, this);
    }
    
}
