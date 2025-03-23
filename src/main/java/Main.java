public class Main {
  public static void main(String[] args) {
    System.out.println("Zamiana stopni Celsjusza na Fahrenheita");
    int a = 100;
    for (int i = -a; i <= a; i++)
      {
        double n=(i*9/5)+32;
        System.out.println(i + "°C " + "= " + n + "°F");
      }
  }
}