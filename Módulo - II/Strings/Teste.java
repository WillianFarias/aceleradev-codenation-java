public class Teste {
  public static void main(String[] args) {
    String nomeCompleto = "";
    if (nomeCompleto == null|| nomeCompleto.isEmpty()) {
      throw new NullPointerException();
    }else{
      System.out.println(nomeCompleto);
    }
    
 }
}