/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito.unidade;

/**
 * Anotações:
 * Catapulta > Infantaria
 * Infantaria > Cavalaria
 * Cavalaria > Catapulta
 */
public abstract class Unidade {
    
    protected String identificador;
    
    public abstract boolean ganhaQuandoAtacadoPor(Unidade uni);
    
    public abstract String getType();
    
}
