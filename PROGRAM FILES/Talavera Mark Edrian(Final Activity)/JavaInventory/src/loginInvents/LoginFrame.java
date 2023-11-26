package loginInvents;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener {
	JLabel [] labels =new JLabel[2];
	String [] userpass = {"Username : ","Passwords : "};
	JTextField  user= new JTextField();
	JPasswordField PassField =new JPasswordField();
	JButton [] button =new JButton [2];
	String [] btn = {"Cancel","Login"};
	JCheckBox showpass=new JCheckBox();
	
	JLabel labellog=new JLabel("Login",JLabel.CENTER);
	
	ImageIcon img = new ImageIcon(new ImageIcon("bg.jpg").getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
	JLabel background = new JLabel("", img, JLabel.CENTER);
	
	ImageIcon img1 = new ImageIcon(new ImageIcon("cart.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	JLabel cart = new JLabel("", img1, JLabel.CENTER);
	
	ImageIcon img2 = new ImageIcon(new ImageIcon("close.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	JLabel close = new JLabel("", img2, JLabel.CENTER);

	 LoginFrame(){
		this.setUndecorated(true);
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.decode("#205072"));
		this.setTitle("Login");
		background.setBounds(0,0,400,300);
		cart.setBounds(0,240,70,70);
		 this.add(cart);
	        // Add a mouse listener to the label
			close.setBounds(375,5,20,20);
			close.setFont(new Font("Cambria", Font.BOLD, 16));
			close.setForeground(Color.RED);
			close.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {          
	            	  int result = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to <br> close this login? </html>", "CONFIRM", JOptionPane.YES_NO_OPTION);
	                  if (result == JOptionPane.YES_OPTION) {  
	                      Component component = (Component) e.getSource();
	                      Window window = SwingUtilities.getWindowAncestor(component);
	                      window.dispose();
	                  }	              	    
	            }
	        });
		labellog.setBounds(0,20,400,60);
		labellog.setFont(new Font("Cambria", Font.BOLD, 40));
		labellog.setForeground(Color.white);
		
		this.add(labellog);
		int y=130;
		for(int i=0; i<=labels.length-1;i++) {
			labels[i] = new JLabel();
			labels[i].setText(userpass[i]);
			labels[i].setFont(new Font("Cambria", Font.BOLD, 16));
			labels[i].setForeground(Color.white);
			labels[i].setBounds(30, y, 150, 25);
			this.add(labels[i]);
			y =+ 180;
		}
		user.setBounds(120,130,210,30);
		user.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
		user.setFont(new Font("Cambria", Font.BOLD, 14));
		user.setForeground(Color.white);
		user.setOpaque(false);
		
		PassField.setBounds(120,175,210,30);
		PassField.setFont(new Font("Cambria", Font.BOLD, 14));
		PassField.setForeground(Color.white);
		PassField.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
		PassField.setOpaque(false);
		
		int x=125;
		for(int i=0; i<=button.length-1;i++) {
			button[i] = new JButton();
			button[i].setText(btn[i]);
			button[i].setBounds(x,230 , 90, 25);
			button[i].addActionListener(this);
			button[i].setFocusable(false);
			button[i].setFont(new Font("Cambria", Font.BOLD, 12));
			button[i].setForeground(Color.white);
			button[0].setBackground(Color.decode("#800000"));
			
			this.add(button[i]);
			x =+ 225;
		}
		button[1].setBackground(Color.decode("#205072"));
		showpass.setText("Show Password");
		showpass.setForeground(Color.WHITE);
		showpass.setFont(new Font("Cambria", Font.BOLD, 14));
		showpass.setBounds(120,200,200,30);
		showpass.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.white));
		showpass.setFocusable(false);
		showpass.setOpaque(false);
		showpass.addActionListener(this);
		
		this.add(showpass);
		this.add(user);
		this.add(PassField);
		this.add(close);
		this.add(background);
		this.setLayout(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			String username ="k";
			String pass = "k";
			
			if (e.getSource()== button[0]) {
				int ext = JOptionPane.showConfirmDialog(this, "Are you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION);
				if (ext == JOptionPane.YES_OPTION) {
					this.dispose();
				}}

		if(e.getSource()==button[1]) {
			if (user.getText().isBlank()) {
				JOptionPane.showMessageDialog(this,"Please Enter your username and password" ,"invalid" , JOptionPane.ERROR_MESSAGE);
			}
			
			else if(username.equals(user.getText()) && pass.equals(new String(PassField.getPassword()))) {
				JOptionPane.showMessageDialog(this, "Login", "Successfully Login", JOptionPane.INFORMATION_MESSAGE);
				//subClassFrame inventory=new subClassFrame();
				Dashboard sub =new Dashboard();
		            sub.Dashboard();
		            dispose();
				this.setVisible(false);		
			}
			else {
				JOptionPane.showMessageDialog(this,"<html>The Username/Password <br>you entered is incorrect.<br>Try Again!</html>" ,"Incorrect Username/Passsword" , JOptionPane.ERROR_MESSAGE);
			}}
		
		if(e.getSource()==showpass) {
			if(showpass.isSelected()==true) {
				PassField.setEchoChar((char)0);
			}else {		
				PassField.setEchoChar('*');
			}}	
	}
}
