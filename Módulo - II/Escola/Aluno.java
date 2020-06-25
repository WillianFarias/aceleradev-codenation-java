import java.util.Date;

public class Aluno extends Pessoa {

    public String matricula;

    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }

    public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
      return 0.07 * (double) qtd;
  }
}