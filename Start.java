package feestje;

import java.util.Scanner;

public class Start {

	public static void main(String [] args) {
		Menu.printMenu();
		Menu.inputMenu();
	}
	

}
class Menu{
	static void printMenu(){
		System.out.println("Typ 1 voor een zanger");
		System.out.println("Typ 2 voor een goochelaar");
		System.out.println("Typ 3 voor een stripper");
		System.out.println("Typ 4 voor een clown");
		System.out.println("Typ 5 voor een jojo-artiest");
	}
	static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		int keuze = sc.nextInt();
		return keuze;
	}
}
class Boekingsbureau{
	
	Artiest artiestOpleveren(int artiestKeuze) {
		return new Zanger();
	}
}
abstract class Artiest implements Optreden{

	public Artiest() {
		
	}

}
class Zanger extends Artiest{
	
}
class Goochelaar extends Artiest{
	
}
class Stripper extends Artiest{
	
}
class Clown extends Artiest{
	
}
abstract class Band implements Optreden{
	
}
class Rockband extends Band{
	
}
class Kerkkoor extends Band{
	
}
interface Optreden{
	
}
