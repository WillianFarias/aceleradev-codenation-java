package br.com.cadastro.negocio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

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
	
	

}
