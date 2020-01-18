public class Pietanza {
    private String nome;
    private Double prezzo;
    private TipiPietanze tipo;

    /**
     * Crea una nuova pietanza (Constructor)
     * @param nome nome della pietanza
     * @param prezzo prezzo del piatto
     * @param tipo tipologia a cui appartiene la pietanza
     */
    public Pietanza(String nome, Double prezzo, TipiPietanze tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public TipiPietanze getTipo() {
        return tipo;
    }
}
