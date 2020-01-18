/**
 * Classe per gestire le variazioni delle singole pietanze
 */
public class Variazione{
    private String nome;
    private Double prezzo;
    private boolean attivo;

    /**
     * crea una nuova variazione
     * @param nome nome della variazione
     * @param prezzo prezzo della variazione
     */
    public Variazione(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        attivo = true;
    }

    /**
     *
     * @return nome della variazione
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return prezzo della variazione
     */
    public Double getPrezzo() {
        return prezzo;
    }

    /**
     * disattivazione della variazione
     */
    public void disattiva(){
        attivo = false;
    }

    /**
     * attivazione della variazione
     */
    public void attiva(){
        attivo = true;
    }
}
