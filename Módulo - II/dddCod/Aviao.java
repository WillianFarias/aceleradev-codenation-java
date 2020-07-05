public class Aviao {

  private Long id;
  private String nome;

  private Fabricante fabricante;
  private Cor cor;
  private Capacidade capacidade;

  public boolean possuemMesmaPotencia(Aviao outroAviao){
    //outroAviao.getPotencia());
    return this.capacidade.getPotencia().equals(outroAviao.capacidade.getPotencia());
  }
}