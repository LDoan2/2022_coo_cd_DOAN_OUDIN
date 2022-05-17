package donnees;

public class ComparateurAlbum implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        boolean res = false;

        if (cd1.getNomArtiste().compareTo(cd2.getNomArtiste()) < 0){
            res = true;
        }

        return(res);
    }
}
