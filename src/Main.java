import telefone.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd = 0;

        System.out.print("Qual o número do seu telefone: ");
        String tel = scan.nextLine();

        Telefone telefone = new Telefone(tel);
        Contatos telefoneContatos = telefone.getContatos();
        Chamadas chamadas = new Chamadas();

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
            System.out.print(String.format("Qual o nome do contato %d: ", i + 1));
            String nome = scan.nextLine();

            System.out.print(String.format("Qual o número do contato %d: ", i + 1));
            String numero = scan.nextLine();

            Contato contato = new Contato(nome, numero);
            telefoneContatos.adicionar(contato);
        }

        System.out.println(telefone.getContatos());

        System.out.println("Oque deseja fazer?\n");
        System.out.print("1 <- Buscar contatos\n2 <- Fazer uma ligação\nR: ");
        int opt = scan.nextInt();
        scan.nextLine();

        if (opt == 1) {
            System.out.print("Quais as iniciais do contato?: ");
            String iniciais = scan.nextLine();

            System.out.println("\nContatos encontrados: ");
            System.out.println(telefoneContatos.buscar(iniciais));
        }
        else if (opt == 2) {

            System.out.println("--------------------------------");
            System.out.print("para que número deseja ligar?: ");
            String num = scan.nextLine();

            Ligacao ligacao = new Ligacao(telefone.getNumeroChip(), num);
            ligacao.ligar();
            System.out.println(ligacao);
            chamadas.adicionar(ligacao);
            System.out.println(chamadas);
        }


    }
}
