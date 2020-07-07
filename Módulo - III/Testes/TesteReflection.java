import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteReflection {
  public static void main(String[] args) {

    /*
    Annotation[] annotations = Pessoa.class.getAnnotations();

    for (Annotation annotation : annotations) {
      for (Annotation annotation2 : Somar) {
        if (condition) {
          
        }
      }
    }*/
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Willian");
    String nome = "";


    String metodo = "";
    Field[] fields = Pessoa.class.getDeclaredFields();
    for (Field field : fields) {
      //System.out.println(field.getName());
      //System.out.println(field.getType());
      if (field.getDeclaredAnnotation(Somar.class) != null) {
        System.out.println(field.getName());
        metodo = field.getName();
      }
      //System.out.println(field.getDeclaredAnnotation(Somar.class));
    }

    //914
    Method[] methods = Pessoa.class.getMethods();
    for (Method method : methods) {
      if (method.getName().toUpperCase().contains("GET" + metodo.toUpperCase())){
        try {
          String valor = (String) method.invoke(pessoa);
          nome = valor;
        } catch (IllegalAccessException | InvocationTargetException e) {
          e.printStackTrace();
        }
      }
    }

    System.out.println(nome);

    /*
    Method[] metodos = Pessoa.class.getMethods();
    for (Method method : metodos) {
      System.out.println(method.getName().toString());
    }*/
  }
}