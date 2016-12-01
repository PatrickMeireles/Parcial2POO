/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class TestaJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jogo novoJogo = new Jogo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Inicio de Jogo");

        System.out.println("Qual número de unidades convocadas?");
        novoJogo.setTamanhoDoExercito(sc.nextInt());

        novoJogo.inicializarExercito();

        while (!novoJogo.verificaFimJogo()) {
            novoJogo.novoAtaque();
        }

    }
}
