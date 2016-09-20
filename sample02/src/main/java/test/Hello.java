package test;

public class Hello {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int a = 20;
    int b = 50;
    int c = 15;
    System.out.println(a + b);
    System.out.println(c);
    
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
    
    System.out.println("Hello ");
  }

}
