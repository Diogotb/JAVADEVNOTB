package EstudoArrayList;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    //atributos
    HashMap <String,String> capitalEstados = new HashMap<>();
    HashMap <String,Integer> pessoasIdade = new HashMap<>();
    //método
    public void teste() {
        capitalEstados.put("SP","São Paulo");
        capitalEstados.put("MG","Belo Horizonte");
        capitalEstados.put("RJ","Rio de Janeiro");
        capitalEstados.put("ES","Vitória");
        boolean jogo = true;
        while(jogo){
            String Estado = JOptionPane.showInputDialog("Digite a Sigla do Estado");
            JOptionPane.showMessageDialog(null, capitalEstados.get(Estado));
        }
    }
    public void name() {
        pessoasIdade.put("Maria",18);
        pessoasIdade.put("João",35);
        for (String nome : pessoasIdade.keySet()) {
            JOptionPane.showMessageDialog(null, "Nome: "
                    +nome+", "+pessoasIdade.get(nome));
        }
    }
}
