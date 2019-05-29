package reservation;

import javax.swing.JOptionPane;

public class Reservation {

	static int dhomaERezervuar = 0;

	public static int a;

	public static void main(String[] args) {
		
		fillo();
	}

	public static void rezervo() {
		Record r = new Record();
		String dhomat = "";
		for (int i = 0; i <= 9; i++) {
			if (r.get()[i] == true) {
				dhomat = dhomat + "\n" + r.getR()[i][0].toString();
			}
		}
		String s = JOptionPane
				.showInputDialog("Dhomat e lira jane: " + dhomat + "\nZgjedhni dhomen qe doni te rezervoni");
		if (s != null) {
			if (!Character.isLetter(s.charAt(0)))
				dhomaERezervuar = Integer.parseInt(s);

			if (dhomaERezervuar > 10 || dhomaERezervuar < 1) {
				s = JOptionPane.showInputDialog("Dhoma e zgjedhur nuk egziston \n" + "Dhomat e lira jane: " + dhomat
						+ "\nZgjedhni dhomen qe doni te rezervoni");
			} else {
				String emri = JOptionPane.showInputDialog("Emri i klientit: ");
				String mbiemri = JOptionPane.showInputDialog("Mbiemri i klientit: ");
				String numriPersonal = JOptionPane.showInputDialog("Numri personal: ");

				if (emri != null)
					r.set(dhomaERezervuar, 1, emri);
				if (mbiemri != null)
					r.set(dhomaERezervuar, 2, mbiemri);
				if (numriPersonal != null)
					r.set(dhomaERezervuar, 3, numriPersonal);
				r.setFalse(dhomaERezervuar);

				fillo();

			}
		}
	}

	public static void liro() {
		Record r = new Record();
		String dhomat = "";
		for (int i = 0; i <= 9; i++) {
			if (r.get()[i] == false) {
				dhomat = dhomat + "\n" + r.getR()[i][0].toString() + " \n" + r.getR()[i][1] + " \n"
						+ r.getR()[i][2] + " \n" + r.getR()[i][3]
						+ "\n________________________\n";

			}
		}
		String s = JOptionPane.showInputDialog("Dhomat e zena jane: " + dhomat + "\nZgjedhni dhomen qe doni te lironi");
		if (s != null)
			dhomaERezervuar = Integer.parseInt(s);
		if (dhomaERezervuar > 10 || dhomaERezervuar < 1) {
			s = JOptionPane.showInputDialog("Dhoma e zgjedhur nuk egziston \n" + "Dhomat e zena jane: " + dhomat
					+ "\nZgjedhni dhomen qe doni te lironi");
		}
		if (s != null)
			dhomaERezervuar = Integer.parseInt(s);

		r.setTrue(dhomaERezervuar);

		fillo();
	}
	
	public static void fillo() {
		
		String t = JOptionPane.showInputDialog("Shtyp 0 nese deshironi te rezervoni"
				+ "\n Shtyp 1 nese deshironi te lironi" + "\n Shtyp 2 per te perfunduar");
		if (t != null) {
			if (!Character.isLetter(t.charAt(0))) {
				a = Integer.parseInt(t);

				while (a != 2) {
					if (a == 0) {
						rezervo();

					} else if (a == 1) {

						liro();
					} else {

					}

				}
			} else {
				t = JOptionPane.showInputDialog("Shtyp 0 nese deshironi te rezervoni"
						+ "\n Shtyp 1 nese deshironi te lironi" + "\n Shtyp 2 per te perfunduar");
			}
		} else {
			t = JOptionPane.showInputDialog("Shtyp 0 nese deshironi te rezervoni"
					+ "\n Shtyp 1 nese deshironi te lironi" + "\n Shtyp 2 per te perfunduar");
		}
	}

}
