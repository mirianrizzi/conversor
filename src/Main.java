import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius");

        int c = scan. nextInt();

        final float Fahrenheit = (c * 1.8f) + 32;
        final float Kelvin = c + 273.15f;
        final float Reaumur = c * 0.8f;
        final float Rankine = (c * 1.8f) + 491;

        System.out.println("As temperaturas convertidas são:");
        System.out.printf("A temperatura em Fahrenheit é %.2f %n", Fahrenheit);
        System.out.printf("A temperatura em Kelvin é %.2f %n", Kelvin);
        System.out.printf("A temperatura em Reaumur é %.2f %n", Reaumur);
        System.out.printf("A temperatura em Rankine é %.2f %n", Rankine);


    }
}
