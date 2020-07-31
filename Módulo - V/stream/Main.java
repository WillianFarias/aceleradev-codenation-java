import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    List<Pessoa> pessoas = new Pessoa().populaPessoas();
    Stream<Pessoa> stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

    //mapToInt() IntStream
    //Usando map
    IntStream streamIdade = pessoas.stream().
    filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).
    //Method Reference
    mapToInt(Pessoa::getIdade);

    //sorted, ordenacao
    Stream<Pessoa> streamOrdenada = pessoas.stream().
    filter(pessoa -> pessoa.getNacionalidade().
    equals("Brasil")).sorted(Comparator.comparing(Pessoa::getNome));

    //stream contendo apenas elementos que são exclusivos
    

    
  }
}