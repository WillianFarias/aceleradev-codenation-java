import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://www.baeldung.com/java-8-new-features

public class Main {

  public static void main(String[] args) {

    String producer = Veiculo.producer();
    System.out.println("Método static na interface" + producer);

    /*
    *Não é possível fazer isso, para fazer uso de um método padrao é necessaio
    um objeto da classe que implementa a interface
    String overview = Veiculo.getOverview();
    */

    Veiculo veiculo = new VeiculoImpl();
    String overview = veiculo.getOverview();
    System.out.println("Método default na interface " + overview);

    List<VeiculoImpl> veiculos = new ArrayList<>();

    VeiculoImpl v1 = new VeiculoImpl();
    v1.setModelo("Fusca");
    v1.setAnoFabricacao(1989);
    veiculos.add(v1);

    List<String> palavras = new ArrayList<>();
    palavras.add("A");
    palavras.add("");
    
    long count = palavras.stream().filter(String::isEmpty).count();
    System.out.println(count);

    /*
    List<String> liste = getList();
    List<String> listOpt = liste != null ? liste : new ArrayList<>();
    
    //Java 8
    List<String> listOpt = getList().orElseGet(() -> new ArrayList<>());
    */

    List<List<Integer>> listOfListofInts = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList( 7, 8, 9));
    System.out.println("flatMap" + listOfListofInts.stream().flatMap(List::stream).collect(Collectors.toList()));
    System.out.println("map" +listOfListofInts.stream().map(List::stream).collect(Collectors.toList()));


  }
}