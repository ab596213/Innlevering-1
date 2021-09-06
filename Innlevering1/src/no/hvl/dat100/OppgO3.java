package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgO3 {

public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Tall?");
		int tall = parseInt(tallTxt);
		
		long fakultet = 1;
		
		int i = 1;
		
		while (i <= tall)
		{
		fakultet = fakultet * i;
        i++;
		}
		
		//		for (int i = 1; i <= tall; i++) 	

		
		if (tall <= 0){
		System.out.println("Tallet er negativt. skriv inn et positivt tall :)");
		}
		
		else {
		System.out.println("Fakultet til " + tall + " er " + fakultet);
		}
		
	
 }
}
