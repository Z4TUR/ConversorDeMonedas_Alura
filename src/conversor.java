import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class conversor {

    public static void convertir(String divisaBase, String divisaObjetivo, servicioConversion servicio,
                                 Scanner entrada) {
        double monto;
        double montoConvertido;
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        tasaCambio tasa = servicio.obtenerTasa(divisaBase, divisaObjetivo);

        if (tasa != null) {
            System.out.println("El tipo de cambio para hoy " + formato.format(fechaActual) +
                    "\n1 " + divisaBase + " = " + tasa.obtenerTasaConversion() + " " + divisaObjetivo);

            try {
                System.out.println("Ingrese el monto que deseas convertir de " + divisaBase);
                monto = Double.parseDouble(entrada.nextLine());
                montoConvertido = monto * tasa.obtenerTasaConversion();
                System.out.println("El monto " + monto + " " + divisaBase + " al cambio es de =>> "
                        + String.format("%.2f", montoConvertido) + " " + divisaObjetivo);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        } else {
            System.out.println("No se pudo obtener la tas cambios para " + divisaBase + " a " + divisaObjetivo);
        }
    }
}
