import java.io.IOException;
import java.util.Scanner;
 
public class String3 {
// através da claúsula throws indicamos que não iremos
// tratar possíveis erros na entrada de dados realizada
// através do método "read" do pacote de classes System.in
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
 
    String nome;
    char sexo;
 
    System.out.printf("Informe um nome:\n");
    nome = ler.nextLine();
 
    System.out.printf("\nInforme o sexo (M/F):\n");
    //recebendo um caracter
    sexo = (char)System.in.read();
 
    if ((sexo == 'M') || (sexo == 'm'))
       System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
    else System.out.printf("\nSeja bem-vinda Sra. %s.\n", nome);
  }
 
}