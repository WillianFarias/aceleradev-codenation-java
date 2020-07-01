import java.util.Scanner;
 
public class String8 {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String nome, sobrenome;
    int i;
 
    System.out.printf("Informe um nome:\n");
    nome = ler.nextLine();
 
// retorna a posição da última ocorrência do espaço em branco
// na string 'nome', ou seja, o sobrenome é a última parte de um nome
    i = nome.lastIndexOf(' ');
    System.out.println(i);
    sobrenome = nome.substring(i+1, nome.length());
 
    System.out.printf("\nSobrenome:\n%s\n", sobrenome);
  }
 
}