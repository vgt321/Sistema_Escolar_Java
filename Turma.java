import java.util.Scanner;
import java.util.ArrayList;
public class Turma {
    ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    Scanner scanner = new Scanner(System.in);
    
    public void addAluno(Aluno aluno){
        System.out.println("Adicionar aluno");
        System.out.println("Digite o nome do aluno:");
        String sc = scanner.next();
        aluno.add(sc); // guardando o nome do aluno
    }
}
