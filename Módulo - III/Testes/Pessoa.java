import java.math.BigDecimal;

public class Pessoa {

  // reflection eu teria que setar a visibilidade ou concatenar o método get
  @Somar
  private int valor;

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }
}