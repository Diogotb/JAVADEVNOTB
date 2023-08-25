import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonAndJLabel {//não vou usar extends
    //Atributos
    int cont;
    //construtor
    public JButtonAndJLabel() {
        //criar um JFrame - Janela Básica para uma aplicação
        JFrame janela = new JFrame("Janela Principal");
        JPanel painel = new JPanel();//Painel(container)
        //adicionar o painel ao frame
        janela.getContentPane().add(painel);//
        //Criar Componentes
        JButton button = new JButton("Clique Aqui!!!");
        JLabel text = new JLabel("Esperando Clicar");
        //adicionar os componentes ao painel
        painel.add(button);
        painel.add(text);
        //configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();//organiza o tamanho da janela
        janela.setVisible(true);
        //action Listener(ação para o botão)
        button.addActionListener(e ->{
            cont++;
            text.setText("Nº de Cliques "+cont);
            painel.add(new JButton(""+cont));
            janela.pack();
        });




    }
}
