public class  Main {

  public static void main(String[] args) {
    Pessoa pessoa = getPessoa();
    AnalisadorCredito analisador = new AnalisadorCredito();

    boolean resultado = analisador.analisarCredito(pessoa);
    //Reflection deve ser usado apenas quando é essencial
    //pois reduz peformace

    if (resultado) {
      System.out.println("Credito aprovado");
    }else {
      System.out.println("Credito reprovado");
    }
  }

  private static Pessoa getPessoa() {
    return null;
  }
}