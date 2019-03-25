
public class TP2EXO2 {
	public static void main(String[] args) {
		Client c1=new Client(4,"AYAD","Abdou","ALGER PLAGE","0555241712");
		c1.afficher();
		c1.setadresse("PARIS");
		c1.afficher();
		System.out.println("le tel du client 4 est:"+c1.gettel());
		System.out.println("la chaine est:"+c1.toString());	
	}
}
