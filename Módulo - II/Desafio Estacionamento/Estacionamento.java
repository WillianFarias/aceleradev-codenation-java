import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private final int quantidadeMaximaCarros = 10;
    //private int quantidadeCarrosEstacionados = 0;
    private List<Carro> estacionamento = new ArrayList<>();

    public void estacionar(Carro carro) {
        if (carro.getMotorista() == null) {
            throw new EstacionamentoException("Carro autônomo");
        }
        
        if (carro.getMotorista().getIdade() < 18) {
            throw new EstacionamentoException("Motorista menor de idade");
        }

        if (carro.getMotorista().getPontos() > 20) {
            throw new EstacionamentoException("Motorista com habilitação suspensa");
        }

        if(carrosEstacionados() < quantidadeMaximaCarros){
            estacionamento.add(carro);
            System.out.println(carrosEstacionados());
            //quantidadeCarrosEstacionados += 1;
        }else{
            System.out.println("Entrou else");
            //estacionamento.forEach(e -> e.getMotorista().getIdade());
            for(int i = 0; i < 10; i++){
                System.out.println(estacionamento.get(i).getMotorista().getIdade());
                if (estacionamento.get(i).getMotorista().getIdade() < 55 ) {
                    estacionamento.remove(i);
                    estacionamento.add(carro);
                    break;
                }

                
            }
            estacionamento.stream().forEach(System.out::println);
            throw new EstacionamentoException("");
        } 
    }

    public int carrosEstacionados() {
        return estacionamento.size();
    }

    public boolean carroEstacionado(Carro carro) {

        for (Carro carroEstacionado : estacionamento) {
            if (carro.equals(carroEstacionado)) {
                return true;
            }
        }

        return false;
    }
}
