import java.util.List;
import Eccezioni.comandaNonValida;

public class Tavolo{
    private int numero;
    private int persone;
    private List<Comanda> comande;
    private int quantitaComande;

    /**
     * Crea un nuovo tavolo(Constructor)
     * @param numero numero del tavolo
     * @param persone numero di persone
     */
    public Tavolo(int numero, int persone) {
        this.numero = numero;
        this.persone = persone;
        quantitaComande = 0;
    }

    /**
     *
     * @return il numero del tavolo
     */
    public int getNumero() {
        return numero;
    }


    /**
     *
     * @return il numero di persone del tavolo
     */
    public int getPersone() {
        return persone;
    }


    /**
     * cambia il numero del tavolo
     * @param numero nuovo numero del tavolo
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * modifica il numero di persone al tavolo
     * @param persone nuovo numero di persone
     */
    public void setPersone(int persone) {
        this.persone = persone;
    }


    /**
     * aggiunge una comanda al tavolo assegnandogli un numero
     * @param daAggiungere comanda da aggiungere
     * @throws comandaNonValida
     */
    public void addComanda(Comanda daAggiungere) throws comandaNonValida {
        if(daAggiungere!=null){
            daAggiungere.setNumeroComanda(quantitaComande+1);
            comande.add(daAggiungere);
        }else{
            throw new comandaNonValida();
        }
    }


    /**
     *
     * @return quantità di comande prese al tavolo
     */
    public int getQuantitaComande(){
        return quantitaComande;
    }

    /**
     *
     * @return il conto del tavolo
     */
    public Double getConto(){
        Double conto = 0.0;
        for (Comanda comanda:comande) {
            conto += comanda.getPrezzo();
        }
        return conto;
    }
}
