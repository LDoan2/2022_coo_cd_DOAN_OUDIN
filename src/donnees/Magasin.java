package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public int comparerTitre(int i,int j){
		return this.getCd(i).getNomCD().compareTo(this.getCd(j).getNomCD());
	}

	public void triAlbum(){
		ArrayList<CD> trier = new ArrayList<CD>();
		int index;
		int taille = this.listeCds.size();
		for(int i = 0; i < taille; i++){
			index = 0;
			for(int j = 1; j < this.listeCds.size(); j++ ){
				if(this.comparerTitre(j,index) < 0){
					index = j;
				}
			}
			trier.add(this.getCd(index));
			this.listeCds.remove(index);
		}
		this.listeCds = trier;
	}


	public int compareArtiste(int i, int j){
		return (this.getCd(i).getNomArtiste().compareTo(this.getCd(j).getNomArtiste()));
	}

	public void triArtiste(){
		// On cree une liste vide pour contenir la nouvelle liste d'albums
		ArrayList<CD> temp = new ArrayList<CD>();
		// On cree un objet qui va stocker le plus petit element
		CD tempCd = null;

		int index = 0;

		// On parcourt la liste a la recherche du premiere element dans une liste croissante
		for (int i = 0; i < this.listeCds.size(); i++){
			// On compare chaque element avec tous les elements du tableau
			for (int j = 0; j < this.listeCds.size() ; j++){
				if (this.compareArtiste(i, j) > 0){
					tempCd = this.getCd(i);
					// On garde en index le rang du cd dans l'ordre croissant
					index = i;
				}
			}
		}
		// On ajoute le cd le plus petit a la liste temp
		temp.add(tempCd);
		// On supprimer l element ajouté
		this.listeCds.remove(index);




	}

}

