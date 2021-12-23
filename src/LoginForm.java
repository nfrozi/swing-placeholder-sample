import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LoginForm {

	private JFrame frame;
	private EmailTextField txtEmail;

	private void initComponent()
	{
		frame = new JFrame("Form Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		
		txtEmail = new EmailTextField();
		
		frame.add(txtEmail, BorderLayout.NORTH);
	}
	
	public void showForm() {
		initComponent();
		frame.setVisible(true);
	}
}
