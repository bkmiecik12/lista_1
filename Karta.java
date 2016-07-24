
public class Karta {
	
	int wartosc;
	int kolor;
	boolean znacznik;
	
	public Karta(int w,int k)
	{
		wartosc=w;
		kolor=k;
	}
	public void ustawZnacznik()
	{
		if(wartosc==14) {znacznik=true; kolor=-1;}
		else znacznik=false;
	}
	public int getKolor()
	{
		return kolor;
	}
	public int getWartosc()
	{
		return wartosc;
	}
	
	public boolean jestMniejszaOd(Karta k)
	{
		boolean jest=false;
		if(getWartosc()<k.getWartosc()) 
			jest=true;
		else if (getWartosc()==k.getWartosc())
			if(getKolor()<k.getKolor())
				jest=true;
		return jest;
	}
	
}
