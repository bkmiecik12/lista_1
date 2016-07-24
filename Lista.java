public class Lista {
	private Element pierwszy;
    private int size;

    public Lista(){
        pierwszy=null;
        size=0;
    }
    
    public void usun(Karta o)
    {
    	Element t=pierwszy;
    	while(t.nastepnik!=null &&!t.nastepnik.getValue().equals(o))
    	{
    		t=t.nastepnik;
    	}
    	t.nastepnik.wyswietl1();
    	t.nastepnik=t.nastepnik.nastepnik;
    	System.out.println();
    }
    
    public void usunZakryte()
    {
    	for(int i=0;i<=ileUkrytych()+1;i++)
    	{
    		Element t=pierwszy;
    		while(t.nastepnik!=null && t.nastepnik.getValue().wartosc!=14)
    		{
    			t=t.nastepnik;
    		}
    		//t.nastepnik.wyswietl1();
    		t.nastepnik=t.nastepnik.nastepnik;
    		size--;
    	}
    	System.out.println("Usunieto karty zakryte");
    }
    
    public Element szukaj(Karta o)
    {
    	Element t=pierwszy;
    	while(t.nastepnik!=null &&!t.nastepnik.getValue().equals(o))
    	{
    		t=t.nastepnik;
    	}   	
    	return t.nastepnik;
    }
    
    public void wyswietlPoKolorze(int k)
    {
    	boolean bylem=false;
    	Element t=pierwszy;
    	while(t.nastepnik!=null)
    	{
    		if(t.nastepnik.getValue().kolor==k)
    			{t.nastepnik.wyswietl1(); bylem=true;}
    		t=t.nastepnik;
    	}
    	if(!bylem) System.out.println("Brak kart");
    	System.out.println();
    }
    
    public void wyswietlPoWartosci(int k)
    {
    	boolean bylem=false;
    	Element t=pierwszy;
    	while(t.nastepnik!=null)
    	{
    		if(t.nastepnik.getValue().wartosc==k)
    			{t.nastepnik.wyswietl1(); bylem=true;}
    		t=t.nastepnik;
    	}
    	if(!bylem) System.out.println("Brak kart");
    	System.out.println();
    }
    
    public int ileUkrytych()
    {
    	int licznik=0;
    	boolean bylem=false;
    	Element t=pierwszy;
    	while(t.nastepnik!=null)
    	{
    		if(t.nastepnik.getValue().wartosc==14)
    			{licznik++; bylem=true;}
    		t=t.nastepnik;
    	}
    	return licznik;
    }
    public int ileOdkrytych()
    {return size-ileUkrytych();}
    
    public int liczbaElementow(){
        return pusta()?size:--size;
    }

    public boolean pusta(){
        return (pierwszy==null);
    }
    
	public void wyswietl(){
    	Element e = pierwszy.nastepnik;

    	while (e.nastepnik!=null)
    	{
    		e.wyswietl1();
    		e = e.nastepnik;
    	}
    	e.wyswietl1();
    	return;
    }
	
	public void dodaj(Karta o)
	{
		Element el=new Element(o);
		if(pusta())
			pierwszy=el;
		else
		{
			Element pom = pierwszy;
			while(pom.nastepnik!=null&&pom.nastepnik.getKarta().jestMniejszaOd(el.getKarta()))
				pom=pom.nastepnik;
			el.setNastepny(pom.nastepnik);
			pom.setNastepny(el);
		}
		size++;
	}

    
}