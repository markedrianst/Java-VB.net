package inventory;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class pos extends JFrame {
	
	ImageIcon img = new ImageIcon(new ImageIcon("inv7.jpg").getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH));
	JLabel background = new JLabel("", img, JLabel.CENTER);
	JPanel panel = new JPanel();
	JPanel title = new JPanel();
	JPanel dt = new JPanel();
	JPanel qty = new JPanel();
	JPanel inc = new JPanel();
	JPanel tbl = new JPanel();
	JPanel ttl = new JPanel();
	JPanel itm = new JPanel();

	pos(){
			this.setSize(1000, 700);
	        this.setTitle("Login");
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	       
	        panel.setBounds(0, 0, 1000, 680);
	        panel.setBackground(new Color(0,0,0,80));
	        panel.setForeground(Color.BLACK);
	        
	        title.setBounds(0, 0, 750, 120);
	        title.setBackground(new Color(255,255,255,100));
	        title.setForeground(Color.white);
	        title.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        dt.setBounds(0, 130, 750, 100);
	        dt.setBackground(new Color(255,255,255,100));
	        dt.setForeground(Color.white);
	        dt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        qty.setBounds(0, 230, 550, 100);
	        qty.setBackground(new Color(255,255,255,100));
	        qty.setForeground(Color.white);
	        qty.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        inc.setBounds(550, 230, 200, 100);
	        inc.setBackground(new Color(255,255,255,100));
	        inc.setForeground(Color.white);
	        inc.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        tbl.setBounds(0, 340, 750, 320);
	        tbl.setBackground(new Color(255,255,255,100));
	        tbl.setForeground(Color.white);
	        tbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        ttl.setBounds(750, 100, 234, 170);
	        ttl.setBackground(new Color(255,255,255,100));
	        ttl.setForeground(Color.white);
	        ttl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        itm.setBounds(750, 290, 234, 250);
	        itm.setBackground(new Color(255,255,255,100));
	        itm.setForeground(Color.white);
	        itm.setBorder(BorderFactory.createLineBorder(Color.black, 1));



	        background.setBounds(0, 0, 1000, 700);
	        
	        this.add(dt);
	        this.add(tbl);
	        this.add(itm);
	        this.add(ttl);
	        this.add(inc);
	        this.add(qty);
	        this.add(title);
	        this.add(panel);
	        this.add(background);
	        this.setLayout(null);
	        this.setVisible(true);
	        
	        
	}
}