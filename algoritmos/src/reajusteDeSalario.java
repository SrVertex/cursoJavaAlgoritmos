import java.util.Scanner;

public class reajusteDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o salario: ");
        double salario = scanner.nextInt();
        // quem ganha ate 1412 = reajuste de 12%
        // quem ganha ate 3000 = reajuste de 9%
        // quem ganha ate 5000 = reajuste de 5%
        // quem ganha mais 5000 = sem reajuste

        double resultado = 0;

        if (salario <= 1412){
            System.out.println("Reajuste de 12%");
            resultado = salario * 1.12;
        } else if (salario <= 3000) {
            System.out.println("Reajuste de 9%");
            resultado = salario * 1.09;
        } else if (salario <= 5000) {
            System.out.println("Reajuste de 5%");
            resultado = salario * 1.05;
        } else {
            System.out.println("Sem reajuste");
        }

        System.out.println("Salario antigo: "+salario+ " Salario reajustado: " + resultado);
    }


}
