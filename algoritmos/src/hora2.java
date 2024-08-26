import java.util.Scanner;

public class hora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe os segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos/60/60;
        segundos = segundos - (horas*60*60);
        int minutos = segundos/60;
        segundos = segundos - (minutos * 60);


        System.out.println(horas + " Hora,  " +minutos+ " Minutos e  " + segundos + " Segundos.");




    }


}
