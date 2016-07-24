import java.util.Scanner;

public class Main {

	static Lista l=new Lista();
	
	public void losuj()
    {
		//l=new Lista();
    	int a=(int) (Math.random()*13);
    	while(a!=0)
    	{
    		int b=(int) (Math.random()*4);
    		Karta k = new Karta(a,b);
    		k.ustawZnacznik();
    		l.dodaj(k);
    		a=(int) (Math.random()*15);
    	}
    	System.out.println("Dadano karty do listy liste\n");
    }
	
	public static int czytajWartosc()
	{
		int a=-1;
		System.out.println("Podaj wartosc karty:");
		Scanner sc=new Scanner(System.in);
		//sc.close();
		String s=sc.next();
		if(s.equals("as")) a=1;
		if(s.equals("2")) a=2;
		if(s.equals("3")) a=3;
		if(s.equals("4")) a=4;
		if(s.equals("5")) a=5;
		if(s.equals("6")) a=6;
		if(s.equals("7")) a=7;
		if(s.equals("8")) a=8;
		if(s.equals("9")) a=9;
		if(s.equals("10")) a=10;
		if(s.equals("dama")) a=12;
		if(s.equals("walet")) a=11;
		if(s.equals("krol")) a=13;
		return a;
	}
	public static int czytajKolor()
	{
		int a=-1;
		System.out.println("Podaj kolor karty:");
		Scanner sc=new Scanner(System.in);
		//sc.close();
		String s=sc.next();
		if(s.equals("kier")) a=0;
		if(s.equals("karo")) a=1;
		if(s.equals("trefl")) a=2;
		if(s.equals("pik")) a=3;
		return a;
	}
	
	public static void main(String[] args) {
	
		Main m = new Main();
		while(true)
		{
		System.out.println("Karty - wybierz opcje");
		System.out.println("(1) Utworz liste");
		System.out.println("(2) Wyswietl liczbe elementow");
		System.out.println("(3) Wyswietl liste");
		System.out.println("(4) Wyswietl karty o podanej wartosci");
		System.out.println("(5) Wyswietl karty o podanym kolorze");
		System.out.println("(6) Usun zakryte");
		System.out.println("(7) Ile zakrytych? Ile odkrytych");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x==1) m.losuj();
		else if(x==2) System.out.println("Liczba elementów listy: "+l.liczbaElementow()+"\n");
		else if(x==3){l.wyswietl(); System.out.println();}
		else if(x==4)l.wyswietlPoWartosci(czytajWartosc());
		else if(x==5)l.wyswietlPoKolorze(czytajKolor());
		else if(x==6){l.usunZakryte(); l.wyswietl();}
		else if(x==7) System.out.println("Kart zakrytych: "+l.ileUkrytych()+"\nKart odkrytych: "+l.ileOdkrytych()+"\n");
	}
	}
}

