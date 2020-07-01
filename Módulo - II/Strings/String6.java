import java.util.Scanner;
 
public class String6 {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String s, maius, minus;
 
    System.out.printf("Informe uma string:\n");
    s = ler.nextLine();
 
    maius = s.toUpperCase(); // string convertida em maiúsculas
    minus = s.toLowerCase(); // string convertida em minúsculas
 
    System.out.printf("\nResultado:\n");
    System.out.printf("%s\n%s\n", maius, minus);
  }
 
}