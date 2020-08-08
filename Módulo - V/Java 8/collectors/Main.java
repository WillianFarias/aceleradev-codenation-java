import java.util.List;
import java.util.Collection;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //https://www.baeldung.com/java-8-streams
    //https://www.baeldung.com/java-8-collectors

    //stream().map()
    List<String> myList = Stream.of("a", "b")
	    .map(String::toUpperCase)
      .collect(toList());
      
    myList.stream().forEach(System.out::println);

    //stream().map()
    List<List<String>> list = Arrays.asList(
	    Arrays.asList("a"),
      Arrays.asList("b"));
      
    System.out.println(list);
    
    list
	  .stream()
    .flatMap()
    .forEach(System.out::println);
  }
}