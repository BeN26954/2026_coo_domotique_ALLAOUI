public class Lampe implements Appareil {
    public class Lampe {

        private String nom;
        private boolean allume;

        public Lampe(String nom) {
            this.nom = nom;
            this.allume = false;
        }

        public void allumer() {
            allume = true;
        }

        public void eteindre() {
            allume = false;
        }

        public String toString() {
            return nom + (allume ? " (allumée)" : " (éteinte)");
        }
    }
