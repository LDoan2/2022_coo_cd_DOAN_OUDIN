import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriCD {

    @Test
    public void test_tri_titre(){
        Magasin magasin = new Magasin();
        CD cd1 = new CD("a","a");
        CD cd2 = new CD("b","b");
        CD cd3 = new CD("c","c");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd3);
        magasin.ajouteCd(cd2);

        magasin.triAlbum();

        assertEquals(cd1.getNomCD(),magasin.getCd(0).getNomCD(),"C'est pas le bon cd");
        assertEquals(cd2.getNomCD(),magasin.getCd(1).getNomCD(),"C'est pas le bon cd");
        assertEquals(cd3.getNomCD(),magasin.getCd(2).getNomCD(),"C'est pas le bon cd");

    }

    @Test
    public void test_tri_artiste(){
        Magasin magasin = new Magasin();
        CD cd1 = new CD("a","a");
        CD cd2 = new CD("b","b");
        CD cd3 = new CD("c","c");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd3);
        magasin.ajouteCd(cd2);

        magasin.triArtiste();

        assertEquals(cd1.getNomArtiste(),magasin.getCd(0).getNomArtiste(),"C'est pas le bon cd");
        assertEquals(cd2.getNomArtiste(),magasin.getCd(1).getNomArtiste(),"C'est pas le bon cd");
        assertEquals(cd3.getNomArtiste(),magasin.getCd(2).getNomArtiste(),"C'est pas le bon cd");

    }
}
