import java.util.Scanner;
 
public class String5 {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String s, maius, minus;
    char c;
    int i, n;
 
    System.out.printf("Informe uma string:\n");
    s = ler.nextLine();
 
    n = s.length(); // tamanho da string
    maius = ""; // string convertida em maiúsculas
    minus = ""; // string convertida em minúsculas
    for (i=0; i<n; i++) {
      c = s.charAt(i);
// verifica se o i-ésimo caractere é alfabético minúsculo
      if ((c >= 'a') && (c <= 'z'))
// converte o i-ésimo caractere no correspondente maiúsculo
         maius = maius + (char)(c - 32);
      else maius = maius + c;
// verifica se o i-ésimo caractere é alfabético maiúsculo
      if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
// converte o i-ésimo caractere no correspondente minúsculo
         minus = minus + (char)(c + 32);
      else minus = minus + c;
    }
 
    System.out.printf("\nResultado:\n");
    System.out.printf("%s\n%s\n", maius, minus);
  }
 
}