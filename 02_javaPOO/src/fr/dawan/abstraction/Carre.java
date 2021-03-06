package fr.dawan.abstraction;

public class Carre extends Forme{
	
	protected int cote = 4;
	
	public int prop1 = 20;
	
	/*
	 * Pour appeler le constructeur de la classe parente, il faut 
	 * utiliser le cl? super()
	 * super() sans param?tre appelle le constructeur de la classe 
	 * parente sans param?tre
	 */
//	public Carre() {
//		super();
//		System.out.println("Je suis dans la classe carre");
//	}
	
//	public Carre() {
//		super("Constructeur de la classe parente avec param?tre");
//		System.out.println("Je suis dans la classe carre");
//	}
	
	//Le mot cl? "super"  permet d'appeler des m?thodes et attributs
	//de la classe m?re 
	public Carre() {
		super();
		System.out.println(super.prop1 + this.prop1);
	}
	
	@Override
	public double aire() {
		return cote * cote;
	}


}
