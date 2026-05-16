import java.util.Scanner;
public class LlegirDouble {
  public static void main (String[] args) {
    LlegirDouble programa = new LlegirDouble();
    programa.inici();
  }
  public void inici() {
    System.out.println("Llegiu un nombre real pel teclat:");
    double a = llegirDoubleTeclat();
    System.out.println("El nombre real ha estat " + a + ".");
    System.out.println("Llegiu un altre nombre real pel teclat:");
    a = llegirDoubleTeclat();
    System.out.println("L’altre nombre real ha estat " + a + ".");
  }
  public double llegirDoubleTeclat() {
    Scanner lector = new Scanner(System.in);
    double DoubleLlegit = 0;
    boolean llegit = false;
  while (!llegit) {
    llegit = lector.hasNextDouble();
    if (llegit) {
      DoubleLlegit = lector.nextDouble();
    }
    else {
      System.out.println("Això no és un nombre real.");
      lector.next();
    }
  }
  lector.nextLine();
  return DoubleLlegit;
  }
}