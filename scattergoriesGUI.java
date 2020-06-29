import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class scattergoriesGUI implements ActionListener {

	private char letter;
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;

	public scattergoriesGUI() {

		frame = new JFrame();

		button = new JButton("Generate Letter");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);

		label = new JLabel("To start, hit the button to generate the first random letter.");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 30, 10, 30));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Scattergories Letter Generator");
		frame.setSize(new Dimension(500, 300));
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		new scattergoriesGUI();
	}

	public void actionPerformed(ActionEvent e) {
		letter = generate();
		label.setText("The letter for this round is: " + letter);
	}

	public char generate() {
		//possibleLetters is the alphabet minus Q, V, X, and Z
		char[] possibleLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'W', 'Y'};

		//generate a random number between 0 and 21
		int min = 0;
		int max = 21;
		int rand = (int)(Math.random() * (max - min + 1));

		letter = possibleLetters[rand];
		return letter;
	}
}