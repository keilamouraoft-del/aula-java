
import java.util.Scanner;
class Tabuada2 {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

System.out.println("digite um número para ver a tabuada dele");
int numero = scanner.nextInt();

int contador = 1;
while (contador <= 10) {
System.out.println(numero + "x" + contador +  "=" + (numero * contador));

contador = contador + 1;

}


}
}
