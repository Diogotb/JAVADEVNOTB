package POOExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

import POOExercicio1.Pessoa;

public class App {
    public static void main(String[] args) {
        Random rd = new Random(0);
        //vetor de objetos
        Agenda pessoas[] = new Agenda[10];
        //preencher o meu vetor/array
        for (int i = 0; i < pessoas.length; i++) {
            //construtor de objetos
            pessoas[i]= new Agenda();
            //preencher os atributos
            pessoas[i].setNome("Pessoa"+i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i+18);
        }
        //buscador
        String nomeDigitado = JOptionPane.showInputDialog("Nome Buscado:");
        // enquanto nomeDigitado != nome do Objeto
        //cont e procure
        int cont = 0;
        
        while(!nomeDigitado.equals(pessoas[cont].getNome())){
                cont++;
        }
        System.out.println("Nome: "+pessoas[cont].getNome()
                            +"Idade: "+pessoas[cont].getIdade()
                            +"Altura: "+pessoas[cont].getAltura());
    }
}
