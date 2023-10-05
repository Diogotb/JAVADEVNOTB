import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;

public class Exercicio1CardLayout extends JFrame{
    public Exercicio1CardLayout() {
        super("Exercicio 1");
        //painel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        this.add(mainPanel);//
        //criar os elementos do painel principal
        //add um botão ao norte
        JButton button = new JButton("Next");
        mainPanel.add(button,BorderLayout.NORTH);
        //add um painel de cards ao centro -> CardLayout
        CardLayout cl = new CardLayout();//layout do painel 
        JPanel cardPanel = new JPanel(cl); //criação do painel no layout
        mainPanel.add(cardPanel,BorderLayout.CENTER);
        //criar os paineis do cardLayout
        JPanel card1 = new JPanel();//card1
        card1.add(new JLabel("Card 1"));
        cardPanel.add(card1,"Card 1");
        JPanel card2 = new JPanel();//card2
        card2.add(new JLabel("Card 2"));
        cardPanel.add(card2,"Card 2");
        JPanel card3 = new JPanel();//card3
        card3.add(new JLabel("Card 3"));
        cardPanel.add(card3,"Card 3");
        //set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //criar a ação para o botão
        button.addActionListener(e->{
            cl.next(cardPanel);
        });




    }
    
}