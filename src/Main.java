import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        servicioConversion servicio = new servicioConversion();
        int sel = 0;

        while (sel != 7) {
            System.out.println ("-------------------------------------------\n");
            System.out.println ("Bienvenido al convertidor de divisas");
            System.out.println("1) USD a MXN");
            System.out.println("2) MXN a USD");
            System.out.println("3) EUR a MXN");
            System.out.println("4) MXN a EUR");
            System.out.println("5) GBP a MXN");
            System.out.println("6) JPY a MXN");
            System.out.println("7) AUD a MXN");
            System.out.println("8) CAD a MXN");
            System.out.println("9) Salir");
            System.out.println(" Elija una opción válida \n");
            System.out.println("\n");

            try {
                sel = entrada.nextInt();
                entrada.nextLine(); // Limpiar el buffer del scanner

                switch (sel) {
                    case 1:
                        conversor.convertir("USD", "MXN", servicio, entrada);
                        break;
                    case 2:
                        conversor.convertir("MXN", "USD", servicio, entrada);
                        break;
                    case 3:
                        conversor.convertir("EUR", "MXN", servicio, entrada);
                        break;
                    case 4:
                        conversor.convertir("MXN", "EUR", servicio, entrada);
                        break;
                    case 5:
                        conversor.convertir("GBP", "MXN", servicio, entrada);
                        break;
                    case 6:
                        conversor.convertir("JPY", "MXN", servicio, entrada);
                        break;
                    case 7:
                        conversor.convertir("AUD", "MXN", servicio, entrada);
                        break;
                    case 8:
                        conversor.convertir("CAD", "MXN", servicio, entrada);
                        break;
                    case 9:
                        System.out.println("Cerrando el programa...");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida (1-7)");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                entrada.next();
                sel = 0;
            } catch (Exception e) {
                System.out.println("Opción no válida");
                break;
            }
        }
        entrada.close();
}
}
