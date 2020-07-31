import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;

public class Exemplo01 {

  public static void main(String[] args) {


    //Criacao de stream a partir de um List
    List<String> items = new ArrayList<>();
    items.add("um");
    items.add("dois");
    items.add("três");

    Stream<String> stream = items.stream();

    //Criacao de um stream a partir de um Map
    Map<String, String> map = new HashMap<>();
    map.put("key1", "Abacate");
    map.put("key2", "Melancia");
    map.put("key3", "Manga");
    Stream<String> stream2 = map.values().stream();

    //Além disso, uma stream pode ser gerada a partir de I/O, arrays e valores.
    //Para obter uma stream a partir de valores ou arrays é muito simples: 
    //basta chamar os métodos estáticos Stream.of() ou Arrays.stream(), como mostra
    //o código a seguir:

    Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);
    IntStream numbersFromArray = Arrays.stream(new int[] {1, 2, 3, 4, 5});

    //Por sua vez, para criar uma stream de linhas a partir do conteúdo de um arquivo texto (I/O),
    //podemos chamar o método estático Files.lines(Path path). No código a seguir, por exemplo, é
    //possível descobrir a quantidade de linhas que um arquivo possui:
    Stream <String> lines= Files.lines(Paths.get("myFile.txt"), Charset.defaultCharset()); 
    long numbersLines = lines.count();
    
  }

}

  