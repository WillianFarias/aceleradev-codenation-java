import java.math.BigDecimal;

public class Main {
  
  public static void main(String[] args) {
    
    Pessoa pessoa1 = new Pessoa();
    pessoa1.setValor(new BigDecimal(1000));
    pessoa1.setIdade(10);

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setValor(new BigDecimal(10));
    pessoa2.setIdade(30);

    //BigDecimal valor = new BigDecimal(0);
    int valor = 0;

    CalculadorDeClasses calculador = new CalculadorDeClasses();

    valor = calculador.somar(Pessoa.class);

    System.out.println(valor);

  }
}