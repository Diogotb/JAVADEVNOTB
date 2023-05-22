import java.util.Random;
import java.util.Scanner;

public class Atividades {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int matriz[][] = new int[linha][coluna];
        
    }
    public void exercicio2() {
        int nSorteado = rd.nextInt(1000);
        int nDigitado;
        System.out.println("Digite um nº");
        nDigitado = sc.nextInt();
        int contador=1;
        while(nSorteado!=nDigitado){
            // falar se é ><
            contador++;
        }
        //falar que conseguiu e o nº de vezes
    }
    public void atividade3() {
        int tamanhoVetor = rd.nextInt(1000);
        int vetor[] = new int[tamanhoVetor];
        //preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;
        }
        //imprimir os nº pares do vetor
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
            }
        }
    }
}
