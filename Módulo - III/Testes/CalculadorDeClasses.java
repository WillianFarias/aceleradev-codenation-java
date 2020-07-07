import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculadorDeClasses implements Calculavel {

  Somar somar;
  Subtrair subtrair;

  @Override
  public int somar(Object classe) {
    int resultado = soma(classe, somar);
    return resultado;
  }

  @Override
  public BigDecimal subrair(Object classe) {
    //BigDecimal resultado = soma(classe, subtrair);
    return null;
  }

  @Override
  public BigDecimal total(Object classe) {
    /*BigDecimal valor1 = somar(classe);
    BigDecimal valor2 = subrair(classe);

    BigDecimal resultado = valor1.subtract(valor2);*/
    return null;
  }

  public List<String> possuiAnotationSomar(Object classe, Annotation annotation) {

    Field[] fields = classe.getClass().getDeclaredFields();
    List<String> atributos = new ArrayList<>();

    for (Field field : fields) {
      // System.out.println(field.getName());
      // System.out.println(field.getType());
      if (field.getDeclaredAnnotation(Somar.class) != null) {
        atributos.add(field.getName());
      }
      // System.out.println(field.getDeclaredAnnotation(Somar.class));
    }
    return atributos;
  }

  public int soma(Object classe, Annotation annotation) {

    Method[] methods = classe.getClass().getMethods();
    List<String> metodos = possuiAnotationSomar(classe, annotation);
    //BigDecimal valor = new BigDecimal(0);
    int resultado = 0;

    for (String nomeMetodos : metodos) {

      for (Method method : methods) {
        if (method.getName().toUpperCase().contains("GET" + nomeMetodos.toUpperCase())) {
          try {
            int valor = (int) method.invoke(classe);
            resultado += valor;
          } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
          }
        }
      }

    }

    return resultado;
  }

}