/*
1. Only One Level Of Indentation Per Method
''
class Board {
  public String board() {
      StringBuilder buf = new StringBuilder();

      // 0
      for (int i = 0; i < 10; i++) {
          // 1
          for (int j = 0; j < 10; j++) {
              // 2
              buf.append(data[i][j]);
          }
          buf.append("\n");
      }

      return buf.toString();
  }
}*/

//Refatorando
public class Board {

  public String data[][];

  public String board() {
      StringBuilder buf = new StringBuilder();

      collectRows(buf);

      return buf.toString();
  }

  private void collectRows(StringBuilder buf) {
      for (int i = 0; i < 10; i++) {
          collectRow(buf, i);
      }
  }

  private void collectRow(StringBuilder buf, int row) {
      for (int i = 0; i < 10; i++) {
          buf.append(data[row][i]);
      }

      buf.append("\n");
  }
}

/*
2. Don’t Use The ELSE Keyword
public void login(String username, String password) {
    if (userRepository.isValid(username, password)) {
        redirect("homepage");
    } else {
        addFlash("error", "Bad credentials");

        redirect("login");
    }
}*/

public void login(String username, String password) {
  if (userRepository.isValid(username, password)) {
      return redirect("homepage");
  }

  addFlash("error", "Bad credentials");

  return redirect("login");
}


