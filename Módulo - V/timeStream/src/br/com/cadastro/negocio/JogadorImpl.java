package br.com.cadastro.negocio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.cadastro.model.Jogador;

public class JogadorImpl {
	
	//Verifica se o arquivo com os dados dos jogadores existe
	public boolean verificarArquivoExiste(Path caminho) {

		boolean ret = false;

		try {

			Stream<Path> stream = Files.list(caminho);
			Optional<Path> arq = stream.filter(p -> p.toString().endsWith("jogadores.txt")).findAny();
			ret = arq.isPresent(); // informa se o arquivo está presente
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ret;
	}
	
	public List<Jogador> getListaDeJogadores(Path caminho) throws IOException {
		Stream<String> linhas = Files.lines(caminho, StandardCharsets.ISO_8859_1);
		List<String> listaDeLinhas = linhas.collect(Collectors.toList());
		List<Jogador> listaDeJogadores = new ArrayList<>();
		Jogador jogador;
		Iterator<?> it = listaDeLinhas.listIterator();
		String str = null;
		
		while(it.hasNext()) {
			str = (String) it.next();
			String info[] = str.split(", ");
			jogador = new Jogador();
			jogador.setNome(info[0]);
			jogador.setPosicao(info[1]);
			jogador.setIdade(Integer.parseInt(info[2]));
			jogador.setTimeAtual(info[3]);
			jogador.setGolsMarcados(Integer.parseInt(info[4]));
			listaDeJogadores.add(jogador);
		}
		
		return listaDeJogadores;
	}
	
	public void imprimirJogador(List<Jogador> jogadores) {
		jogadores.stream().forEach(System.out::println);
	}

	public void imprimirJogadorMaisVelho(List<Jogador> listaDeJogadores) {
		// TODO Auto-generated method stub
		
	}

	public void imprimirJogadorMaisNovo(List<Jogador> listaDeJogadores) {
		// TODO Auto-generated method stub
		
	}
	

}
