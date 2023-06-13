package Sa2ProjetoBanco.Conta;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public abstract class Conta {
    //atributos comuns
    String nome;
    int nConta;
    double saldo;
    //métodos
    //construtor default(vazio)
    //sets and gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //métodos opcionais
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        saldo -=saque;
    }
    
}
