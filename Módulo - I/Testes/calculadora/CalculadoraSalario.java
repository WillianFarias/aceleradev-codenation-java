import java.lang.Math;

public class CalculadoraSalario {

	public static long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
    //Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-

    if(salarioBase >= 1039){
      double salario = calcularIrrf(calcularInss(salarioBase));
      //System.out.println(salario);
      return Math.round(salario);
    } else {
      return 0L;
    }
  }


  public static double calcularIrrf(double salarioInss) {
    if(salarioInss > 6000){
      salarioInss -= salarioInss * 0.15;
      //System.out.println(salario);
    } else if(salarioInss > 3000){
      salarioInss -= salarioInss * 0.075;
    }
    return salarioInss;
  }
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	public static double calcularInss(double salarioBase) {
    
    if (salarioBase < 1500.01) {
      return salarioBase -= salarioBase * 0.08;
    } else if(salarioBase < 4000.01 ){
      return salarioBase -= salarioBase * 0.09;
    } else {
      return salarioBase -= salarioBase * 0.11;
    }
  }
  
  public static void main(String[] args) {

    long salario = calcularSalarioLiquido(10000);
    System.out.println("salario liquido: " + salario);
  }

}
