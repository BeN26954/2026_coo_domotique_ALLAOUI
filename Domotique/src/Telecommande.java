import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }
    public void ajouterLampe(Lampe l) {
        appareils.add(l);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= appareils.size()) {
            throw new IndexOutOfBoundsException("Indice invalide");
        }
        appareils.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= appareils.size()) {
            throw new IndexOutOfBoundsException("Indice invalide");
        }
        appareils.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : appareils) {
            l.allumer();
        }
    }
}
