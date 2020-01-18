/**
 * interfaccia per la gestione degli elemento di alcune classi
 * @param <T> tipo di classe
 */
public interface Gestore<T> {

    /**
     * cerca l'elemento per vedere se è già presente
     * @param daVerificare elemento di cui controllare la presenza
     * @return true se presente, false altrimenti
     */
    boolean presente(T daVerificare);

    /**
     * inserire un nuovo elemento
     * @param daInserire nuovo elemento da inserire nel Gestore di tipo T
     */
    void aggiungi(T daInserire);

    /**
     * controlla se è presente e lo rimuove
     * @param daRimuovere elemento da rimuovere
     */
    void rimuovi(T daRimuovere);

    /**
     * controlla se l'elemento è presente e lo modifica
     * @param daModificare modifica l'elemento
     */
    void modifica(T daModificare);
}
