package assignmentOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginapp implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel userlabel =new JLabel("USER: ");
		userlabel.setBounds(10,20, 80, 25);
		panel.add(userlabel);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		JPasswordField passwordText = new  JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		JButton button = new JButton();
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginapp());
		panel.add(button);
		
		JLabel success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		string user =s
		System.out.println();
		
		
	}

}
