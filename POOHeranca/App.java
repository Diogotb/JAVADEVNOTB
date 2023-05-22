package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        //objetos
        Alunos aluno01 = new Alunos();
        //Pessoas pessoa01 = new Pessoas();
        Funcionarios func01 = new Funcionarios();
        Professores prof01 = new Professores();

        //set
        aluno01.setNome("Alberto Silva");
        func01.setSetor("Manutenção");
        prof01.setDiciplina("Matemática");
        
    }
}
