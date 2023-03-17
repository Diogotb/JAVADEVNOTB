package ExercicioIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Primeiro Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor:");
        int valor2 = sc.nextInt();
        if (valor1>valor2) {
            System.out.println("o Primeiro valor é maior "+valor1 );
        } else if (valor2>valor1) {
            System.out.println("O Segundo valor é maior "+valor2);
        } else {
            System.out.println("Os valores são iguais");
        }

        
    }

    public void exercicio4() {
        System.out.println("Informe o nº de Maças");
        int nMacas = sc.nextInt();
        double valorMacas;
        if(nMacas>=12){
            valorMacas = 0.25;
        } else{
            valorMacas = 0.30;
        }
        double valorCompra = nMacas*valorMacas;
        System.out.println("O Valor da Compra é R$ "+valorCompra);

    }
    public void exercicio5() {
        System.out.println("Informe o Primeiro Valor:");
        int n1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor:");
        int n2 = sc.nextInt();
        System.out.println("Informe o Terceiro Valor:");
        int n3 = sc.nextInt();
        //n1<n2<n3
        if(n1<n2 && n2<n3){
            System.out.println("A Ordem Crescente é "+n1+","+n2+","+n3);
        } else if(n1<n3 && n3<n2){ //n1<n3<n2
            System.out.println("A Ordem Crescente é "+n1+","+n3+","+n2);
        } else if(n2<n1 && n1<n3){ //n2<n1<n3
            System.out.println("A Ordem Crescente é "+n2+","+n1+","+n3);
        } else if(n2<n3 && n3<n1){ //n2<n3<n1
            System.out.println("A Ordem Crescente é "+n2+","+n3+","+n1);
        } else if(n2<n1 && n1<n2){ //n3<n1<n2
            System.out.println("A Ordem Crescente é "+n3+","+n1+","+n2);
        }else { //n3<n2<n1
            System.out.println("A Ordem Crescente é "+n3+","+n2+","+n1);
        }
    }

}
