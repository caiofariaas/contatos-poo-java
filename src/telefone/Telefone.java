package telefone;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;


    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        this.contatos = new Contatos();
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public Contatos getContatos() {
        return contatos;
    }
}
