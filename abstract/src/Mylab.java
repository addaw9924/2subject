import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mylab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f =new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("È­¾¾¿Âµµ");
		JLabel label2 = new JLabel("¼·¾¾¿Âµµ");
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		
		JButton button = new JButton("º¯È¯");
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		panel.setLayout(new FlowLayout());
		
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("¿Âµµ");
		f.setVisible(true);
		
		michut nya?>
		
		
	}

}
