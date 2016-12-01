/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercito;

import br.com.exercito.unidade.Catapulta;
import br.com.exercito.unidade.Cavalaria;
import br.com.exercito.unidade.Infantaria;
import br.com.exercito.unidade.Unidade;
import java.util.Random;

/**
 *
 * @author exercito1: Exercito exercito2: Exercito inicializarExercito(): void
 * novoAtaque(): void verificaFimJogo(): Boolean obterExercitoVencedor():
 * Exercito
 *
 */
public class Jogo {

    //Instacia do objeto Exercito
    //chamar contador
    private Exercito exercito1;
    private Exercito exercito2;
    private Unidade unidadeExercito1;
    private Unidade unidadeExercito2;
    private int tamanhoDoExercito;
    private Random random;

    public int getTamanhoDoExercito() {
        return tamanhoDoExercito;
    }

    public void setTamanhoDoExercito(int tamanhoDoExercito) {
        this.tamanhoDoExercito = tamanhoDoExercito;
    }

    public void inicializarExercito() {
        //Instancia do objeto exercito
        exercito1 = new Exercito("Exercito 1");
        exercito2 = new Exercito("Exercito 2");
        random = new Random();

        for (int i = 0; i < getTamanhoDoExercito(); i++) {
            addUnidadeAoExercito(exercito1);
            addUnidadeAoExercito(exercito2);
        }

        System.out.println("-------------Jogo iniciado com sucesso!---------------------");
        System.out.println(exercito1.toString());
        System.out.println("------------------------------------------------------------");
        System.out.println(exercito2.toString());

    }

    public void novoAtaque() {
        unidadeExercito1 = exercito1.obterUnidade();
        unidadeExercito2 = exercito2.obterUnidade();

        System.out.println("---------------------Novo Ataque------------------------");
        System.out.println(unidadeExercito1.getType() + " X " + unidadeExercito2.getType());

        if (unidadeExercito1.getClass() == unidadeExercito2.getClass()) {
            exercito1.removerUnidade(unidadeExercito1);
            exercito2.removerUnidade(unidadeExercito2);
            System.out.println("Ambas as tropas foram perdidas");
        } else {
            if (unidadeExercito1.ganhaQuandoAtacadoPor(unidadeExercito2) == true) {
                exercito2.removerUnidade(unidadeExercito2);
                System.out.println(exercito1.getNome() + " ganhou essa batalha");
            } else {
                exercito1.removerUnidade(unidadeExercito1);
                System.out.println(exercito2.getNome() + " ganhou essa batalha");
            }
        }

        System.out.println(exercito1.getNome() + " Total de unidades: " + exercito1.totalUnidades());
        System.out.println(exercito2.getNome() + " Total de unidades: " + exercito2.totalUnidades());

    }

    private void addUnidadeAoExercito(Exercito exercito) {

        switch (random.nextInt(3)) {
            case 0:
                exercito.adicionaUnidade(new Catapulta());
                break;
            case 1:
                exercito.adicionaUnidade(new Infantaria());
                break;
            case 2:
                exercito.adicionaUnidade(new Cavalaria());
                break;
        }

    }

    /**
     * Verifica se algumas dos exercitos tiver menos de 25% das unidades finais
     *
     * @return Um dos exercitos sai como ganhador
     */
    public boolean verificaFimJogo() {
        return ((exercito1.totalUnidades() * 100 / getTamanhoDoExercito()) <= 25)
                || ((exercito2.totalUnidades() * 100 / getTamanhoDoExercito()) <= 25);
    }

}
