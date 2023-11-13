import telefone.Contato;
import telefone.Contatos;
import telefone.Telefone;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd = 0;

        Telefone telefone = new Telefone("4002 8922");
        Contatos telefoneContatos = telefone.getContatos();

        while (true) {
            try {
                System.out.print("Quantos contatos você deseja adicionar em sua lista de contatos?: ");
                qtd = scan.nextInt();
                scan.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("---------------------------");
                System.out.println("Digite um valor inteiro");
                System.out.println("---------------------------");
                scan.nextLine();
            }
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println(String.format("Qual o nome do contato %d:", i + 1));
            String nome = scan.nextLine();

            System.out.println(String.format("Qual o número do contato %d:", i + 1));
            String numero = scan.nextLine();

            Contato contato = new Contato(nome, numero);
            telefoneContatos.adicionar(contato);
        }

        System.out.println(telefone.getContatos());

        System.out.print("Deseja procurar algum contato? (1 para sim, 0 para não): ");
        int opt = scan.nextInt();
        scan.nextLine();

        if (opt == 1) {
            System.out.print("Quais as iniciais do contato?: ");
            String iniciais = scan.nextLine();

            System.out.println("Contatos encontrados: ");
            System.out.println(telefoneContatos.buscar(iniciais));
        }
    }
}
