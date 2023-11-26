package LOGIN_UI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class DashBoard_Frame extends JFrame implements ActionListener {

	ImageIcon img = new ImageIcon(new ImageIcon("bgdash.jpg").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH));
	JLabel bg = new JLabel("", img, JLabel.CENTER);
	ImageIcon icon = new ImageIcon(new ImageIcon("icon.jpg").getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH));
		
	ImageIcon img3 = new ImageIcon(new ImageIcon("dashboard.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
	
	ImageIcon img1 = new ImageIcon(new ImageIcon("ME.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
	JLabel profile = new JLabel("", img1, JLabel.CENTER);
	
	ImageIcon img2 = new ImageIcon(new ImageIcon("circle-.png").getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH));
	JLabel outline = new JLabel("", img2, JLabel.CENTER);
	
	JButton signout=new JButton("Sign Out");
	JLabel welcome= new JLabel ();
	JLabel name= new JLabel ();
	
	String name1st;
	String name2nd;
	String middleinitial;
	String username1st;
	String password1st;
	
	void  DashBoard_Frame() {
		setIconImage(icon.getImage());
		setTitle("Login");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bg.setBounds(0, 0, 500, 400);
		profile.setBounds(140, 100, 200, 200);
		outline.setBounds(130, 90, 220, 220);
		
		welcome.setText("Welcome !! ");
		welcome.setBounds(10, 20, 465, 40);;
		welcome.setHorizontalAlignment(JLabel.CENTER);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		//name.setText("ciasfnisdnfksdnfkjsnfkjdsdfkjsnfkjdsndfk ");
		name.setBounds(10, 50, 465, 40);
		name.setHorizontalAlignment(JLabel.CENTER);
		//name.setBorder(BorderFactory.createLineBorder(Color.white,3));
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		signout.setBounds(180, 330, 120, 25);
		signout.setForeground(Color.white);
		signout.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		signout.setFocusable(false);
		signout.setBackground(Color.decode("#0000FF"));
		signout.addActionListener(this);
	
		add(signout);
		add(profile);
		add(outline);
		add(name);
		add(welcome);
		setLayout(null);
		setVisible(true);
		add(bg);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//Back to Login or sign out close-------------------------------------------------------------------------------------------------------------
		if (e.getSource().equals(signout)) {
			int ext = JOptionPane.showConfirmDialog(this, "Are you want to Sign Out?", "sign out", JOptionPane.YES_NO_OPTION);
			if (ext == JOptionPane.YES_OPTION) {
				this.setVisible(false);
				Login_Frame log =new Login_Frame();
	 	    	log.Login_Frame();
	 	    	log.user=username1st;
	 	    	log.pass=password1st;
	 	    	log.Firstname=name1st;
	 	    	log.Middlename=middleinitial;
	 	    	log.Lastname=name2nd;	 	    	
			}
		}
		
	}

}
