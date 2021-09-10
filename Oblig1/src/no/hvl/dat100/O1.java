package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main(String[] args) {
		String bruttoTxt = showInputDialog("Bruttoinntekt: ");
		int brutto = Integer.parseInt(bruttoTxt);
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		if(brutto >= 0 && brutto <= 184799) {
			showMessageDialog(null, "Du betaler ingen skatt");
		}else if(brutto >= 184800 && brutto <=260099) {
			double t1 = ((brutto-184800) * trinn1);
			showMessageDialog(null, "Trinn 1" + "\nTrinnskatten er: " + t1);
		}else if(brutto >= 260100 && brutto <= 651249) {
			double t2 = ((brutto-260100) * trinn2);
			t2 = t2 + ((260100-184800) * trinn1);
			showMessageDialog(null, "Trinn 2" + "\nTrinnskatten er: " + t2);
		}else if(brutto >= 651250 && brutto <= 1021549) {
			double t3 = ((brutto-651250) * trinn3);
			t3 = t3 + ((260100-184800) * trinn1);
			t3 = t3 + ((651250-260100) * trinn2);
			showMessageDialog(null, "Trinn 3" + "\nTrinnskatten er: " + t3);
		}else if(brutto >= 1021550) {
			double t4 = ((brutto-1021550) * trinn4);
			t4 = t4 + ((260100-184800) * trinn1);
			t4 = t4 + ((651250-260100) * trinn2);
			t4 = t4 + ((1021550-651250) * trinn3);
			showMessageDialog(null, "Trinn 4" + "\nTrinnskatten er: " + t4);
		}else showMessageDialog(null, "Skriv inn gyldig sum");
	}

}


