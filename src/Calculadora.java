import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();
        System.out.println("Ingrese la operación (+, -, *, /, %,^)");
        char operacion = lector.next().charAt(0);

        switch (operacion) {
            case '+' :
                int suma = numero1 + numero2;
                System.out.println("La suma es " + suma);
                break;
            case '-' :
                int resta = numero1 - numero2;
                System.out.println("La resta es " + resta);
                break;
            case '*' :
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicación es " + multiplicacion);
                break;
            case '/' :
                double division = (double) numero1 / numero2;
                System.out.println("La división es " + division);
                break;
            case '%' :
                double residuo =(double) numero1 % numero2;
                System.out.println("El modulo es " + residuo);
                break;
            case '^' :
                double potencia = Math.pow (numero1,numero2);
                System.out.println("La potencia es " + potencia);
                break;
            default:
            System.out.println("Operación inválida");
            }//Cierra Switch
        }//Cierra Main
    }//Cierra Class