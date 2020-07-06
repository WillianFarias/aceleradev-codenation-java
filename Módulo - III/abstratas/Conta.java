public abstract class Conta {
    
  private double saldo;
  
  //Classes abstratas podem ter implementacao de métodos, diferente de interfaces
  //que possuem apenas as assinaturas de métodos
  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }
   
  public double getSaldo() {
      return saldo;
  }
  
  //no entanto classes abstratas podem conter métodos abstratos, que teram 
  //apenas a assinatura do método
  public abstract void imprimeExtrato();

}