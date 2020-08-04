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

  }
}