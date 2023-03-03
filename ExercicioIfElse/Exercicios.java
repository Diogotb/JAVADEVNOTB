package ExercicioIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Valor 1:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Valor 2:");
        int valor2 = sc.nextInt();
        if (valor1>valor2){
            System.out.println("O Maior Valor é "
                    +valor1);
        } else if(valor1<valor2){
            System.out.println("O Maior Valor é "
                    +valor2);
        } else{
            System.out.println("O valores são Iguais");
        }

        
    }

    public void exercicio2() {
        
    }
}
