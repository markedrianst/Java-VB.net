package loginInvents;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


@SuppressWarnings("serial")
public class PointOfSales extends JFrame implements ActionListener{
	
	ImageIcon img = new ImageIcon(new ImageIcon("bg.jpg").getImage().getScaledInstance(1040, 740, Image.SCALE_SMOOTH));
	JLabel background = new JLabel("", img, JLabel.CENTER);
//dialog properties------------------------------------------------------------------------------------	 
	JDialog dialog = new JDialog();
	
	JLabel [] lblsearch = new JLabel[1];
	JTextField [] txtSearch = new JTextField[1];
	JButton addbutton =new JButton("ADD ITEM");
//tableProperties--------------------------------------------------------------------------------------------------------------
	String [] column1 = new String [] {"Item Code","Item Name ","Item Description","Price","Size", "Stocks.","Re-Order Point" ,	"Remarks"};			
	String [][] row1 = new String [][] {
		{"00001", "Palmolive", "Shampoo","7.00", "10 ml","50","30","High Stock"},
		{"00002", "Creamsilk", "Shampoo","7.00", "10 ml","50","30","High Stock"},
		{"00003", "Sanicare", "Cleaning Wipes","50.00", "50 sheets","60","30","High Stock"},
		{"00004", "Datu Puti", "Soy Sauce","20.00", "200 ml","40","30","High Stock"},
		{"00005", "Colgate", "Toothbrush","20.00", "18 grams","50","30","High Stock"},
		{"00006", "Colgate", "Toothpaste","80.00", "150 grams","50","30","High Stock"},
		{"00007", "Joy", "Dishwashing Liquid","12.00", "18.5 ml","50","30","High Stock"},
		{"00008", "Century", "Canned Goods","78.2", "5.3 oz","50","30","High Stock"},
		{"00009", "Shyflakes", "Biscuit","55.6", "22 grams","50","30","High Stock"},
		{"00010", "Kopiko", "3 in 1","12.00", "7 grams","40","30","High Stock"},	
	};
//Parts Of Table---------------------------------------------------------------------------------------------------------------
	DefaultTableModel model1 = new DefaultTableModel(row1, column1);
	JTable table1 = new JTable(model1);
	JScrollPane scroll1 = new JScrollPane(table1);
	Vector <String> r1 = new Vector <String> ();	
	JPanel tblPanel1 = new JPanel(new BorderLayout());
	
	JPanel tblPanel = new JPanel(new BorderLayout());

//for Title----------------------------------------------------------------------------------------------------------
	JPanel title = new JPanel();
	JLabel Title=new JLabel("Tindahan Ni Aling Bebang", JLabel.CENTER);
//for 2ndPanel----------------------------------------------------------------------------------------------------------
	JPanel quantity = new JPanel();
	JLabel [] qttysrch= new JLabel[2];
	String[] labels= {"Quantity","Search"};
	JTextField quant =new JTextField();
	JButton Search =new JButton("Search");
//for Date And Time ----------------------------------------------------------------------------------------------------------
	JPanel dateAndTime = new JPanel();
	JPanel dateAndTime1 = new JPanel();
	JLabel time =new JLabel("Time : ", JLabel.CENTER);
	JLabel date =new JLabel("Date : ", JLabel.CENTER);
	JLabel timeLabel =new JLabel();
	JLabel dateLabel =new JLabel();
//for invoice----------------------------------------------------------------------------------------------------------
	JPanel invoice = new JPanel();
	JLabel inv =new JLabel("Invoice No : ");
	JLabel defaults =new JLabel("1000000",JLabel.CENTER);
//for total----------------------------------------------------------------------------------------------------------
	JPanel total = new JPanel();
	JLabel tots =new JLabel("Total Amount : ");
	JLabel totals =new JLabel("0.00",JLabel.CENTER);
//for Functions----------------------------------------------------------------------------------------------------------
	JPanel functions = new JPanel();
	JButton [] buttons = new JButton[5];
	String [] btns= {"New Transaction","Remove Item","Discount","Payment","Cancel"};
//for TABLE----------------------------------------------------------------------------------------------------------
	JPanel tableP = new JPanel();
	
	
	String [] column = new String [] {"Item Code","Item Name","Price","Size","Quantity","Total"};			
	String [][] row = new String [][]{};
	
	DefaultTableModel model = new DefaultTableModel(row, column);
	JTable table = new JTable(model);
	JScrollPane scroll = new JScrollPane(table);
	Vector <String> r = new Vector <String> ();	
		
	ImageIcon img2 = new ImageIcon(new ImageIcon("close.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	JLabel close = new JLabel("", img2, JLabel.CENTER);
    
    ImageIcon img3 = new ImageIcon(new ImageIcon("left-arrow.png").getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH));
	JLabel back = new JLabel("", img3, JLabel.CENTER);

		void PointOfSales(){
			this.setSize(1040, 740);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setUndecorated(true);
	        this.setLocationRelativeTo(null);

			back.setBounds(5,2,30,20);
			back.setFont(new Font("Cambria", Font.BOLD, 16));
			back.setForeground(Color.RED);
			back.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {          
	            	  int result = JOptionPane.showConfirmDialog(null, "Back to DashBoard?","CONFIRM", JOptionPane.YES_NO_OPTION);
	                  if (result == JOptionPane.YES_OPTION) {  
	                	  Dashboard sub =new Dashboard();
	                	  sub.Dashboard();
	                	  dialog.dispose();
	                	  dispose();
	                  }}});
			
	    	close.setBounds(1010,5,20,20);
			close.setFont(new Font("Cambria", Font.BOLD, 16));
			close.setForeground(Color.RED);
			close.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {          
	            	  int result = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to <br> close this program? </html>", "CONFIRM", JOptionPane.YES_NO_OPTION);
	                  if (result == JOptionPane.YES_OPTION) {  
	                      Component component = (Component) e.getSource();
	                      Window window = SwingUtilities.getWindowAncestor(component);
	                      window.dispose();
	                      dialog.dispose();
	                  }}});
			
	        title.setBounds(10, 30, 1020, 120);
	        title.setBackground(new Color(255,255,255,100));
	        title.setForeground(Color.white);
	        title.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	  
	        Title.setBounds(0,0,1020,120);
	        Title.setFont(new Font("Cambria", Font.BOLD, 60));
	        title.add(Title);
	        title.setLayout(null);
	        
//DATE AND TIME----------------------------------------------------------------------------------------------------	        
	        dateAndTime1.setBounds(10, 170, 750, 100);
	        dateAndTime1.setBackground(new Color(255,255,255,100));
	        dateAndTime1.setForeground(Color.white);
	        dateAndTime1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	      
	        time.setBounds(530,10,100,30);
	        time.setFont(new Font("Arial", Font.BOLD, 24));
	        time.setForeground(Color.BLACK);
	        date.setForeground(Color.BLACK);
	        date.setBounds(50,10,100,30);
	        date.setFont(new Font("Arial", Font.BOLD, 24));
	        
	        dateAndTime1.add(date);
	        dateAndTime1.add(time);
	        dateAndTime1.setLayout(null);
	        
	        dateAndTime.setBounds(10, 170, 750, 100);
	        dateAndTime.setBackground(new Color(255,255,255,100));
	        dateAndTime.setForeground(Color.white);
	        dateAndTime.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        dateAndTime.setLayout(new FlowLayout());
	        
	        timeLabel.setBounds(550,50,400,50);
	        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        timeLabel.setForeground(Color.WHITE);
	        dateLabel.setForeground(Color.WHITE);
	        dateLabel.setBounds(60,50,400,50);
	        dateLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        
	        Thread updateTimeThread = new Thread(() -> {
	            while (true) {
	                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a", Locale.ENGLISH);
	                SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.ENGLISH);

	                String formattedTime = timeFormat.format(new Date());
	                String formattedDate = dateFormat.format(new Date());

	                SwingUtilities.invokeLater(() -> {
	                    timeLabel.setText(formattedTime);
	                    dateLabel.setText(formattedDate);
	                });

	                try {
	                    Thread.sleep(1000); // Delay for 1 second
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        updateTimeThread.start();
	        
	        dateAndTime.add(dateLabel);
	        dateAndTime.add(timeLabel);
	        dateAndTime.setOpaque(false);
	        dateAndTime.setLayout(null);
//Quantity Search------------------------------------------------------------------------------------------------	       
	        quantity.setBounds(10, 290, 530, 100);
	        quantity.setBackground(new Color(255,255,255,100));
	        quantity.setForeground(Color.white);
	        quantity.setBorder(BorderFactory.createLineBorder(Color.black, 1));	        
	       
	        int y=70;
			for(int i=0; i<=qttysrch.length-1;i++) {
				qttysrch[i] = new JLabel();
				qttysrch[i].setText(labels[i]);
				qttysrch[i].setFont(new Font("Arial", Font.BOLD, 20));
				qttysrch[i].setBounds(y,10,200,40);
				qttysrch[i].setForeground(Color.BLACK);
				quantity.add(qttysrch[i]);
				y =+ 370;
			}
			
			quant.setBounds(70,350,100,30);
			quant.setHorizontalAlignment(JTextField.CENTER);
			quant.setForeground(Color.WHITE);
			quant.setBackground(Color.WHITE);
			quant.setFont(new Font("Arial", Font.BOLD, 20));
			quant.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
			quant.setOpaque(false);
			
			Search.setBounds(370,340,100,40);
			Search.setFocusable(false);
			Search.setOpaque(false);
			Search.setFont(new Font("Arial", Font.BOLD, 20));
			Search.setForeground(Color.WHITE);
			Search.setBackground(Color.BLACK);
			Search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(quant.getText().isBlank()||quant.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Empty inputs./Please Fill The Quantity");	
				}
				else if(quant.getText().matches(".*([0-9]).*")) {					
					
				SwingUtilities.invokeLater(() -> {
					dialog.setTitle("Inventory");
					dialog.setSize(1000, 400);
					dialog.setLocationRelativeTo(null);
					dialog.setLayout(null);
				          //  dialog.setUndecorated(true);
				          //  background1.setBounds(0,0,1000,400);

					table1.getTableHeader().setEnabled(false);
					DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
					centerRenderer.setHorizontalAlignment(JLabel.CENTER);

					for(int i = 0; i < column1.length; i++) {
						table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
					}		
					TableColumnModel tmtblProducts = table1.getColumnModel();
					tmtblProducts.getColumn(0).setPreferredWidth(150);
					tmtblProducts.getColumn(1).setPreferredWidth(190);
					tmtblProducts.getColumn(2).setPreferredWidth(190);
					tmtblProducts.getColumn(3).setPreferredWidth(100);
					tmtblProducts.getColumn(4).setPreferredWidth(100);
					tmtblProducts.getColumn(5).setPreferredWidth(110);
					table1.setDefaultEditor(Object.class, null);		
					table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
						@Override
						public void valueChanged(ListSelectionEvent e) {
							// TODO Auto-generated method stub
							int row1 = table1.getSelectedRow();
							if(row1 == -1){													
							}}});
					tblPanel1.setBounds(25, 60, 940, 280);
					tblPanel1.setBackground(new Color (255,255,255,50));
					tblPanel1.add(scroll1);
							
					JPanel borderpn=new JPanel();
					borderpn.setBounds(15, 50, 960, 300);
					borderpn.setBackground(new Color (255,255,255,50));
					borderpn.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));
							//this will add a function to filter the items in a table							
					for(int i = 0; i <= lblsearch.length-1; i++) {
						txtSearch[i] = new JTextField();
						txtSearch[i].setBounds(260,10,500,30);
						txtSearch[i].setForeground(Color.BLACK);
						txtSearch[i].setFont(new Font("Cambria", Font.BOLD, 15));
						dialog.add(txtSearch[i]);
								
						lblsearch[i] = new JLabel();
						lblsearch[i].setText("Search");
						lblsearch[i].setForeground(Color.BLACK);
						lblsearch[i].setFont(new Font("Cambria", Font.BOLD, 40));
						lblsearch[i].setBounds(100, 0, 150, 40);
						dialog.add(lblsearch[i]);	
					}						
					TableRowSorter<TableModel> sort = new TableRowSorter<>(table1.getModel());
					table1.setRowSorter(sort);
					txtSearch[0].getDocument().addDocumentListener(new DocumentListener()
					{
				@Override
				public void insertUpdate(DocumentEvent e) {
					String str = txtSearch[0].getText();
					if (str.trim().length() == 0) {
						sort.setRowFilter(null);
					} else {
						//(?i) means case insensitive search
						sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
					}
				}
				@Override
				public void removeUpdate(DocumentEvent e) {
					String str = txtSearch[0].getText();
					if (str.trim().length() == 0) {
						sort.setRowFilter(null);
					} else {
						sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
					}}
				@Override
				public void changedUpdate(DocumentEvent e) {}
					});		
							
					addbutton.setBounds(780,10,100,30);
					addbutton.setFocusable(false);
					addbutton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub									
							
						}});
							
					// Make the dialog visible
					dialog.add(addbutton);
					dialog.add(tblPanel1);
					dialog.add(borderpn);
					//dialog.add(background1);
					dialog.setVisible(true);
				});
			}else {
				JOptionPane.showMessageDialog(null,"Quantity contains only number.");
			}
				
			}});
			
			this.add(Search);
			this.add(quant);
			quantity.setLayout(null);
		
//invoice--------------------------------------------------------------------------------------------------------------
	        invoice.setBounds(550, 290, 210, 100);
	        invoice.setBackground(new Color(255,255,255,100));
	        invoice.setForeground(Color.white);
	        invoice.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        inv.setBounds(10,10,200,30);
	        inv.setFont(new Font("Arial", Font.BOLD, 20));
	        inv.setForeground(Color.BLACK);
	        defaults.setForeground(Color.WHITE);
	        defaults.setBounds(10,50,200,30);
	        defaults.setFont(new Font("Arial", Font.BOLD, 20));
	        invoice.add(defaults);
	        invoice.add(inv);
	        invoice.setLayout(null);
//table--------------------------------------------------------------------------------------------------------------
	        tableP.setBounds(10, 410, 750, 320);
	        tableP.setBackground(new Color(255,255,255,100));
	        tableP.setForeground(Color.white);
	        tableP.setBorder(BorderFactory.createLineBorder(Color.black, 1));   
	        
			table.getTableHeader().setEnabled(false);
			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(JLabel.CENTER);

			for(int i = 0; i < column.length; i++) {
				table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			}		
			TableColumnModel tmtblProducts = table.getColumnModel();
			tmtblProducts.getColumn(0).setPreferredWidth(150);
			tmtblProducts.getColumn(1).setPreferredWidth(190);
			tmtblProducts.getColumn(2).setPreferredWidth(190);
			tmtblProducts.getColumn(3).setPreferredWidth(100);
			tmtblProducts.getColumn(4).setPreferredWidth(100);
			tmtblProducts.getColumn(5).setPreferredWidth(110);
			table.setDefaultEditor(Object.class, null);		
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
				int rows = table.getSelectedRow();
				if(rows == -1){				
				}
		
											
			}	
			});
			
			tblPanel.setBounds(15, 415, 740, 310);
			tblPanel.setBackground(new Color (255,255,255,100));
			tblPanel.add(scroll);

//total--------------------------------------------------------------------------------------------------------------        
	        total.setBounds(770, 170, 260, 170);
	        total.setBackground(new Color(255,255,255,100));
	        total.setForeground(Color.white);
	        total.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        tots.setBounds(10,10,260,30);
	        tots.setForeground(Color.BLACK);
	        tots.setFont(new Font("Arial", Font.BOLD, 30));
	            
	        totals.setBounds(0,90,260,30);
	        totals.setForeground(Color.WHITE);
	        totals.setFont(new Font("Arial", Font.BOLD, 40));
	        total.setLayout(null);
	        total.add(tots);
	        total.add(totals);
	        
//total--------------------------------------------------------------------------------------------------------------        
	        
	        functions.setBounds(770, 360, 260, 370);
	        functions.setBackground(new Color(255,255,255,100));
	        functions.setForeground(Color.white);
	        functions.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        int x=380;
			for(int i = 0; i <= buttons.length-1 ; i++) {
				buttons[i] = new JButton();
				buttons[i].setText(btns[i]);
				buttons[i].setBounds( 780,x, 240, 50);
				buttons[i].setFocusable(false);
				buttons[i].setOpaque(false);
				buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
				buttons[i].setForeground(Color.WHITE);
				buttons[i].setBackground(Color.BLACK);
				buttons[i].addActionListener(this);
				this.add(buttons[i]);
				//y += 30;
				x +=70;
			}
	        
			 functions.setLayout(null);

	        background.setBounds(0, 0, 1040, 740);
	    	
	        this.add(back);
	        this.add(close);
	        this.add(tblPanel);
	        this.add(dateAndTime);
	        this.add(dateAndTime1);
	        this.add(quantity);
	        this.add(tableP);
	        this.add(functions);
	        this.add(total);
	        this.add(invoice);
	        this.add(title);
	        this.add(background);
	        this.setLayout(null);
	        this.setVisible(true);
	
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//Remove Buttton-------------------------------------------------------------------------------------------------
			int i = table.getSelectedRow();
			if(e.getSource()==buttons[1]) {
				if(!table.isRowSelected(i)) {
					JOptionPane.showMessageDialog(null,"Select Row First", "Invalid ", JOptionPane.ERROR_MESSAGE);					
				}else {
					int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete",JOptionPane.YES_NO_OPTION);
					if(cancels ==JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null,"Item Successfully Deleted");									                    			                     
						if(table.isRowSelected(i)) {										
							model.removeRow(table.getSelectedRow());																	
						}}}}
			
//cancel Buttton-------------------------------------------------------------------------------------------------
			if(e.getSource()==buttons[4])	{
				int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all the data?","Cancel",JOptionPane.YES_NO_OPTION);
				if(cancels ==0) {
					JOptionPane.showMessageDialog(null,"this will remove all the data you input");	
		    		}}

			
		}
}


