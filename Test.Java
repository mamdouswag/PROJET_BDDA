import java.util.Scanner;

public class Test {
static int val=0;

	public static String input (){
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		sc.close();
		return nom;
	}

	public static void add (String nom, String tab[]){	
		tab[val]=nom;
		val++;	
	}

	public static void list (String tab[]){
		for (int i=0;i<tab.length;i++){
		System.out.println(tab[i]);
		}
	}

	public static void main(String[] args) {
	//System.out.println("my arg is " +args[0]);
	String[] tab = new String[10];
	String cmd,nom;
	
	do {
	System.out.println("enter une action\nADD\nLIST\nQUIT\n");
	
	cmd = input();
	switch(cmd){
		case "ADD" : nom = input(); add(nom, tab);
		break;

		case "LIST" : list(tab);
 		break;
	
		case "QUIT" : System.out.println("salam");
		break;
		default :
		}

	}while (cmd != "QUIT");

}
}
