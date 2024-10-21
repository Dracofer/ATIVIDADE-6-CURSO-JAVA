import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double v1;
    double v2;
    double v3;
    double triangulo;
    double circulo;
    double trapezio;
    double quadrado;
    double retangulo;
    double A;

    v1 = sc.nextDouble();
    v2 = sc.nextDouble();
    v3 = sc.nextDouble();
    triangulo = (v1 * v3) / 2;
    A = Math.pow(v3, 2);
    circulo = 3.14159 * A;
    trapezio = (((v1 + v2) * v3)/ 2);
    quadrado = v2 * v2;
    retangulo = v1 * v2;
    
    System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANTUGULO: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);

    sc.close();
  }
}