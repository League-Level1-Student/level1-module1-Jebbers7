package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	String answer = JOptionPane.showInputDialog("What flavor should the popcorn be?");
	Popcorn popcorn = new Popcorn(answer);
	String answer2 = JOptionPane.showInputDialog("How many minutes should the popcorn be cooked for?");
	int answer2Int = Integer.parseInt(answer2);
	microwave.putInMicrowave(popcorn);
	microwave.setTime(answer2Int);
	microwave.startMicrowave();
}
}
