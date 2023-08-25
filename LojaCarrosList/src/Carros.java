<<<<<<< HEAD
import javax.swing.JOptionPane;

public class Carros {
    //Atributos
=======
public class Carros {
    //atributos
>>>>>>> 2a28badc856c0745d4164933efbb86ca8f61ad8f
    String marca;
    String modelo;
    String ano;
    String cor;
    //métodos
<<<<<<< HEAD
    //Cosntrutor Cheio
=======
    //Construtor(2 cheio, vazio)
>>>>>>> 2a28badc856c0745d4164933efbb86ca8f61ad8f
    public Carros(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
<<<<<<< HEAD
    //Construtor Vazio
    public Carros() {
    }
    //Getters and Setters
=======
    public Carros() {
    }
    //getters and setters
>>>>>>> 2a28badc856c0745d4164933efbb86ca8f61ad8f
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
<<<<<<< HEAD
    //método próprio
    public String imprimirLN(){//listar
        String imprimir = marca+" "+modelo+"\n";
        return imprimir;
    }
    public void imprimir(){//consultar
        JOptionPane.showMessageDialog(null, marca+"\n"+modelo+"\n"+ano+"\n"+cor);
    }
=======
    
    
>>>>>>> 2a28badc856c0745d4164933efbb86ca8f61ad8f
}
