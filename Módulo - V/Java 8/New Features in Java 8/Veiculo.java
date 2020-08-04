public interface Veiculo {

  //Java 8 permite o uso de métodos staticos em interfaces
  //para chama-lo deve-se usar a forma padrao de chamada de métodos staticos
  static String producer() {
    return "N&F Vehicles";
  }

  //métodos default, eles podem ser reescrito por quem implementa a interface
  default String getOverview() {
    return "AVT made by " + producer();
  }
}