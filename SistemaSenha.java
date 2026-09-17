import java.util.Scanner;

public class SistemaSenha {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        // Senha correta definida no programa
        int senhaCorreta = 1234;
        
        // Variável para guardar o que o usuário digita
        int senhaDigitada = 0;
        
        // Contador de tentativas erradas
        int tentativas = 0;
        
        // Laço: repete enquanto a senha estiver errada E ainda tiver tentativas
        while (senhaDigitada != senhaCorreta && tentativas < 3) {
            
            System.out.print("Digite a senha: ");
            senhaDigitada = leitor.nextInt();
            
            // Se errou a senha, aumenta o contador
            if (senhaDigitada != senhaCorreta) {
                tentativas++;
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
            }
        }
        
        // Verifica o resultado final
        if (senhaDigitada == senhaCorreta) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso bloqueado");
        }
        
        leitor.close();
    }
}
