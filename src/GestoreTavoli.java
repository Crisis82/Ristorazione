
/**
 * classe che implementa l'interfaccia Gestore e gestisce la classe dei tavoli
 */
public class GestoreTavoli implements Gestore<Tavolo> {

    @Override
    public boolean presente(Tavolo daVerificare) {
        return false;
    }

    @Override
    public void aggiungi(Tavolo daInserire) {
        if(presente(daInserire)){

        }
    }

    @Override
    public void rimuovi(Tavolo daRimuovere) {
        if(presente(daRimuovere)){

        }
    }

    @Override
    public void modifica(Tavolo daModificare) {
        if(presente(daModificare)){

        }
    }
}
