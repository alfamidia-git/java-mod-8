import model.Aluno;
import repository.AlunoRepository;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

        List<Aluno> todosAlunos = alunoRepo.readAll();
        todosAlunos.forEach(System.out::println);

        Aluno alunoEspecifico = alunoRepo.readById(4);

        System.out.println("Aluno específico: " + alunoEspecifico);
    }
}