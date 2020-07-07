import java.lang.reflect.Method;

public class AnalisadorCredito {

  private RegrasCreditoRepository repository;

  public AnalisadorCredito() {this.repository = new RegrasCreditoRepository();}

	public boolean analisarCredito(Pessoa pessoa) {

    Method[] methods = Pessoa.class.getMethods();
    boolean result = true;

    for (RegraCredito regra : repository.findAllRegras()) {
      for (Method method : methods) {
        if (method.getName().toUpperCase().contains("GET" + regra.getReferencia.toUpperCase())) {
          try {
            long valor = (long) method.invoke(pessoa);
            result = validarRegra(valor, regra);
            
          } catch (Exception e) {
            //TODO: handle exception
          }
        }
      }
      
    }
    

		return false;
	}

}
