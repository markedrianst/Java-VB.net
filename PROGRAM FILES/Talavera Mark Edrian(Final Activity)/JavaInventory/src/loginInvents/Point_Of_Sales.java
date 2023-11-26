	package loginInvents;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
@SuppressWarnings("serial")
public class Point_Of_Sales extends JFrame implements ActionListener {
	ImageIcon img = new ImageIcon(new ImageIcon("bg.jpg").getImage().getScaledInstance(1040, 740, Image.SCALE_SMOOTH));
	JLabel background = new JLabel("", img, JLabel.CENTER);
	
	ImageIcon img2 = new ImageIcon(new ImageIcon("close.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	JLabel close = new JLabel("", img2, JLabel.CENTER);
    
    ImageIcon img3 = new ImageIcon(new ImageIcon("left-arrow.png").getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH));
	JLabel back = new JLabel("", img3, JLabel.CENTER);
	
//for Title----------------------------------------------------------------------------------------------------------
	JPanel title = new JPanel();
	JLabel Title=new JLabel("OMz Store", JLabel.CENTER);
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
	JLabel totals =new JLabel('\u20B1' +" "+"0.00",JLabel.CENTER);
//for Functions----------------------------------------------------------------------------------------------------------
	JPanel functions = new JPanel();
	JButton [] buttons = new JButton[5];
	String [] btns= {"New Transaction","Remove Item","Discount","Payment","Cancel"};
//for TABLE----------------------------------------------------------------------------------------------------------
	JPanel TablePanel = new JPanel();
	JDialog dialog = new JDialog();
	JButton addbutton =new JButton("ADD ITEM");
	JPanel TablePanel2 = new JPanel(new BorderLayout());
	JPanel TablePanel3 = new JPanel(new BorderLayout());
	JPanel tblPanel1 = new JPanel(new BorderLayout());
	JButton rmv = new JButton();
	String [] column1 = new String []{
			"Item Code","Item Name",
			"Price",
			"Size", "Quantity",
			"Total" ,	
			};
String [][] row1 = new String [][] {
	};
	String [] column = new String []{
			"Item Code","Item Name",
			"Item Description",
			"Price",
			"Size", "Stocks",
			"Re-Order Point" ,
			"Remarks"
			};
	//this will fill the info of the column of the table
	String [][] row = new String [][] {
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
	DefaultTableModel model = new DefaultTableModel(row, column);
	JTable table = new JTable(model);
	JScrollPane scroll = new JScrollPane(table);
	JTextField txtSearch = new JTextField();
	JLabel item = new JLabel("Search Item:");
	Vector <String> r = new Vector <String> ();
//table outside
	DefaultTableModel model1 = new DefaultTableModel(row1, column1);
	JTable table1 = new JTable(model1);
	JScrollPane scroll1 = new JScrollPane(table1);
	TableRowSorter<TableModel> sort1 = new TableRowSorter<>(table1.getModel());
	Vector <String> r1 = new Vector <String> ();
	double totalAmount = 0.0;
	
//discounts--------------------------------------------------------------
	ButtonGroup RadioGroup = new ButtonGroup();
	String[] rdtxt = {"Regular Customer (25%)", "Employee (15%)", "Student (3%)", "Senior/PWD (20%)"};
	JButton okbtn = new JButton("OK");
	JRadioButton [] rdBtn = new JRadioButton[rdtxt.length];
	JDialog discountdialogs=new JDialog();
	JPanel dizcountzpanel=new JPanel();
	 double discountRate = 0.0;
	 double discountAmount;
    // Calculate the discounted total
    double discountedTotal ;
//Payment--------------------------------------------------------------
    JLabel container=new JLabel();
 	int num1 =1;
	DecimalFormat decfor= new DecimalFormat("100000");
	 Point_Of_Sales(){
		this.setSize(1040, 740);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        background.setBounds(0, 0, 1040, 740);
        
        close.setBounds(1010,5,20,20);
		close.setFont(new Font("Cambria", Font.BOLD, 16));
		close.setForeground(Color.RED);
		close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {          
            	  int result = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to <br> close this program? </html>", "CONFIRM", JOptionPane.YES_NO_OPTION);
                  if (result == JOptionPane.YES_OPTION) {  
                	  dispose();
                      dialog.dispose();
                  }}});
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
		
		title.setBounds(10, 30, 1020, 120);
		title.setBackground(new Color(255,255,255,100));
		title.setForeground(Color.white);
		title.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
		Title.setBounds(0,20,1020,120);
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
			qttysrch[i].setBounds(y,300,200,40);
			qttysrch[i].setForeground(Color.BLACK);
			this.add(qttysrch[i]);
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
		Search.setEnabled(false);
		Search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub						
				JLabel SeachItems = new JLabel("Search Items:");
				if(quant.getText().isBlank()||quant.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Empty inputs./Please Fill The Quantity");	
				}
				else if(quant.getText().matches(".*([0-9]).*")) {	
				SeachItems.setBounds(20, 20, 250, 30);
				SeachItems.setForeground(Color.BLACK);
				SeachItems.setFont(new Font("Cambria", Font.BOLD, 20));
				addbutton.setBounds(670, 20, 100, 30);

				TablePanel2.setBounds(25, 60, 1000, 280);
				TablePanel2.add(scroll);
				TablePanel2.setLayout(null);
				
				TableRowSorter<TableModel> sort = new TableRowSorter<>(table.getModel());
				table.setRowSorter(sort);
				txtSearch.setBounds(150,20,500,30);
				txtSearch.getDocument().addDocumentListener(new DocumentListener() {
					@Override
					public void insertUpdate(DocumentEvent e) {
						String str = txtSearch.getText();
						if (str.trim().length() == 0) {
							sort.setRowFilter(null);
						} else {
							// (?i) means case insensitive search
							sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
						}
					}
						@Override
						public void removeUpdate(DocumentEvent e) {
							String str = txtSearch.getText();
							if (str.trim().length() == 0) {
								sort.setRowFilter(null);
				                	} else {
				                		sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
				                }	
				            }	
						@Override
						public void changedUpdate(DocumentEvent e) {
						}
				        	});
				dialog.setContentPane(new JPanel(new BorderLayout()));
				dialog.setLayout(null);
				dialog.add(SeachItems);
				dialog.add(TablePanel2);
				dialog.add(txtSearch);
				dialog.add(addbutton);
		
				dialog.pack();
				dialog.setSize(800, 400);
				dialog.setLocationRelativeTo(null);
				dialog.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
				dialog.setVisible(true);
							
			}else {
				JOptionPane.showMessageDialog(null," Quantity can't contain letters");	
			}}	
		});	
		addbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub		
				double newTotalAmount=0.0;
				int selected = table.getSelectedRow();
				if(selected == -1){
					JOptionPane.showMessageDialog(null, "Select row and try again.", "No row selected", JOptionPane.WARNING_MESSAGE);
				}
				else{
					try{
						
						String fours = table.getValueAt(selected,5).toString();
						String fives = quant.getText();
						
						  int numRowsToAdd = 3;
				            int addedRows = 0;		    
				            
		                    // Get the selected item data from the search table
		                    // String[] selectedItemData = new String[model2.getColumnCount()];
		                    for (int i : table.getSelectedRows()) {
		                    	String[] rowData = new String[model.getColumnCount()]; 
		                    	int rowDataIndex = 0;
		                    	
		                    	for (int row_i = 0; row_i < model.getColumnCount() - 1; row_i++) {
				                    if (row_i != 2) { 
				                        rowData[rowDataIndex] = model.getValueAt(i, row_i).toString();
				                        rowDataIndex++;
				                    }
				                }
		                    	
		                    	int enteredQuantity = Integer.parseInt(quant.getText());
				                int currentStock = Integer.parseInt(rowData[4]);
				                int updatedStock = currentStock - enteredQuantity;

				                model.setValueAt(String.valueOf(updatedStock), i, 5);

				                double price = Double.parseDouble(rowData[2]); 
				                double total = price * enteredQuantity;
				               rowData[rowData.length - 2] = quant.getText();
				               rowData[5] = String.valueOf(total);
				               rowData[4] = String.valueOf( quant.getText());

				                quant.setText("");
				                model1.addRow(rowData);
				                addedRows++;
				                totalAmount += total;
				                newTotalAmount=totalAmount;
				           
				                if (addedRows == numRowsToAdd) {
				                    break;
				                }
				                totals.setText(String.valueOf( '\u20B1' +" "+newTotalAmount));
					            container.setText(String.valueOf(newTotalAmount));  
		                    }
	         
		                    dialog.dispose();
						
						
						
						
						int intfours = Integer.parseInt(fours);
						int intfives = Integer.parseInt(fives);
						int inttotal =intfours-intfives ;

						JOptionPane.showMessageDialog(null, "Stocks Added");
						model.setValueAt(String.valueOf(inttotal), selected,5);
						String val = table.getValueAt(selected,6).toString();

						if(intfours>Integer.parseInt(val)){
							model.setValueAt("High Stock", selected,7);
						}
						else if(intfives == Integer.parseInt(val)){
							model.setValueAt("Low Stock", selected,7);
						}
						else if(intfives<Integer.parseInt(val)){
							model.setValueAt("Low Stock", selected,7);
						}

						table.getSelectionModel().clearSelection();
				          
		                }
					catch(Exception ems){
						JOptionPane.showMessageDialog(null, "Enter number on stocks. Please try again", "Input Error", JOptionPane.WARNING_MESSAGE);
						table.getSelectionModel().clearSelection();
						
						}
						}
			
				
				
				
				
				
				
				
				
				
			            
	
				
				
				
				
				
				
				
				
				
				
				
				/*double newTotalAmount = 0.0;
				   int selectedRow = table.getSelectedRow();
					int CONFIRM =JOptionPane.showConfirmDialog(null, "Are you sure you want to add this item?","Delete",JOptionPane.YES_NO_OPTION);
					if(CONFIRM ==JOptionPane.YES_OPTION) {
					
			        if (selectedRow != -1) {
			            int numRowsToAdd = 3;
			            int addedRows = 0;		    
			            
	                    // Get the selected item data from the search table
	                    // String[] selectedItemData = new String[model2.getColumnCount()];
	                    for (int i : table.getSelectedRows()) {
	                    	String[] rowData = new String[model.getColumnCount()]; 
	                    	int rowDataIndex = 0;
	                    	
	                    	for (int row_i = 0; row_i < model.getColumnCount() - 1; row_i++) {
			                    if (row_i != 2) { 
			                        rowData[rowDataIndex] = model.getValueAt(i, row_i).toString();
			                        rowDataIndex++;
			                    }
			                }
	                    	
	                    	int enteredQuantity = Integer.parseInt(quant.getText());
			                int currentStock = Integer.parseInt(rowData[4]);
			                int updatedStock = currentStock - enteredQuantity;

			                model.setValueAt(String.valueOf(updatedStock), i, 5);

			                double price = Double.parseDouble(rowData[2]); 
			                double total = price * enteredQuantity;
			               rowData[rowData.length - 2] = quant.getText();
			               rowData[5] = String.valueOf(total);
			               rowData[4] = String.valueOf( quant.getText());

			                quant.setText("");
			                model1.addRow(rowData);
			                addedRows++;
			                totalAmount += total;
			                newTotalAmount=totalAmount;
			           
			                if (addedRows == numRowsToAdd) {
			                    break;
			                }
			                totals.setText(String.valueOf( '\u20B1' +" "+newTotalAmount));
				            container.setText(String.valueOf(newTotalAmount));  
	                    }
         
	                    dialog.dispose();
	                }
					}*/
			
				 }
			 //updateTotal() ;
			
		});
			
//invoice--------------------------------------------------------------------------------------------------------------
        invoice.setBounds(550, 290, 210, 100);
        invoice.setBackground(new Color(255,255,255,100));
        invoice.setForeground(Color.white);
        invoice.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        inv.setBounds(10,10,200,30);
        inv.setFont(new Font("Arial", Font.BOLD, 20));
        inv.setForeground(Color.BLACK);
        
        defaults.setForeground(Color.WHITE);
        defaults.setBounds(560,340,200,30);
        defaults.setFont(new Font("Arial", Font.BOLD, 20));
        
        invoice.add(inv);
        invoice.setLayout(null);				
//total--------------------------------------------------------------------------------------------------------------        
        total.setBounds(770, 170, 260, 170);
        total.setBackground(new Color(255,255,255,100));
        total.setForeground(Color.white);
        total.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        tots.setBounds(10,20,260,30);
        tots.setForeground(Color.BLACK);
        tots.setFont(new Font("Arial", Font.BOLD, 30));
      //the settext------      
        totals.setBounds(770,250,260,30);
        totals.setForeground(Color.WHITE);
        totals.setFont(new Font("Arial", Font.BOLD, 40));
        total.setLayout(null);
        total.add(tots);
//Functions--------------------------------------------------------------------------------------------------------------        
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
			buttons[i].setEnabled(false);
			buttons[0].setEnabled(true);
			this.add(buttons[i]);
			//y += 30;
			x +=70;
		}
		 functions.setLayout(null);
		 
		 buttons[0].addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int confirm =JOptionPane.showConfirmDialog(null, "Open a new transaction?","confirmation!",JOptionPane.YES_NO_OPTION);
				if(confirm ==0) {
					
				for(int i = 0; i <= buttons.length-1 ; i++) {
					buttons[i].setEnabled(true);
					buttons[0].setEnabled(false);	
				}
				Search.setEnabled(true);
				
			}}});
//DISCOUNTS-----------------------------------------------------------------------------		 
		 buttons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int i = table1.getSelectedRow();
					if(!table1.isRowSelected(i)) {
						JOptionPane.showMessageDialog(null,"Select Row To Be Discounted", "Invalid ", JOptionPane.ERROR_MESSAGE);					
					}else {
											
		        if (dizcountzpanel.getComponentCount() == 0) {
		        	dizcountzpanel.setOpaque(true);
		        	dizcountzpanel.setBounds(0, 0, 350, 300);
		        	dizcountzpanel.setLayout(new GridLayout(0, 2, 0, 0));
		        	dizcountzpanel.setBackground(Color.white);
		        	dizcountzpanel.setForeground(Color.BLACK);

                    for (int a = 0; a < rdtxt.length; a++) {
                        rdBtn[a] = new JRadioButton(rdtxt[a]);
                        rdBtn[a].setFocusable(false);
                        rdBtn[a].setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        RadioGroup.add(rdBtn[a]);
                        dizcountzpanel.add(rdBtn[a]);
                    }
		        }
		        discountdialogs = new JDialog();
		        discountdialogs.setTitle("Discount");
		        discountdialogs.setSize(350, 300);
		        discountdialogs.setLocationRelativeTo(null);
		        discountdialogs.setLayout(null);
		        discountdialogs.getContentPane().setBackground(Color.white);
		        discountdialogs.getContentPane().add(dizcountzpanel);
			
		        okbtn.setBounds(110, 110, 60, 30);
		        okbtn.setFocusable(false);
		        okbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	 int selectedRowIndex = table1.getSelectedRow();
                	 double newTotalAmount = 0.0;
                	    if (rdBtn[2].isSelected()) {
                            discountRate = 0.03; 
                        } else if (rdBtn[3].isSelected()) { 
                            discountRate = 0.2; 
                        } else if (rdBtn[0].isSelected()) {
                            discountRate = 0.25; //
                        } else if (rdBtn[1].isSelected()) { 
                            discountRate = 0.15; 
                        }else {
            				JOptionPane.showMessageDialog(null,"Select Discounts", "Invalid ", JOptionPane.ERROR_MESSAGE);					
                        }

                    if (selectedRowIndex != -1) { 
                      double originalTotal = Double.parseDouble(table1.getValueAt(selectedRowIndex, 5).toString()); // Assuming the total column is at index 5
                      discountAmount = originalTotal * discountRate;

                      discountedTotal = originalTotal - discountAmount;
                
                      totalAmount -= (originalTotal - discountedTotal);
                      newTotalAmount=totalAmount;
                      totals.setText(String.valueOf('\u20B1' +" "+newTotalAmount));
                      container.setText(String.valueOf(newTotalAmount));
                      discountdialogs.dispose();
                    } else {
        				JOptionPane.showMessageDialog(null,"Select row first", "Invalid ", JOptionPane.ERROR_MESSAGE);					

                    }
                   
                }
            });

		       JScrollPane scrollPane = new JScrollPane(dizcountzpanel);
		       scrollPane.setBounds(0, 0, 350, 100);
		       scrollPane.setViewportView(dizcountzpanel); 
		       
		       JPanel contentPane = new JPanel();
		       contentPane.setLayout(null); 
		       contentPane.add(okbtn);
		       contentPane.add(scrollPane);
		       contentPane.setPreferredSize(new Dimension(300, 150));
		        
		       discountdialogs.setContentPane(contentPane);
		       discountdialogs.pack();
		       discountdialogs.setLocationRelativeTo(null);
		       discountdialogs.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
		       discountdialogs.setVisible(true);
			}}});
//Payments-----------------------------------------------------------------------------------------------------
		 buttons[3].addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
        	   if (table1.getRowCount() == 0) {
        		    JOptionPane.showMessageDialog(null, "Theres no Item to pay.");
        		} else {
        	   JDialog dialogpay = new JDialog();
        	   dialogpay.setTitle("Cash");
        	   dialogpay.setSize(300, 200);
        	   dialogpay.setLocationRelativeTo(null);
        	   dialogpay.setLayout(null);
    
        	   JTextField payements = new JTextField();
        	   payements.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        	   payements.setHorizontalAlignment(JTextField.CENTER);
        	   payements.setBounds(70, 50, 150, 30);
            	
        	   JLabel paymentlbl = new JLabel("Payment:");
        	   paymentlbl.setFont(new Font("Cambria", Font.BOLD, 20));
        	   paymentlbl.setBounds(70, 20, 150, 30);
        	   
        	   JButton okaybtn = new JButton("OK");
        	   JButton cancel = new JButton("Cancel");
        	   okaybtn.setBounds(145, 90, 70, 30);
        	   cancel.setBackground(Color.white);
        	   cancel.setFont(new Font("Cambria", Font.PLAIN, 12));
        	   cancel.setFocusable(false);
        	   cancel.addActionListener(new ActionListener() {
        		 @Override
            		public void actionPerformed(ActionEvent e) {
            			// TODO: Implement cancel button functionality
            			int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
            			if (option == JOptionPane.YES_OPTION) {
            				dialogpay.dispose();
            			}
            		}	
	                	});		 
        	   cancel.setBounds(70, 90, 70, 30);
        	   okaybtn.setBackground(Color.white);
        	   okaybtn.setForeground(Color.BLACK);
	           okaybtn.setFont(new Font("Cambria", Font.PLAIN, 12));
	           okaybtn.setFocusable(false);
	           okaybtn.addActionListener(new ActionListener() {
	            @Override
	             public void actionPerformed(ActionEvent e) {
	            	String paymentText = payements.getText();
	            	if (paymentText.isEmpty()) {
	            		JOptionPane.showMessageDialog(dialogpay, "Please enter the payment amount.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	            			 
	            } else {
	            	try {
	            double paymentAmount = Double.parseDouble(paymentText);
	            double TotalAmount = Double.parseDouble(container.getText());
	            
	            if (paymentAmount < TotalAmount) {
	            	JOptionPane.showMessageDialog(dialogpay, "Insufficient payment amount.", "Invalid Payment", JOptionPane.ERROR_MESSAGE);
	            } else {
	            	double changeAmount = paymentAmount - TotalAmount;
	            	JDialog dialogreceipt = new JDialog();
	            	dialogreceipt.setBounds(0, 0, 460, 550);
	            	dialogreceipt.setLocationRelativeTo(null);
	            	dialogreceipt.setLayout(null);
	            	
	            	JPanel panelok = new JPanel();
	            	panelok.setBounds(0, 0, 460, 550);
	            	panelok.setBackground(Color.white);
	            	panelok.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	            	panelok.setLayout(null);
	            					 
	            	JButton Paymentbtn=new JButton();
	            	Paymentbtn.setBounds(185, 480, 60, 20);
	            	Paymentbtn.setText("Print");
	            	Paymentbtn.setForeground(Color.white);
	            	Paymentbtn.setFocusable(false);
	            	Paymentbtn.setFont(new Font("Arial", Font.PLAIN, 12));
	            	Paymentbtn.setBackground(Color.decode("#205072"));
	            	Paymentbtn.addActionListener(new ActionListener() {
	            		@Override
	            		public void actionPerformed(ActionEvent e) {
	            			dialogreceipt.dispose();
	            			dialogpay.dispose();
	            			for(int i = 0; i <= buttons.length-1 ; i++) {
	        					buttons[i].setEnabled(false);
	        					buttons[0].setEnabled(true);
	        					
	        				}
	        				
	        		
	            			
	            			// Clear the data from table1
	            			DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
	            			while (model1.getRowCount() > 0) {
	            				model1.removeRow(0);
	            			}	
	            			totalAmount -= TotalAmount;

	            			table.removeAll();
	            			totals.setText('\u20B1' +" "+" 0.00");		                    
	            			defaults.setText(decfor.format(num1));		
	            			num1 ++; 
	            		}
	            	});
                
	            	dialogreceipt.add(Paymentbtn);
	            	
	            	JLabel rpt = new JLabel("OMz Store",JLabel.CENTER);
	            	rpt.setBounds(0, 20, 400, 40);
	            	rpt.setFont(new Font("Bell MT", Font.BOLD, 28));
	            	panelok.add(rpt);
	            	
	            	JLabel purchase = new JLabel("Thank you for purchasing");
	            	purchase.setBounds(150, 435, 250, 40);
	            	purchase.setFont(new Font("Arial", Font.PLAIN, 12));
	            	panelok.add(purchase);
	      
	            	JLabel dash = new JLabel("============================================");
	            	dash.setBounds(30, 50, 460, 40);
	            	dash.setFont(new Font("Bell MT", Font.BOLD, 14));
	            	panelok.add(dash);
               
	            	JLabel dash2 = new JLabel("============================================");
	            	dash2.setBounds(30, 300, 460, 40);
	            	dash2.setFont(new Font("Bell MT", Font.BOLD, 14));
	            	panelok.add(dash2);
	                	                
	            	JLabel dash3 = new JLabel("============================================");
	            	dash3.setBounds(30, 410, 460, 40);
	            	dash3.setFont(new Font("Bell MT", Font.BOLD, 14));
	            	panelok.add(dash3);

	            	JLabel dash1 = new JLabel("============================================");
	            	dash1.setBounds(30, 100, 460, 40);
	            	dash1.setFont(new Font("Bell MT", Font.BOLD, 14));
	            	panelok.add(dash1);
	            	
	            	JLabel code = new JLabel("Order Receipt");
	            	code.setBounds(130, 75, 250, 40);
	            	code.setFont(new Font("Bell MT", Font.BOLD, 30));
	            	panelok.add(code);
	            	
	            	JScrollPane scrollPane = new JScrollPane();
	            	scrollPane.setBounds(0, 140, 460, 160);
	            	scrollPane.setBorder(null);
	            	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	            	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            
	            	JPanel contentPane = new JPanel();
	            	contentPane.setLayout(null);
 	               
	            	String[] items = {"Code", "Name", "Price", "Size", "Qty", "Total"};
	            	int y = 30;
	            	for (String item : items) {
	            		JLabel label = new JLabel(item);
	            		label.setBounds(y, 10, 100, 30);
	            		label.setFont(new Font("Arial", Font.PLAIN, 12));
	            		contentPane.add(label);
	            		y += 70;
	            	}
	            	int rowCount = table1.getRowCount();
	            	int columnCount = table1.getColumnCount();
	            	int numRowsToAdd = 6;
	            	int addedRows = 0;
	            	
	            	for (int row = 0; row < rowCount; row++) {
	            		for (int column = 0; column < columnCount; column++) {
	            			Object value = table1.getValueAt(row, column);
	            			JLabel valueLabel = new JLabel(value.toString());
	            			valueLabel.setBounds(28 + column * 70, 10 + (row + 1) * 30, 140, 30);
	            			valueLabel.setFont(new Font("Arial", Font.PLAIN, 13));
	            			contentPane.add(valueLabel);
	            			
	            			addedRows++;

	            			if (addedRows == numRowsToAdd) {
	            				break; 
	            			}
	            		}
	            	}
	            	contentPane.setPreferredSize(new Dimension(460, rowCount * 30 + 40));                
	            	scrollPane.setViewportView(contentPane);

	            	JLabel pc1 = new JLabel("Total:                " + "............................................  "+ totalAmount);
	            	pc1.setBounds(40, 330, 460, 40);
	            	pc1.setFont(new Font("Arial", Font.BOLD, 13));
	            	panelok.add(pc1);

	            	JLabel pc2 = new JLabel("Discount:               " + "........................................  "+ discountAmount);
	            	pc2.setBounds(60, 350, 460, 40);
	            	pc2.setFont(new Font("Arial", Font.PLAIN, 13));
	            	panelok.add(pc2);

	            	JLabel pc3 = new JLabel("Payment:               " + "........................................  "+ paymentAmount);
	            	pc3.setBounds(60, 370, 460, 40);
	            	pc3.setFont(new Font("Arial", Font.PLAIN, 13));
	            	panelok.add(pc3);
	            	
	            	JLabel pc4 = new JLabel("Change:                 " + "........................................  "+ changeAmount);
	            	pc4.setBounds(60, 390, 460, 40);
	            	pc4.setFont(new Font("Arial", Font.PLAIN, 13 ));
	            	panelok.add(pc4);
   	                
	            	dialogreceipt.add(scrollPane);
	            	
	            	dialogreceipt.add(panelok);
	            	dialogreceipt.setVisible(true); 
	            }
	            
	            	} catch (NumberFormatException ex) {
	            		JOptionPane.showMessageDialog(dialogpay, "Invalid payment amount. Please enter a valid number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	            	}
	            }
	            }
	            
	           });
	      dialogpay.add(payements);
	      dialogpay.add(paymentlbl);
	      dialogpay.add(cancel); 
	      dialogpay.add(okaybtn);
	      dialogpay.setVisible(true); 
	      
            }}
      });
		
//TABELS--------------------------------------------------------------------------------------------------------
		 TablePanel.setBounds(10, 410, 750, 320);
		  TablePanel.setBackground(new Color(255,255,255,100));
		  TablePanel.setForeground(Color.white);
		  TablePanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));   
	      
		  TablePanel3.setBounds(15, 415, 740, 280);
		  TablePanel3.setBackground(Color.white);
		  TablePanel3.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));  
		  TablePanel3.add(scroll);
		  TablePanel3.setVisible(false);
		  

		  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		  centerRenderer.setHorizontalAlignment(JLabel.CENTER);

		  for (int i = 0; i < table1.getColumnCount(); i++) {
			  table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		  }
			
		  DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
		  centerRenderer1.setHorizontalAlignment(JLabel.CENTER);
		  
		  for (int i = 0; i < table.getColumnCount(); i++) {
			  table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer1);
		  }

		  table.getTableHeader().setEnabled(false);
		  table.setDefaultEditor(Object.class, null);
	        
		  table1.getTableHeader().setEnabled(false);
		  table1.setDefaultEditor(Object.class, null);
		  
		  tblPanel1.setBounds(15, 415, 740, 310);
		  tblPanel1.setBackground(Color.white);
		  tblPanel1.add(scroll1);
		  
		this.add(back);
		this.add(close);
		
		
		this.add(Title);
		this.add(title);
		
		this.add(dateAndTime);
		this.add(dateAndTime1);
		
		this.add(quantity);
		this.add(Search);
		this.add(quant);
		
		this.add(invoice);
		this.add(defaults);
		this.add(total);
		this.add(totals);
		this.add(functions);
		
		this.add(container);
		container.setBounds(10,10,10,10);
		container.setVisible(false);
		this.add(TablePanel3);
		this.add(tblPanel1);
		this.add(TablePanel);
		this.add(background);
        this.setLayout(null);
        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double newTotalAmount = 0.0;
		int x = table1.getSelectedRow();
		
		if(e.getSource()==buttons[1]) {  
            int selectedRow = table1.getSelectedRow();
            if (selectedRow >= 0) {
            	int Confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + table1.getValueAt(selectedRow, 1), "Delete Item", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            	if (Confirm == JOptionPane.YES_OPTION) {
            		double deletedTotal = Double.parseDouble(table1.getValueAt(x, 5).toString()); 
            		totalAmount -= deletedTotal;
            		newTotalAmount=totalAmount;                 
            		totals.setText(String.valueOf('\u20B1' +" "+newTotalAmount));            		
                    String itemname = (String) table1.getValueAt(selectedRow, 0);                    
                    // Add back the deducted stock to the inventory table
                    DefaultTableModel inventoryModel = (DefaultTableModel) table.getModel();
                    int inventoryRowIndex = -1;
                    for (int i = 0; i < inventoryModel.getRowCount(); i++) {
                    	if (inventoryModel.getValueAt(i, 0).equals(itemname)) {
                    		inventoryRowIndex = i;
                    		break;
                    	}
                    }
                    if (inventoryRowIndex >= 0) {
                    	int deductedStock = Integer.parseInt((String) table1.getValueAt(selectedRow, 4));
                    	int currentStock = Integer.parseInt(inventoryModel.getValueAt(inventoryRowIndex, 5).toString());
	                    inventoryModel.setValueAt(Integer.toString(currentStock + deductedStock), inventoryRowIndex, 5);
                        
                        if (Long.parseLong(inventoryModel.getValueAt(inventoryRowIndex, 5).toString()) > Long.parseLong(inventoryModel.getValueAt(inventoryRowIndex, 6).toString())) {
                        	inventoryModel.setValueAt("High Stock", inventoryRowIndex, 7);
                        } else {
                        	inventoryModel.setValueAt("Low Stock", inventoryRowIndex, 7);
                        }
                    }
                    // Remove the selected row from the POS table
                    DefaultTableModel POSdef = (DefaultTableModel) table1.getModel();
                    POSdef.removeRow(selectedRow);
            	}
            } else {
            	JOptionPane.showMessageDialog(null, "Choose an item to remove", "Choose Item", JOptionPane.WARNING_MESSAGE);
            }					                    			                     
           
           
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	if(e.getSource()==buttons[7]) {
			if(!table1.isRowSelected(i)) {
				JOptionPane.showMessageDialog(null,"Select Row First", "Invalid ", JOptionPane.ERROR_MESSAGE);					
			}else  {
				int remove =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete",JOptionPane.YES_NO_OPTION);
				if(remove ==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null,"Item Successfully Deleted");									                    			                     
                    double deletedTotal = Double.parseDouble(table1.getValueAt(i, 5).toString()); 
                    double deletedTotal1 = (int)Double.parseDouble(table1.getValueAt(i, 4).toString()); 
                    model1.removeRow(i);
                    totalAmount -= deletedTotal;
                    newTotalAmount=totalAmount;                 
                    totals.setText(String.valueOf('\u20B1' +" "+newTotalAmount));
                  
                    int selected = table.getSelectedRow();
                	String fours = table.getValueAt(selected,5).toString();
	
					int intfours = Integer.parseInt(fours);		
					int inttotal = (int) (deletedTotal1 + intfours);	
					model.setValueAt(String.valueOf(inttotal), selected,5);
				
				}
				}
			}*/
//cancel Button-------------------------------------------------------------------------------------------------
		if(e.getSource()==buttons[4])	{
			int Conf = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel and clear the list?", "Cancel Order", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (Conf == JOptionPane.YES_OPTION) {
            	// Loop through all rows in POS table
			
	            	// Loop through all rows in POS table
	            	for (int i = 0; i < model1.getRowCount(); i++) {
	            	    // Get the ID of the item in the selected row
	            	    String ID = (String) model1.getValueAt(i, 0);
	            	    
	            	    // Add back the deducted stock to the inventory table
	            	    DefaultTableModel invModel = (DefaultTableModel) table.getModel();
	            	    int invRowIndex = -1;
	            	    for (int j = 0; j < invModel.getRowCount(); j++) {
	            	        if (invModel.getValueAt(j, 0).equals(ID)) {
	            	            invRowIndex = j;
	            	            break;
	            	        }
	            	    }

	            	    if (invRowIndex >= 0) {
	            	        int deductedStock = Integer.parseInt((String) model1.getValueAt(i, 4));
	            	        int currentStock = Integer.parseInt(invModel.getValueAt(invRowIndex, 5).toString());
	            	        invModel.setValueAt(Integer.toString(currentStock + deductedStock), invRowIndex, 5);

	            	        if (Long.parseLong(invModel.getValueAt(invRowIndex, 5).toString()) > Long.parseLong(invModel.getValueAt(invRowIndex, 6).toString())) {
	            	            invModel.setValueAt("High Stock", invRowIndex, 7);
	            	        } else {
	            	            invModel.setValueAt("Low Stock", invRowIndex, 7);
	            	        }

	            	    }

	            	}

	            	// Remove all rows from POS table
	            	totals.setText('\u20B1' +" "+"0.00");
					model1.setRowCount(0);
	            	
				}
            }
//Discount Button-------------------------------------------------------------------------------------------------
	
	}
}

	

		
	



