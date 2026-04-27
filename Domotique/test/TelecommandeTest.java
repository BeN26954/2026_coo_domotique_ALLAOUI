import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    @Test
    public void testAjoutLampeTelecommandeVide() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        assertEquals(1, t.getNombreLampes());
    }
