import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }
    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IndexOutOfBoundsException("Indice invalide");
        }
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IndexOutOfBoundsException("Indice invalide");
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : lampes) {
            l.allumer();
        }
    }
}
