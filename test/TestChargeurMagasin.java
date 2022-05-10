import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChargeurMagasin {
    @Test
    public void test1() throws FileNotFoundException {
        boolean error = false;
        try {
            String repertoire = "/musicBrainz/";
            ChargeurMagasin charge = new ChargeurMagasin(repertoire);
            Magasin resultat = charge.chargerMagasin();
        }catch (FileNotFoundException e){
            error = true;
        }
        assertEquals(false, error, "Repertoire incorrect");
    }

    public void test2() throws FileNotFoundException{
        boolean error = false;
        try {
            String repertoire = "musicBrainz/";
            ChargeurMagasin charge = new ChargeurMagasin(repertoire);
            Magasin resultat = charge.chargerMagasin();
        }catch (FileNotFoundException e){
            error = true;
        }
        assertEquals(true, error, "Repertoire incorrect");
    }

}
