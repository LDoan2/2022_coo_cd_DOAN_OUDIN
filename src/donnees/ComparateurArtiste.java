package donnees;

public class ComparateurArtiste implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        boolean avant = false;
        if(cd1.getNomArtiste().compareTo(cd2.getNomArtiste()) < 0){
            avant = true;
        }
        return avant;
    }
}
