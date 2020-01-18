public class PietanzaVariabile {
    private Pietanza pietanza;
    private Variazione variazione;

    /**
     * pietanza senza variazione
     * @param piattoDaVariare pietanza
     */
    public PietanzaVariabile(Pietanza piattoDaVariare) {
        this.pietanza = piattoDaVariare;
        variazione = null;
    }

    /**
     * pietanza con variazione
     * @param piattoDaVariare pietanza
     * @param variazione variazione da aggiungere alla pietanza
     */
    public PietanzaVariabile(Pietanza piattoDaVariare, Variazione variazione) {
        this.pietanza = piattoDaVariare;
        this.variazione = variazione;
    }


    /**
     *
     * @return prezzo variato se è stata aggiunta una variazione
     */
    public Double getPrezzo(){
        if(variazione==null){
            return pietanza.getPrezzo();
        }else{
            return pietanza.getPrezzo() + variazione.getPrezzo();
        }
    }

}
