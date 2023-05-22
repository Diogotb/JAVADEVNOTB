package POOIntroducao;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        //criar o objeto
        RegistraAluno aluno1 = new RegistraAluno();//obj
        RegistraAluno aluno2 = new RegistraAluno();//obj
        
        // modificar os atributos(set)
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua das Flores, 123");
        aluno1.setIdade(29);
        aluno1.setNotaCiencias(9.5);
        aluno1.setNotaMatematica(8.3);
        aluno1.setNotaPortugues(7.4);
        
        //acessar os atributos(get)
        System.out.println("Nome:"+aluno1.getNome());
        System.out.println("Endereço:"+aluno1.getEndereco());
        System.out.println("Idade:"+aluno1.getIdade());
        System.out.println("Média:"+aluno1.getMedia());
    }
}