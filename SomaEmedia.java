      import java.util.Scanner;
public class SomaEmedia {
    
  public static void main(String[] args) {  

Scanner scanner = new Scanner ( System.in);

// Cria o objeto Scanner para ler dados do teclado
Scanner leitor = new Scanner(System.in);
        
// Pergunta quantos números o usuário quer informar
System.out.print("Quantos números você deseja informar? ");
int quantidade = leitor.nextInt();
        
// Variável que vai acumular a soma
double soma = 0;
        
// Laço que repete 'quantidade' vezes
for (int i = 1; i <= quantidade; i++) {
System.out.print("Digite o " + i + "º número: ");
double numero = leitor.nextDouble();
soma = soma + numero; // acumula o valor na soma
}
       
// Calcula a média
double media = soma / quantidade;
        
// Mostra os resultados
System.out.println("\nSoma dos valores: " + soma);
System.out.println("Média dos valores: " + media);
        
// Fecha o leitor
leitor.close();
     
}
}