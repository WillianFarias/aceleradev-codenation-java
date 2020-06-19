public class CriptografiaCesariana {

    public static String criptografar(String texto) {
        
        if(texto != null && texto != "") {
            StringBuilder textoDecifrado = new StringBuilder();
            int chave = 3;

            texto = texto.toLowerCase();
    
            // Variavel com tamanho do texto a ser decriptado
            int tamanhoTexto = texto.length();
    
            char x, y;
    
            // Descriptografa cada caracter por vez
            for (int c = 0; c < tamanhoTexto; c++) {
                // Transforma o caracter em codigo ASCII e faz a descriptografia
    
                int letraDecifradaASCII = ((int) texto.charAt(c));
    
                if ((letraDecifradaASCII >= 97) && (letraDecifradaASCII <= 122)) {
    
                    if ((letraDecifradaASCII + chave) > 122) {
    
                        x = (char) (letraDecifradaASCII + chave);
                        y = (char) (x - 122);
                        letraDecifradaASCII = (96 + y);
    
                    } else {
                        letraDecifradaASCII += chave;
                    }
    
                }
    
                // Transforma codigo ASCII descriptografado em caracter ao novo texto
                textoDecifrado.append((char) letraDecifradaASCII);
            }
    
            // Por fim retorna a mensagem descriptografada por completo
            String novoTexto = textoDecifrado.toString();
    
            return novoTexto;
        } else {
            throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        }
    }

    public static String descriptografar(String texto) {
        

        //public String decifrador(int chave, String textoCifrado) {

            // Variavel que ira guardar o texto decifrado
            StringBuilder textoDecifrado = new StringBuilder();
            int chave = 3;

            texto = texto.toLowerCase();
    
            // Variavel com tamanho do texto a ser decriptado
            int tamanhoTexto = texto.length();
    
            char x, y;
    
            // Descriptografa cada caracter por vez
            for (int c = 0; c < tamanhoTexto; c++) {
                // Transforma o caracter em codigo ASCII e faz a descriptografia
    
                int letraDecifradaASCII = ((int) texto.charAt(c));
    
                if ((letraDecifradaASCII >= 97) && (letraDecifradaASCII <= 122)) {
    
                    if ((letraDecifradaASCII - chave) < 97) {
    
                        x = (char) (letraDecifradaASCII - chave);
                        y = (char) (x - 97);
                        letraDecifradaASCII = (123 + y);
    
                    } else {
                        letraDecifradaASCII -= chave;
                    }
    
                }
    
                // Transforma codigo ASCII descriptografado em caracter ao novo texto
                textoDecifrado.append((char) letraDecifradaASCII);
            }
    
            // Por fim retorna a mensagem descriptografada por completo
            String novoTexto = textoDecifrado.toString();
    
            return novoTexto;
        }

        public static void main(String[] args) {

            String a = "a";
            if(a == ("a")){
                System.out.println("Eae");
            }

            System.out.println(descriptografar(""));
            System.out.println(criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado"));
        }
    }



    