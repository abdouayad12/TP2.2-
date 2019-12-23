/*i made a change*/
public class Client {
	
	int num;
	String nom,prenom,adresse,tel;
	public Client()
	{
	num=0;
	nom=prenom=adresse=tel="";	
	}
	public Client(int num,String nom,String prenom, String adresse,String tel)
	   {
		this.num=num;
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.tel=tel;
	   }
    public int getnum()	
    {
    	return this.num;
    }	
    public String getnom()	
    {
    	return this.nom;
    }	
    public String getprenom()	
    {
    	return this.prenom;
    }	
    public String getadresse()	
    {
    	return this.adresse;
    }	
    public String gettel()	
    {
    	return this.tel;
    }	
	public void setnum(int num)
	{
		this.num=num;
	}
	public void setnom(String nom)
	{
		this.nom=nom;
	}
	public void setprenom(String prenom)
	{
		this.prenom=prenom;
	}
	public void setadresse(String adresse)
	{
		this.adresse=adresse;
	}
	public void settel(String tel)
	{
		this.tel=tel;
	}
	public String toString()
	{
		return ("[le client N°1 est:AYAD Abdou habitant ALGER son tel 0555241712]");
	}
    public void afficher()
    {
    	System.out.println("[le client N°"+num+" est: "+nom+" "+prenom+" habitant "+adresse+" son tel:"+tel);
    }
}
