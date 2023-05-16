package IteracaoFor;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    // exercicio 1 - criar um vetor de 5 nº e imprimir
    public void exercicio1() {
        // criar um vetor de 5 posições
        int vetor[] = new int[5];
        // preencher o vetor "for"
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuario escrever o nº
            System.out.print("Informe o Valor do vetor[" + i + "]=");
            // ler o valor digitado e atribuir a posição do vetor
            vetor[i] = sc.nextInt();
        }
        // Imprimir o vetor "for"
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    // vetor decimal de 10 posições e imprmir na ordem inversa
    public void exercicio2() {
        double vetor[] = new double[10];// vetor de 10 posições
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuario escrever o nº
            System.out.print("Informe o Valor do vetor[" + i + "]=");
            // ler o valor digitado e atribuir a posição do vetor
            vetor[i] = sc.nextDouble();
        }
        // imprimir o vetro na ordem inversa indice 0-9
        for (int i = 9; i >= 0; i--) { // do 9 para o 0
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    // exercicio3 - ler 4 notas e calcular a media
    public void exercicio3() {
        // criar um vetor para receber a média
        double notas[] = new double[4];// vetor de tamanho 4
        // preencher o vetor com as notas
        for (int i = 0; i < notas.length; i++) {
            // solicitar as notas para o usuário
            System.out.print("Informe a Nota " + (i + 1) + " do Aluno:");
            // ler a nota com o scanner
            notas[i] = sc.nextDouble();
        }
        // imprimir as notas e calcular a média
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota [" + (i + 1) + "]=" + notas[i]);
            // acumular o valor das notas na variavel média
            media += notas[i];
        }
        // dividir a média pelo nº de notas
        media /= notas.length;
        // imprimir a média
        System.out.println("A média é " + media);
    }

    // exercicio - ler um vetor de caracteres e contar as consoantes
    public void exercicio4() {
        // char letras[] = new char[]{'a','b','c','d','e','f','g','h','i','j'};
        String letras2[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // percorrer o vetor para procurar letras vogais ou consoantes
        // contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < letras2.length; i++) {
            if (letras2[i] != "a" && letras2[i] != "e" && letras2[i] != "i"
                    && letras2[i] != "o" && letras2[i] != "u") {
                System.out.println(letras2[i] + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println("O nº de consoantes é " + cont);
    }

    // exercicio 4 - extra- ler as consoantes de uma palavra digitada
    public void exercicio4Ex() {
        System.out.println("Digite uma Palavra");
        String palavra = sc.next();// ler a palavra digitada pelo usuario e guardar na String
        palavra = palavra.toLowerCase();
        // percorrer a String para procurar letras vogais ou consoantes
        // contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println("O nº de consoantes é " + cont);
    }
    //ler 20 numeros separa em Pares e Impares
    public void exercicio5() {
        //criar um vetor para os nº
        int numeros[]=new int[20];
        int contPar=0;// contador nº pares
        int contImpar=0;// contador nº Impares
        //Preenncher o vetor de nº e determinar o n] de impares e pares
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o nº["+i+"]=");
            numeros[i]=sc.nextInt();
            if(numeros[i]%2==0){
                contPar++;
            } else{
                contImpar++;
            }
        }
        //após a contagem dos pares e impares criar os respectivos vetores
        int nPar[]=new int[contPar];
        int nImpar[]=new int[contImpar];
        //distribuir os nº do vetor nº para os vetores par e impar
        contPar=0;
        contImpar=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                nPar[contPar]=numeros[i];
                contPar++;
            } else {
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
        }
    }
    
}
