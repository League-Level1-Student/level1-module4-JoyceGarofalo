import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTestQ12 {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JLabel label = new JLabel();
	JTextField text = new JTextField();

	public static void main(String[] args) {
		PracticeTestQ12 p = new PracticeTestQ12();
		p.CreateUI();

	}

	private void CreateUI() {
		// TODO Auto-generated method stub
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		panel.add(b1);
		panel.add(b2);
		panel.add(text);
		label.setText(
				"What has rivers with no water, cities with no people, mountains with no snow, and roads with no cars?");
		b1.setText("submit answer");

	}
}
