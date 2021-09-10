package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		String intTxt = showInputDialog("Heltall: ");
		int x = Integer.parseInt(intTxt);
		int faculty = 1;
		
		if ( x > 0) {
			for (int i = 1; i <= x;i++) {
				faculty *= i;
			}
			showMessageDialog(null, "n! er : " + faculty);
		}else {
			showMessageDialog(null, "Ikke gyldig, skriv inn heltall");
		}

	}

}