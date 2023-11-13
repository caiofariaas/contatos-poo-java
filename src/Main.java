import telefone.Contato;
import telefone.Contatos;
import telefone.Telefone;

public class Main {
    public static void main(String[] args) {

        Telefone telefone = new Telefone("4002 8922");

        Contato contatoA = new Contato("Caio", "293241");
        Contato contatoB = new Contato("Luan", "234");
        Contato contatoC = new Contato("Murilove", "46456");
        Contato contatoD = new Contato("Lucas", "466");

        Contatos telefoneContatos = telefone.getContatos();

        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);

        System.out.println(telefone.getContatos());

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContatos.buscar("m"));

    }
}