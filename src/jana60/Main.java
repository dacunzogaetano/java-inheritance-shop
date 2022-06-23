package jana60;

public class Main {

	public static void main(String[] args) {
		
	/*	Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto e testate 
	le funzionalità delle vostre classi in una classe Main con metodo main. */
		
	Smartphone cellulare = new Smartphone(101, "iPhone 10", "Apple", 499.99f, 0.22f, 192873, 64);
	Smartphone cellulare2 = new Smartphone(102, "iPhone 11", "Apple", 699.99f, 0.22f, 192874, 128);
	Televisori televisore = new Televisori(301, "Ax500", "Samsung", 359.99f, 0.22f, 200.22f, true);
	Televisori televisore2 = new Televisori(302, "Ax300", "Samsung", 159.99f, 0.22f, 200.22f, false);
	Cuffie airpods = new Cuffie(501, "Airpods", "Apple", 199.29f, 0.22f, "bianco", false);
	Cuffie airpods2 = new Cuffie(502, "Airpods Max", "Apple", 289.29f, 0.22f, "bianco", true);

	
	System.out.println(cellulare.toString());
	System.out.println(cellulare2.toString());
	System.out.println("\n");
	System.out.println(televisore.toString());	
	System.out.println(televisore2.toString());
	System.out.println("\n");
	System.out.println(airpods.toString());
	System.out.println(airpods2.toString());
	
	}
	
}
