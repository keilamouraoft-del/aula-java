import java.util.Scanner;

class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String emailCorreto = "teste@email.com";
        String senhaCorreta = "123456";

        System.out.print("Digite seu email: ");
        String emailDigitado = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        if (emailCorreto.equals(emailDigitado) && senhaCorreta.equals(senhaDigitada)){

        
        System.out.print("login efetuado com sucesso ");
        
        
        }else{
        System.out.print("email ou senha inválidos");
        }

        scanner.close();
    }
}


