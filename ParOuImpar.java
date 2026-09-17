

import java.util.Scanner;

class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O mnúmero digitado é Par");
        } else {
            System.out.println("O número digitado é Impar");
        }

        scanner.close();
    }
  }
  