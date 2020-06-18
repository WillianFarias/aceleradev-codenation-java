import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
    
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
    lista.add(1);

    int i = 0;
    int valor = 0;
    
    while(valor < 351){
      valor = lista.get(i) + lista.get(i+1);
      lista.add(valor);
      i += 1;
    }

		return lista;
	}

	public static Boolean isFibonacci(Integer a) {

		return fibonacci().contains(a);
	}

	public static void main(String[] args) {
    System.out.println(fibonacci());
    System.out.println(isFibonacci(10));
    
	}

}