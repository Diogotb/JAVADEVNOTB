package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letras() {
        System.out.println("Digite uma letras");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " é vogal");
                break;
            case "e":
                System.out.println(letra + " é vogal");
                break;
            case "i":
                System.out.println(letra + " é vogal");
                break;
            case "o":
                System.out.println(letra + " é vogal");
                break;
            case "u":
                System.out.println(letra + " é vogal");
                break;
            default:
                System.out.println(letra + " é consoante");
                break;

        }
    }
    public void mes(){
        System.out.println("Informe um nº de 1 a 12 Ref. meses do ano");
        int nMes = sc.nextInt();
        String nomeMes = "";
        switch(nMes){
            case 1: nomeMes = "Janeiro";
            break;
            case 2: nomeMes = "Fevereiro";
            break;
            case 3: nomeMes = "Março";
            break;
            case 4: nomeMes = "Abril";
            break;
            case 5: nomeMes = "Janeiro";
            break;
            case 6: nomeMes = "Janeiro";
            break;
            case 7: nomeMes = "Janeiro";
            break;
            case 8: nomeMes = "Janeiro";
            break;
            case 9: nomeMes = "Janeiro";
            break;
            case 10: nomeMes = "Janeiro";
            break;
            case 11: nomeMes = "Janeiro";
            break;
            case 12: nomeMes = "Janeiro";
            break;
            default: nomeMes="Informe um nº válido";
            break;
        }
        System.out.println("o mês de Referência é "+nomeMes);
    }
}
