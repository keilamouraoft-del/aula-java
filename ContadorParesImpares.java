import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leitor.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("\nPares: " + pares + " | Ímpares: " + impares);
        
        leitor.close();
    }
}