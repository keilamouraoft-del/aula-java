
import java.util.Scanner;

public class AreaRetangulo {
    
  public static void main(String[] args) {  

Scanner scanner = new Scanner ( System.in);


System.out.print("digite a base: ");
double base = scanner.nextDouble();
System.out.print("Digite a altura: ");
double altura = scanner.nextDouble();
double total = base*altura;

System.out.print("A área é :" + total);
scanner.close();

}

}



