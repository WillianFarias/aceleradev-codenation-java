import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Aluno> listaAluno = new ArrayList<>();
    List<Integer> idades = new ArrayList<>();

    Integer quantidade = 4;

    Aluno aluno1 = new Aluno("Willian", 27, 10);
    Aluno aluno2 = new Aluno("Samanta", 1, 50);
    Aluno aluno3 = new Aluno("Amanda", 33, 30);
    Aluno aluno4 = new Aluno("Bebe", 1, 40);

    listaAluno.add(aluno1);
    listaAluno.add(aluno2);
    listaAluno.add(aluno3);
    listaAluno.add(aluno4);

    /*
    if (!listaAluno.isEmpty()) {
      for (Aluno aluno : listaAluno) {
        System.out.println(aluno.getNome() + " " + aluno.getIdade());
      }
    } else {
      System.out.println("Lista vazia");
    }*/

    if (!listaAluno.isEmpty()) {
      listaAluno.sort((a, b) -> a.getIdade().compareTo(b.getIdade()));

      for(int i = 0; i < listaAluno.size() - 1; i++){
        if (listaAluno.get(i).getIdade() == listaAluno.get(i+1).getIdade()) {
          if (listaAluno.get(i).getAltura() > listaAluno.get(i+1).getAltura()) {

            Integer novaAltura = listaAluno.get(i+1).getAltura();
            
            listaAluno.get(i+1).setAltura(listaAluno.get(i).getAltura());
            listaAluno.get(i).setAltura(novaAltura);
          }
        }
      }


      if (listaAluno.size() > quantidade - 1) {
        for (int i = 0; i < quantidade; i++) {
          idades.add(listaAluno.get(i).getAltura());
        }
      } else {
        for (int i = 0; i < listaAluno.size(); i++) {
          idades.add(listaAluno.get(i).getAltura());
        }
      }
    }else{
      System.out.println("Lista vazia");
    }

    // idades = null;

    System.out.println(idades + "" + listaAluno.size());

  }
}