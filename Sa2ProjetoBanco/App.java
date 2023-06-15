package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

import Sa2ProjetoBanco.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        //criar o meu vetor de objetos
        ContaPJ clientePJ[] = new ContaPJ[10];
        //começar meu banco
        boolean aberto = true;
        int contPJ=0;//contador de contas abertas
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                        +"\n 1-Abrir Conta PJ"
                        +"\n 2-Abrir Cont PF"
                        +"\n 3-Acessar Conta PJ"
                        +"\n 4-Acessar Conta PF"
                        +"\n 5-Sair"));
            if(acao==1){//abrir a conta 
                //criar um objeto
                clientePJ[contPJ] = new ContaPJ();//chamei o construtor
                //preencher os atributos do objeto
                clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa:"));
                clientePJ[contPJ].setnConta(2000+contPJ);
                clientePJ[contPJ].setSaldo(0);
                //acrescimo no contador
                JOptionPane.showMessageDialog(null,"Conta Criada com Sucesso");
                contPJ++;
            } else if(acao==2){ //acessar uma conta já criada
                //localizar a conta no vetor
                int i;//contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta buscada"));
                for (i = 0; i < clientePJ.length; i++) {
                    if(nContaBuscada==clientePJ[i].getnConta()){
                        JOptionPane.showMessageDialog(null,"Conta Encontrada");
                        break;
                    }
                }
                //menu de acesso da conta
                boolean acesso = true;
                while(acesso){ //acessei a conta
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                        +"\n 1-Consultar o Saldo"
                        +"\n 2-Realizar um Saque"
                        +"\n 3-..."));
                    if(acao2==1){//saldo
                        JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ "+clientePJ[i].getSaldo());
                    }
                }
            }
        }
    }
}
