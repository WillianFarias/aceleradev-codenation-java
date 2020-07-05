import static java.util.concurrent.ThreadLocalRandom.current;

public class Main {
  public static void main(String[] args) {

    Estacionamento estacionamento = new Estacionamento();
    
    Motorista ada = Motorista.builder().withNome("Ada").withIdade(20)
                .withPontos(3)
                .withHabilitacao("1231")
                .build();

        Carro carroBranco = Carro.builder().withCor(Cor.BRANCO).
                withPlaca("123")
                .withMotorista(ada)
                .build();

        for (int indice = 1; indice <= 10; indice++) {

          Motorista motorista = Motorista.builder()
                  .withNome("Motorista " + indice)
                  .withIdade(56)
                  .withPontos(3)
                  .withHabilitacao(Long.toString(current().nextLong()))
                  .build();

          Carro carro = Carro.builder().withCor(Cor.BRANCO).
                  withPlaca("123")
                  .withMotorista(motorista)
                  .build();

          estacionamento.estacionar(carro);
      }

      estacionamento.estacionar(carroBranco);
      System.out.println(estacionamento.carroEstacionado(carroBranco));
/*
        System.out.println(estacionamento.carrosEstacionados());
        estacionamento.estacionar(carroBranco);

        System.out.println(estacionamento.carroEstacionado(carroBranco));
        System.out.println(estacionamento.carrosEstacionados());
        */

  }
}