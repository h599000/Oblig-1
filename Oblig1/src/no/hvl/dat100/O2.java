package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {
public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			String poengTxt = showInputDialog("Skriv in poengsum: ");
			int p = Integer.parseInt(poengTxt);
			if(p <= 100 && p >= 90) {
				System.out.println("A");
			}else if
			(p <= 89 && p >= 80) {
				System.out.println("B");
			}else if
			(p <= 79 && p >= 60) {
				System.out.println("C");
			}else if
			(p <= 59 && p >= 50) {
				System.out.println("D");
			}else if
			(p <= 49 && p >= 40) {
				System.out.println("E");
			}else if
			(p <= 39 && p >= 0) {
				System.out.println("F");
			}else {showMessageDialog(null, "Skriv inn gyldig poengsum."); 
			i --;
			}
		}	
				
	}

}
