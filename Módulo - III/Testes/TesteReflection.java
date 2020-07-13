import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteReflection {
  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    pessoa.setValor(new BigDecimal("100"));
    pessoa.setValor2(new BigDecimal("50"));
    pessoa.setIdade(15);

    Reflect novoReflect = new Reflect();
    BigDecimal valor = novoReflect.somar(pessoa);
    System.out.println(valor);

  }
}