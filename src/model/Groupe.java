package model;

public class Groupe {

	String name;
	int nbMorceaux;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbMorceaux() {
		return nbMorceaux;
	}

	public void setNbMorceaux(int nbMorceaux) {
		this.nbMorceaux = nbMorceaux;
	}

	public Groupe() {

	}

	public Groupe(String name) {
		this.name = name;
	}

}
