public class VeiculoImpl implements Veiculo {

  //Reescrita do método default da interface Veiculo
  public String getOverview() {
    return "BB made by " + Veiculo.producer();
  }

}