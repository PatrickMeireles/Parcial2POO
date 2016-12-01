/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito.unidade;

/**
 *
 * @author alunos
 */
public class Infantaria extends Unidade {

    public Infantaria() {
         this.identificador = "Infantaria";
    }
    
    @Override
    public String getType(){
        return identificador;
    }
    
   /**
     * A regra para unidade ganhar de outra é a seguinte:
     * As catapultas vencem a infantaria e a infantaria vence a cavalaria
     *
     * @param uni Unidade inimiga
     * @return Ganhador do confronto 
     */
    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade uni) {
        return (uni instanceof Cavalaria);
    }
    
}
