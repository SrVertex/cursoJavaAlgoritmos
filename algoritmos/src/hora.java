import java.util.Scanner;

public class hora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Informe as minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Informe as segundos: ");
        int segundos = scanner.nextInt();





//        int horas=5, minutos=30, segundos=35, resultado;
        int resultado = (horas*60*60) + (minutos*60) + segundos;
        System.out.println("Segundos: " +resultado);


    }
}
