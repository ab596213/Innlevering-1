package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgB5 {

	 public static void main(String[] args)
	    {
	        for (int studenter = 1 ; studenter <= 10 ; studenter++) {


	            String tallTxt = showInputDialog("Poengsum:");
	            int poengsum = parseInt(tallTxt);
	            if(poengsum > 100 || poengsum<0)
	            {
	                System.out.println("Ugyldig poengsum, skriv inn ny poengsum");
	                studenter--;
	            }

	            karakter(poengsum);
	        }
	    }


	    private static void karakter(int poengsum){

	            char karakter;

	            if (poengsum >=0 && poengsum <= 39) {
	                karakter = 'F';
	                System.out.println("Karakter: " + karakter);

	            }

	            else if (poengsum >= 90 && poengsum <= 100) {
	                karakter = 'A';
	                System.out.println("Karakter: " + karakter);

	            }

	            else if (poengsum >= 80 && poengsum <= 89) {
	                karakter = 'B';
	                System.out.println("Karakter: " + karakter);

	            }

	            else if (poengsum >=60 && poengsum <= 79) {
	                karakter = 'C';
	                System.out.println("Karakter: " + karakter);

	            }

	            else if (poengsum >=50 && poengsum <= 59) {
	                karakter = 'D';
	                System.out.println("Karakter: " + karakter);

	            }

	            else if (poengsum >=40 && poengsum <= 49) {
	                karakter = 'E';
	                System.out.println("Karakter: " + karakter);
	            }


	        }

	    }
