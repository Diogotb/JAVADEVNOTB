package IteracaoFor;

import java.util.Scanner;

/**
 * ExercicioFor
 */
public class ExercicioFor {

    public void exercicio7() {
        //criar vetor
        int vetor[]=new int[]{1,2,3,5,7};
        //percorrer o vetor e realizar as operações(+ e *)
        int soma = 0;//acumular a soma dos elementos do vetor
        int mult = 1;//acumular a multiplicação dos elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i]; //acumula a soma
            mult*=vetor[i]; //acumula a multiplicação
        }
        System.out.println("O valor da Soma do vetor é "+soma);
        System.out.println("O valor da Multiplicação do vetor é "+mult);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
}