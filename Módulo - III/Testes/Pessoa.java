public class Pessoa implements Ser{

  //reflection eu teria que setar a visibilidade ou concatenar o método get
  @Somar
  private String nome;
  
  @Override
  public void Falar(String nome){
    System.out.println(nome);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


  
}