package jana60;

public class Main {

	public static void main(String[] args) {
		
	/*	Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto e testate 
	le funzionalità delle vostre classi in una classe Main con metodo main. */
		
	Smartphone cellulare = new Smartphone(101, "iPhone", "Apple", 799.99f, 0.22f, 192873, 128);
	Televisori televisore = new Televisori(102, "Ax500", "Samsung", 359.99f, 0.22f, 200.22f);
	Cuffie airpods = new Cuffie(103, "Airpods", "Apple", 199.29f, 0.22f, "bianco");

	
	System.out.println(cellulare.toString());
	System.out.println(televisore.toString());
	System.out.println(airpods.toString());
	
	
	}
	
}
