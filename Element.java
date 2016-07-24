public class Element{
        private Karta karta=null; //aktualny element
        Element nastepnik=null; //referencja na obiekt kolejny
        
        
        public Element(Karta karta){
            this.karta=karta;
        }
        public Karta getValue(){
            return karta;
        }
        
        public Element getNastepny(){
            return nastepnik;
        }
        
        public void setNastepny(Element n){
            nastepnik = n;
        }
 
        public void setValue(Karta o){
            karta = o;
        }
        public Karta getKarta()
    	{
    		return karta;
    	}
        
        public void wyswietl1() throws NullPointerException
        {
        	//System.out.println(karta.wartosc+" "+karta.kolor);
        	String w="p";
        	String k="";
        	if(karta.wartosc==1) w="as";
        	else if(karta.wartosc==2) w="2";
        	else if(karta.wartosc==3) w="3";
        	else if(karta.wartosc==4) w="4";
        	else if(karta.wartosc==5) w="5";
        	else if(karta.wartosc==6) w="6";
        	else if(karta.wartosc==7) w="7";
        	else if(karta.wartosc==8) w="8";
        	else if(karta.wartosc==9) w="9";
        	else if(karta.wartosc==10) w="10";
        	else if(karta.wartosc==11) w="walet";
        	else if(karta.wartosc==12) w="dama";
        	else if(karta.wartosc==13) w="krol";
        	else if(karta.wartosc==14) w="[karta ukryta]";
        	else w="v";
        	if(karta.kolor==3)k="pik";
        	else if(karta.kolor==2)k="trefl";
        	else if(karta.kolor==1)k="karo";
        	else if(karta.kolor==0)k="kier";
        	System.out.printf("%s %s%n",w,k);
        }
        
    }