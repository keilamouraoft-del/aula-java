import java.util.Scanner;

public class MaiorDeTres {

public static void main(String[] args) {    

Scanner scanner = new Scanner(System.in);
System.out.println("Digite três números inteiros: ");


int numero1 = scanner.nextInt();

int numero2 = scanner.nextInt();    

int numero3 = scanner.nextInt();


if (numero1 > numero2 && numero1 > numero3) {
    System.out.println("O maior número é: " + numero1);
} else if (numero2 > numero1 && numero2 > numero3) {
    System.out.println("O maior número é: " + numero2);
} else {
    System.out.println("O maior número é: " + numero3);
}

    scanner.close();
}
}
