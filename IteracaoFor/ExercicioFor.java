package IteracaoFor;

import java.util.Scanner;

/**
 * ExercicioFor
 */
public class ExercicioFor {
    Scanner sc = new Scanner(System.in);
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

    public void exercicio8() {
        // ler idade e altura de 5 pessoas
        String nome[] = new String[5];
        int idade[] = new int[5];
        double altura[] = new double[5];
        for (int i = 0; i < altura.length; i++) {
            System.out.print("Informe o Nome :");
            nome[i]=sc.next();
            System.out.print("Informe a Idade :");
            idade[i]=sc.nextInt(i);
            System.out.print("Informe a altura: ");
            altura[i]=sc.nextDouble();
            System.out.println("======================");
        }
        //imprimir na ordem inversa
        for (int i = 4; i >=0; i--) {
            System.out.println("Nome: "+nome[i]);
            System.out.println("Idade: "+idade[i]);
            System.out.println("Altura: "+altura[i]);
            System.out.println("=====================");
        }
    }
    public void exercicio9() {
        //soma dos quadrados dos elementos do vetor
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i]*vetor[i];
        }
        System.out.println("a Soma dos Quadrados é "+soma);
    }
}