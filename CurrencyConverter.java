import java.util.Scanner;

public class CurrencyConverter {

    // Tasas de cambio hipotéticas para el 16 de julio de 2024
    static final double BRL_TO_COP = 880.50;
    static final double GBP_TO_COP = 5300.30;
    static final double USD_TO_COP = 4000.75;
    static final double EUR_TO_COP = 4500.60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Monedas a Pesos Colombianos (COP)");
        System.out.println("Seleccione la moneda de origen:");
        System.out.println("1. Reales Brasileños (BRL)");
        System.out.println("2. Libras Esterlinas (GBP)");
        System.out.println("3. Dólares Estadounidenses (USD)");
        System.out.println("4. Euros (EUR)");

        int choice = scanner.nextInt();
        System.out.print("Ingrese la cantidad que desea convertir: ");
        double amount = scanner.nextDouble();

        double result = convertCurrency(choice, amount);

        if (result != -1) {
            System.out.printf("La cantidad convertida a Pesos Colombianos (COP) es: %.2f\n", result);
        } else {
            System.out.println("Opción no válida. Por favor, intente nuevamente.");
        }
    }

    public static double convertCurrency(int choice, double amount) {
        switch (choice) {
            case 1:
                return amount * BRL_TO_COP;
            case 2:
                return amount * GBP_TO_COP;
            case 3:
                return amount * USD_TO_COP;
            case 4:
                return amount * EUR_TO_COP;
            default:
                return -1;
        }
    }
}
