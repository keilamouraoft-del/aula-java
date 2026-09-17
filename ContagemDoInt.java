import java.util.Scanner;

class ContagemDoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador = contador + 1;
        }

        scanner.close();
    }
}


