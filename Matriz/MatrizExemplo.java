package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        //gerar preencher, imprimir e manipular matrizes
        //criar uma matriz 10x9
        int matriz[][] = new int[10][9];//bidimensional 10x9
        //preencher minha matriz
        for (int i = 0; i < 10; i++) {//1º dimensão //linha
            for (int j = 0; j < 9; j++) {//2º dimensão //coluna
                //System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j]=rd.nextInt(10);          
            }
        }
        //imprimir elemento por elemento da minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz["+i+"]["+j+"]="
                        +matriz[i][j]);
            }
        }
        //imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        // somar todos os elementos da 4 linha
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Linha 4 é "+somaLinha);

        //somas todos os elementos da 4ª coluna
        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Coluna 4 é "+somaColuna);
    }

    public void exercicio1() {
        //imrpimir uma matriz identidade(diagonal =1)
        //gerar a matriz
        int matriz[][] = new int[10][10];//criei uma matriz 5x5
        //preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //se i=j matriz[i][j]=1
                if (i==j) { //diagonal principal
                    matriz[i][j]=1;
                } else{ // d+ elementos
                    matriz[i][j]=0;
                }
            }
        }
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
    }
    public void exercicio2() {
        //criar uma matriz(random), imprimir normal e transposta
        int matriz[][]=new int[4][4];//gerou matriz 4x4
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= rd.nextInt(10);
            }
        }
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("+++++++++++++++++++++");
        //imprimir a transposta (inversão Linha com Coluna)
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("|");
        }
        System.out.println("+++++++++++++++++++++");
        //b. somar todos os item da diagonal principal(i=j)
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //soamr os item somente da diagonal principal
                if (i==j) {
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println("A Soma da diagonal é "+soma);
    }
}
