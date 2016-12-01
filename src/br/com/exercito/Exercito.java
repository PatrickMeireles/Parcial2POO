/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito;

import br.com.exercito.unidade.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * Obtém unidade a partir de um sorteio
 *
 * @author alunos Tamanho exército: 10
 */
public class Exercito {

    private String nome;
    private final ArrayList<Unidade> unidades;
    private Random random;

    //estrutura do exército
    public Exercito() {
        unidades = new ArrayList();
    }

    public Exercito(String nome) {
        this.nome = nome;
        unidades = new ArrayList();
        random = new Random();
    }

    public Unidade obterUnidade() {
        return unidades.get(random.nextInt(unidades.size()));
    }

    public void removerUnidade(Unidade unidade) {
        unidades.remove(unidade);
    }

    public void adicionaUnidade(Unidade unidade) {
        unidades.add(unidade);
    }

    public int totalUnidades() {
        return unidades.size();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String retorno = this.getNome();
        for (Iterator<Unidade> iterator = unidades.iterator(); iterator.hasNext();) {
            retorno = retorno+ "\n" + iterator.next().getType();
        } 
        return retorno;
    }

}
