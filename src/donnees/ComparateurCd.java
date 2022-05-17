package donnees;

public interface ComparateurCd {


    /**
     * Methode permettant de retourner un boolean
     * si un CD se situe avant ou non un CD
     * @param cd1
     * @param cd2
     */
    public boolean etreAvant(CD cd1, CD cd2);

}
