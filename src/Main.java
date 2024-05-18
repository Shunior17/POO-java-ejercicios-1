import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción:\n");
        System.out.println("1. Eres mayor de edad?");
        System.out.println("2. Cual es el mayor");
        System.out.println("3. Par o impar?");
        System.out.println("4. Factorial de un número.");
        System.out.println("5. Mostrar números impares hasta un límite (for).");
        System.out.println("6. Mostrar números impares hasta un límite (while).");
        System.out.println("7. Día de la semana.");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();
                MayorEdad.verificarMayorEdad(edad);
                break;
            case 2:
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                MayorNumero.encontrarMayor(num1, num2);
                break;
            case 3:
                System.out.print("Ingrese un número entero: ");
                int numero = scanner.nextInt();
                ParImpar.verificarParImpar(numero);
                break;
            case 4:
                System.out.print("Ingrese un número para calcular su factorial: ");
                int numFactorial = scanner.nextInt();
                Factorial.calcularFactorial(numFactorial);
                break;
            case 5:
                System.out.print("Ingrese un número mayor a 10 y menor que 30: ");
                int limiteFor = scanner.nextInt();
                NumerosImpares.mostrarImparesFor(limiteFor);
                break;
            case 6:
                System.out.print("Ingrese un número mayor a 10 y menor que 30: ");
                int limiteWhile = scanner.nextInt();
                NumerosImpares.mostrarImparesWhile(limiteWhile);
                break;
            case 7:
                System.out.print("Ingrese un número del 1 al 5: ");
                int numeroDiaSemana = scanner.nextInt();
                DiaSemana.mostrarNombreDia(numeroDiaSemana);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

}


class MayorEdad {
    public static void verificarMayorEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

class MayorNumero {
    public static void encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor.");
        } else if (num2 > num1) {
            System.out.println("El número " + num2 + " es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}

class ParImpar {
    public static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}

class Factorial {
    public static void calcularFactorial(int num) {
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}

class NumerosImpares {
    public static void mostrarImparesFor(int limite) {
        System.out.println("Números impares hasta " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void mostrarImparesWhile(int limite) {
        System.out.println("Números impares hasta " + limite + ":");
        int i = 1;
        while (i <= limite) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

class DiaSemana {
    public static void mostrarNombreDia(int numero) {
        String nombreDia;
        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
                case 7:
                    nombreDia = "Domingo";
                    break;
            default:
                nombreDia = "Día no válido";
                break;
        }
        System.out.println("El día correspondiente al número " + numero + " es: " + nombreDia);
    }
}
