public class Finally_Test {

  public static void main(String[] args) {
    try {
      System.out.println("Hello" + args[2]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Hello, You are after ArrayIndexOutOfBoundsException");
    } finally {
      System.out.println("Finally you have to reach here");
    }
  }
}
