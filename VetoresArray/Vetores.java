package VetoresArray;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um vetor
        double valores[] = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º Posição- Índice[0]:" + valores[0]);
        System.out.println("2º Posição- Índice[1]:" + valores[1]);
        System.out.println("3º Posição- Índice[2]:" + valores[2]);
        System.out.println("4º Posição- Índice[3]:" + valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valore do Índice[0]
        System.out.println("1º Posição- Índice[0]:" + valores[0]);
    }
    public void exemplo2() {
        //criando um vetor
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Nº inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        valoresInt[5]=sc.nextInt();
        System.out.println("1º Posição- Índice[0]:" + valoresInt[0]);
        System.out.println("2º Posição- Índice[1]:" + valoresInt[1]);
        System.out.println("3º Posição- Índice[2]:" + valoresInt[2]);
        System.out.println("4º Posição- Índice[3]:" + valoresInt[3]);
        System.out.println("5º Posição- Índice[4]:" + valoresInt[4]);
    }

    public void exemplo4() {
        //criar o array das notas
        double notas[] = new double[4];
        System.out.println("Digite as 4 notas do Aluno");
        notas[0] = sc.nextDouble();
        notas[1] = sc.nextDouble();
        notas[2] = sc.nextDouble();
        notas[3] = sc.nextDouble();
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println(" A média é "+media);

    }
}
