import java.util.*;

import Eccezioni.alcuniPiattiNonServiti;

/**
 * classe per la gestiona di una singola comanda di un tavolo
 */
public class Comanda{
    private int numeroComanda;
    private HashMap<Pietanza,Boolean> pietanze;
    private boolean servita;

    /**
     * assegna un numero in base alla quantità di comande già prese in consegna precedentemente
     * al tavolo corrispondente
     * @param numeroComanda numero della comanda
     */
    public void setNumeroComanda(int numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    /**
     * restituisce il numero dell'ordine della comanda rispetto alle altre
     * @return numero della comanda
     */
    public int getNumeroComanda() {
        return numeroComanda;
    }

    /**
     * aggiunge una pietanza alla comanda verificando che non sia nulla
     * @param daAggiungere pietanza da aggiungere
     */
    public void aggiungiPietanza(Pietanza daAggiungere){
        if(daAggiungere!=null){
            pietanze.put(daAggiungere, false);
        }
    }

    /**
     * rimuove una pietanza non nulla
     * @param daRimuovere pietanza da rimuovere
     */
    public void rimuoviPietanza(Pietanza daRimuovere){
        if(daRimuovere!=null){
            pietanze.remove(daRimuovere);
        }
    }

    /**
     * cambia il valore della pietnza consegnata da false a true
     * @param Consegnata pietanza che è stata consegnata
     */
    public void setPietanzaServita(Pietanza Consegnata){
        pietanze.replace(Consegnata, true);
    }

    /**
     * verifica che i piatti siano serviti e nel caso vero segna come consegnata la comanda
     * @throws alcuniPiattiNonServiti lancia l'eccezzione se mancano dei piatti da servire
     */
    public void tuttiPiattiServiti() throws alcuniPiattiNonServiti{
        boolean tuttiServiti=true;

        Set set = pietanze.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry piatto = (Map.Entry) it.next();
            if(piatto.getValue().equals(false)){
                tuttiServiti=false;
                break;
            }
        }

        if(tuttiServiti){
            setComandaServita();
        }else{
            throw new alcuniPiattiNonServiti();
        }
    }

    /**
     * segna come cosegnata l'intera comanda
     */
    private void setComandaServita(){
        servita = true;
    }

    /**
     * verifica che l'intera comanda sia stata consegnata
     * @return vero se consegnata, falso altrimenti
     */
    public boolean comandaServita(){
        return servita;
    }


    /**
     *
     * @return il prezzo totale della comanda effettuata
     */
    public Double getPrezzo(){
        Double costoComanda = 0.0;

        Set set = pietanze.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry mapPiatto = (Map.Entry) it.next();
            Pietanza piattoSingolo = (Pietanza) mapPiatto.getKey();
            costoComanda += piattoSingolo.getPrezzo();
        }

        return costoComanda;
    }

    /**
     *
     * @return un set delle pietanze inserite nella comanda
     */
    public Set getPietanze() {
        return pietanze.keySet();
    }
}
