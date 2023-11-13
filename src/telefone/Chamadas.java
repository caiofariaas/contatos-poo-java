package telefone;

import java.util.ArrayList;

public class Chamadas {
    private ArrayList<Ligacao> chamadas;


    public Chamadas(){
        this.chamadas = new ArrayList<Ligacao>();
    }

    public void adicionar(Ligacao ligacao){
        this.chamadas.add(ligacao);
    }

    @Override
    public String toString() {
        String informacao = "Chamadas:\n";

        for (Ligacao ligacao: chamadas){
            informacao += ligacao.toString();
        }
        return informacao;
    }
}
