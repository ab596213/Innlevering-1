package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgB4 {

	public static void main(String[] args) {
		String inntektTxt = showInputDialog("Årsinntekt?");
		int inntekt = parseInt(inntektTxt);
		
				
		if(inntekt >= 184800 && inntekt < 260100) 
			System.out.println("Trinnskatt: " + inntekt*0.017 + " kr");
		
		else if(inntekt < 184800) 
			System.out.println("Trinnskatt: " + "0" + " kr");

		else if (inntekt >= 260100 && inntekt < 651250)
			System.out.println("Trinnskatt: " + inntekt*0.04 + " kr");
		
		else if (inntekt >= 651250 && inntekt < 1021550)
			System.out.println("Trinnskatt: " + inntekt*0.132 +" kr");
		
		else if (inntekt >= 1021550)
			System.out.println("Trinnskatt: " + inntekt*0.162 + " kr");
	
		
		
	}

}
