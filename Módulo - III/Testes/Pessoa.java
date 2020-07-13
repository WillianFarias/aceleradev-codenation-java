import java.math.BigDecimal;

public class Pessoa {

  // reflection eu teria que setar a visibilidade ou concatenar o método get
  @Somar
  private BigDecimal valor;

  @Subtrair
  private BigDecimal valor2;

  @Somar
  private BigDecimal valor3;

  @Somar
  private int idade;

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public BigDecimal getValor2() {
    return valor2;
  }

  public void setValor2(BigDecimal valor2) {
    this.valor2 = valor2;
  }

  public BigDecimal getValor3() {
    return valor3;
  }

  public void setValor3(BigDecimal valor3) {
    this.valor3 = valor3;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}