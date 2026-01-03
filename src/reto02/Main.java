package reto02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        char opcion;
        Scanner entrada = new Scanner(System.in);
        do {
                System.out.println("Calculadora Básica - Reto 02");
                System.out.println("----------------------------");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División\n");
                System.out.print("Ingresa una opción (1-5):");
                opcion = entrada.next().charAt(0);
                char operador;
                double total;
                switch (opcion) {
                    case '1':
                        System.out.println("Seleccionaste: Suma");
                        operador = '+';
                        System.out.println("Respuesta: " + operacion(entrada, operador) + "\n");
                        break;

                    case '2':
                        System.out.println("Seleccionaste: Resta");
                        operador = '-';
                        System.out.println("Respuesta: " + operacion(entrada, operador) + "\n");
                        break;

                    case '3':
                        System.out.println("Seleccionaste: Multiplicar");
                        operador = '*';
                        System.out.println("Respuesta: " + operacion(entrada, operador) + "\n");
                        break;

                    case '4':
                        System.out.println("Seleccionaste: Dividir");
                        operador = '/';
                        System.out.println("Respuesta: " + operacion(entrada, operador) + "\n");
                        break;

                    default:
                        System.out.println("El valor ingresado no es válido intente de nuevo");
                        break;
                }
        } while (opcion != '5');
        entrada.close();
    }
    private static double leerNumero(Scanner entrada, String mensaje){
        while(true){
            try{
                System.out.print(mensaje);
                return Double.parseDouble(entrada.next());
            }catch(NumberFormatException e){
                System.out.println("El valor ingresado no es válido");
            }
        }
    }

    private static double operacion(Scanner entrada, char operador){
        double num1 = leerNumero(entrada, "Ingresa el primer número: ");
        double num2 = leerNumero(entrada, "Ingresa el segundo número: ");
        switch (operador) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
                /*
                if (num2 == 0){
                    System.out.println("No se puede dividir entre cero");
                }else{
                    return num1 / num2;
                }*/
            default: return 0;
        }
    }

}
