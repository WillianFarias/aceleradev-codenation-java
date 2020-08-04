//import java.util.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

//https://imasters.com.br/desenvolvimento/streams-e-lambdas-em-java
//https://www.baeldung.com/java-8-streams-introduction
//https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
//Optional https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1

public class Main{

  public static void main(String[] args) {
    
    //Formas de criar uma stream
    String[] arr = new String[]{"a", "b", "c"};
    //int cont = arr.stream().distinct().count();
    //Stream<String> stream = Arrays.stream(arr);

    //stream = Stream.of("a", "b", "c");

    //filter
  ArrayList<String> list = new ArrayList<>();
	list.add("One");
	list.add("OneAndOnly");
	list.add("Derek");
	list.add("Change");
	list.add("factory");
	list.add("justBefore");
	list.add("Italy");
	list.add("Italy");
	list.add("Thursday");
	list.add("");
  list.add("");
  
  /*
  Stream<String> stream = list.stream().
    filter(element -> element.contains("d"));*/

  List<Integer> integers = Arrays.asList(1, 1, 1);
  Integer reduced = integers.stream().reduce(10, (a, b) -> a + b);

  System.out.println(reduced);

  //Uso de map para criar algo novo a partir de uma stream
  List<String> resultList  = list.stream().
    map(element -> element.toUpperCase()).collect(Collectors.toList());

  resultList.stream().forEach(System.out::println);

  List<String> novaLista = resultList.stream()
    .filter(a -> a.startsWith("O"))
    .collect(Collectors.toList());

  novaLista.stream().forEach(System.out::println);

  }
}