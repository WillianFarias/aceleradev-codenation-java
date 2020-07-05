import java.util.List;

public interface AviaoRepository {
  
  List<Aviao> getTodoAvioes();
  List<Aviao> getAvioesPorNome(String nome);
  List<Aviao> getAvioesPorFabricante(Fabricante fabricante);
  List<Aviao> getAviaoPorCapacidade(Capacidade capacidade);
  Aviao getAviaoPorId(Long id);
  
}