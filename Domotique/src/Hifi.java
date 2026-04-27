public class Hifi implements Appareil {
    int son = 0;

    public void allumer() {
        son += 10;
        if (son > 100) son = 100;
    }

    public void eteindre() {
        son = 0;
    }

    public String toString() {
        return "Hifi :" + son;
    }
}
