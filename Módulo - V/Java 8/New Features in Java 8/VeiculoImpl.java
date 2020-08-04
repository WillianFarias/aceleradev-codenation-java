public class VeiculoImpl implements Veiculo {

  private String modelo;
  private Integer anoFabricacao;

  //Reescrita do método default da interface Veiculo
  public String getOverview() {
    return "BB made by " + Veiculo.producer();
  }

  public String getModelo(){
    return this.modelo;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public Integer getAnoFabricacao(){
    return this.anoFabricacao;
  }

  public void setAnoFabricacao(Integer anoFabricacao){
    this.anoFabricacao = anoFabricacao;
  }

}