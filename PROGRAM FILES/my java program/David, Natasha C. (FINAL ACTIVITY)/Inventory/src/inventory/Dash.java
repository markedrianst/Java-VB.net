package inventory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class Dash extends JFrame implements ActionListener {
	
	private JButton button;
	private JButton button1;
    private JLabel bg;

  void Dash() {
        this.setSize(400, 270);
        this.setTitle("Login");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Create an ImageIcon for the button
        ImageIcon imageIcon = new ImageIcon("inv55.png");
        Image image = imageIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        
        ImageIcon imageIcon1 = new ImageIcon("inv44.png");
        Image image1 = imageIcon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon1 = new ImageIcon(image1);

        // Create the button with the scaled image icon
        button = new JButton(scaledImageIcon);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(180, 20, 200, 200);
        button.setOpaque(false);
        button.setBorder(null);
        button.setBackground(Color.white);
        this.add(button);
        
        button1 = new JButton(scaledImageIcon1);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBounds(10, 10, 200, 200);
        button1.setOpaque(false);
        button1.setBorder(null);
        button1.setBackground(Color.white);
        this.add(button1);

       
        ImageIcon bgImageIcon = new ImageIcon("inv6.jpg");

     
        bg = new JLabel(bgImageIcon);
        bg.setBounds(0, 0, 400, 270);
        this.add(bg);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
       
            new inv();
            dispose();
        }
        
        if (e.getSource() == button1) {
            
            new pos();
            dispose();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dash());
    }
}