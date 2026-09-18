import java.util.Scanner;
class SomaNumeros {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

System.out.println("digite quantos  números deseja somar");
int numero = scanner.nextInt();
int numeroSoma = 0;
int contador = 1;
while ( contador <= numero) {
    System.out.println("Digite um número");
    numeroSoma = numeroSoma + scanner.nextInt();
    contador = contador + 1 ;

}

System.out.println("A soma dos números digitados é:" +  numeroSoma);

}
}
