package br.com.cadastro.main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;

public class Principal {

	public static void main(String[] args) throws IOException {
		Principal principal = new Principal();
		JogadorImpl impl = new JogadorImpl();
		String endereco = "/media/will/Arquivos/Estudos/Codenation - Java(06-20)/Módulo - V";
		String nomeArquivo = "jogadores.txt";
		
		List<Jogador> listaDeJogadores = impl.getListaDeJogadores(Paths.get(endereco + "/" + nomeArquivo));
		
		if(!impl.verificarArquivoExiste(Paths.get(endereco))) {
			System.out.println("Arquivo não existe");
		}else {
			impl.imprimirJogador(listaDeJogadores);
			impl.imprimirJogadorMaisVelho(listaDeJogadores);
			impl.imprimirJogadorMaisNovo(listaDeJogadores);
		}

	}

}
