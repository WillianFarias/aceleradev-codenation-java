import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Reflect {

  public BigDecimal somar(Object classe) {
    List<String> lista = new ArrayList<>();
    lista = atributos(classe.getClass());

    BigDecimal valor = valorSoma(classe, lista);
    return valor;
  }

  public List<String> atributos(Class classe) {

    Field[] fields = classe.getDeclaredFields();
    List<String> nomes = new ArrayList<>();

    for (Field field : fields) {

      if (field.getDeclaredAnnotation(Somar.class) != null) {
        if (field.getGenericType() == BigDecimal.class) {
          nomes.add(field.getName());
          //System.out.println(field.getGenericType());
        }

      }
    }
    return nomes;
  }

  public List<String> atributosSubtrair(Class classe) {

    Field[] fields = classe.getDeclaredFields();
    List<String> nomes = new ArrayList<>();

    for (Field field : fields) {

      if (field.getDeclaredAnnotation(Subtrair.class) != null) {
        if (field.getGenericType().equals(BigDecimal.class)) {
          nomes.add(field.getName());
        }
      }
    }
    return nomes;
  }

  public BigDecimal valorSoma(Object classe, List<String> metodos) {
    Method[] methods = classe.getClass().getMethods();

    BigDecimal valor = new BigDecimal("0");
    BigDecimal resultado = new BigDecimal("0");

    for (String metodo : metodos) {

      for (Method method : methods) {

        if (method.getName().toUpperCase().contains("GET" + metodo.toUpperCase())) {

          //System.out.println(method.getName().toUpperCase());
          //System.out.println(metodo.toUpperCase());

          try {

            valor = (BigDecimal) method.invoke(classe);
            if (valor != null) {
              resultado = resultado.add(valor);
            }

          } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
          }
          break;
        }
      }

    }

    if (resultado.equals(new BigDecimal("0"))) {
      return BigDecimal.ZERO;
    }
    return resultado;
  }

  // ---------------------------

}