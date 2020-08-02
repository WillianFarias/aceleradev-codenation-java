import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Comparator;
import static java.util.stream.Collectors.toList;

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
    Stream<Pessoa> streamDistinta = pessoas.stream().distinct(); 

    //limitar o número de elementos em uma stream
    Stream<Pessoa> streamLimitada = pessoas.stream().limit(2);

    //Operacoes terminais, nunca retornam um stream
    pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

    //Exemplo de uso do método average(), utilizado para fazer a média de valores
    double media = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().
    equals("Brasil")).mapToInt(pessoa -> pessoa.getIdade()).
    average().
    getAsDouble();

    System.out.println(media);

    //Collect
    //convertendo uma stream para os tipos List, Set ou Map
    List<Pessoa> pessoasComM = pessoas.stream().
      filter(pessoa -> pessoa.getNome().startsWith("M")).
      collect(toList());

    pessoasComM.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

    //Count
    //retorna a quantidade de elementos presentes em uma stream
    long qtdPessoasN = pessoas.stream().
      filter(pessoa -> pessoa.getNome().startsWith("N")).count();

    System.out.println(qtdPessoasN);

    //AllMatch
    //Verifica se todos os elementos de uma stream possuem um caracteristica, 
    //caso tenham o retorno será true
    boolean todosMexicanos = pessoas.stream().
      allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));

    System.out.println(todosMexicanos);

  }
}