import model.Aluno;
import repository.AlunoRepository;
import repository.Conexao;

import java.sql.Connection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

        alunoRepo.delete(4);
    }
}