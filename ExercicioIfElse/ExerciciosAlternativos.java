package ExercicioIfElse;

import java.util.Scanner;

public class ExerciciosAlternativos {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Primeiro Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor:");
        int valor2 = sc.nextInt();
        if (valor1>valor2){
            System.out.println("O Primeiro Valor é Maior "+valor1);
        }
        if (valor2>valor1){
            System.out.println("O Segundo Valor é Maior "+valor2);
        }
        if (valor1==valor2){
            System.out.println("Os valores são iguais");
        }

        
    }
}
