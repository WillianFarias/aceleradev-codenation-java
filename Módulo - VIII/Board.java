/*class Board {
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


