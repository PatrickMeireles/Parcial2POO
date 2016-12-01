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
public class Cavalaria extends Unidade {

    public Cavalaria() {
        this.identificador = "Cavalaria";
    }

    /**
     * A regra para unidade ganhar de outra é a seguinte:
     * A infantaria vence a cavalaria e a cavalaria vence as catapultas
     *
     * @param uni Unidade inimiga
     * @return Ganhador do confronto 
     */
    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade uni) {
        return (uni instanceof Catapulta);
    }

    @Override
    public String getType() {
        return identificador;
    }

}
