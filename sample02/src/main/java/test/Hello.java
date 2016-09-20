package test;

public class Hello {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int i = 1;
    int j = 0;
    int s = -1;
    for (int k = 0; k < 100; k++) {
      if ((k % 2) == 1) {
        s = s * (-1);
      }
      i = i + (j * s);
      j += 1;
    }
  }

}
