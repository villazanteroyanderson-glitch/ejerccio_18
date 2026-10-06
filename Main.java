//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
    public static int bumeranes(int[] num) {

        int contador = 0;

        for (int i = 0; i < num.length - 2; i++) {

            if (num[i] == num[i + 2] && num[i] != num[i + 1]) {

                System.out.println("Bumerán: [" +
                        num[i] + ", " +
                        num[i + 1] + ", " +
                        num[i + 2] + "]");

                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner roy = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = roy.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            num[i] = roy.nextInt();
        }

        System.out.println("Números ingresados:");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        int total = bumeranes(num);

        System.out.println("Total de bumeranes: " + total);

        roy.close();
    }


