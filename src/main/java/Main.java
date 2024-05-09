/* 10.- Desarrollar un diagrama que determine la suma de las cifras de un número entero positivo. Ejemplo: Nro 962 9+6+2=17; 1+7=8 por lo tanto el Resultado es 8. */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int suma = 0;

    System.out.print("Ingrese un numero entero positivo: ");
    numero = scanner.nextInt();

    if (numero < 0) {
      System.out.println("El numero ingresado no es positivo");
    } else {
      int contador = numero;
      while (contador > 0) {
        suma = suma + (contador % 10);
        contador = contador / 10;
      }

      while (suma >= 10) {

        numero = suma;
        suma = 0;
        contador = numero;
        while (contador > 0) {
          suma = suma + (contador % 10);
          contador = contador / 10;
        }
      }

      System.out.println("La suma de sus cifras es: " + suma);
    }
    scanner.close();
  }
}
