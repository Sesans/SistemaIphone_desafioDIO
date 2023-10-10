import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Iphone meuIphone = new Iphone();

        System.out.println("\tSeja bem-vindo ao seu Iphone!");

        System.out.print("Insira seu nome de usuário: ");
        meuIphone.nomeUsuario = entrada.nextLine();

        System.out.print("Insira seu E-MAIL: ");
        meuIphone.emailUsuario = entrada.nextLine();

        System.out.println("\tCadastrado com sucesso!");

        entrada.nextLine();
        meuIphone.exibir();
    }
}
