package telefone;
import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    // Método 'sobrecarga'

    public void adicionar(Contato novoContato){
        contatos.add(novoContato);
    }

// Faz a busca atraves de uma letra inicial!

    public Contatos buscar(String palavraChave){

           Contatos contatosFiltrados = new Contatos();
           String min = palavraChave.toLowerCase();

           for(Contato contato : contatos){
               String nomeCtt = contato.getNome().toLowerCase();

               if (nomeCtt.startsWith(min)) {
                   contatosFiltrados.adicionar(contato);
               }
           }
           return contatosFiltrados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        // Contatos:
        String informacao = "Contatos:\n";

        for (Contato contato: contatos) {
            informacao += contato.toString() + "\n";
        }
        return informacao;
    }
}
