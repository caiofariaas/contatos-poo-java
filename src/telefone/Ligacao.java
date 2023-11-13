package telefone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import telefone.*;

public class Ligacao {
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public Ligacao(Contato contatoOrigem, Contato contatoDestino){
        this.numeroOrigem = contatoOrigem.getNumero();
        this.numeroDestino = contatoDestino.getNumero();
    }

    public void ligar(){
        System.out.println("Ligando para " + numeroDestino);
        System.out.println("Chamando...");
        System.out.println("O número esta ocupado!");
        DateTimeFormatter formatadorData =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorData.format(horarioAgora);
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    @Override
    public String toString() {
        return String.format("Origem: %s\nDestino: %s\nHorario: %s", numeroOrigem, numeroDestino, horarioLigacao);
    }
}
