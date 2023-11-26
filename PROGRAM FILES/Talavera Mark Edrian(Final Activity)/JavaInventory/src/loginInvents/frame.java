package loginInvents;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Vector;
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
public class frame extends JFrame implements ActionListener{
	
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
	JDialog dialog = new JDialog();
	JDialog dialogdt = new JDialog();
	JButton srch = new JButton("Search");
	JButton cl = new JButton("Cancel");
	JPanel panel2 = new JPanel(new BorderLayout());
	JPanel paneldt = new JPanel();
	JButton aitem = new JButton("add item:");
	JButton dsc = new JButton("Discount:");
	JTextField qtyfield = new JTextField();
	JTextField amnt = new JTextField();
	JLabel amnt1 = new JLabel();
	 JLabel stem = new JLabel("Search Items:");
	 JLabel kkop = new JLabel("KKOPI DAYTS");
	 JLabel QTY = new JLabel("Quantity:");
	 ButtonGroup rdGroup = new ButtonGroup();
	 String[] rdtxt = {"Regular Customer (25%)", "Employee (15%)", "Student (3%)", "Senior/PWD (20%)"};
	 JButton ok = new JButton("OK");
		JRadioButton [] rdBtn = new JRadioButton[rdtxt.length];
	//this will create a new Panel with BorderLayout
		JPanel tblPanel = new JPanel(new BorderLayout());
		JPanel tblPanel1 = new JPanel(new BorderLayout());
		JButton rmv = new JButton();
		JButton pment = new JButton("Payment");
		JPanel panelpm = new JPanel();
		JDialog dialogpm = new JDialog();
		JButton kay = new JButton("Okay");
		JPanel panelok = new JPanel();
		JDialog dialogok = new JDialog();
		JButton okButton = new JButton("OK");
		String [] column1 = new String []{
				"Item Code","Item Name",
				"Price",
				"Size", "Quantity",
				"Total" ,
				
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
		String [][] row1 = new String [][] {
		};
		 
		
		DefaultTableModel model = new DefaultTableModel(row, column);
		
		JTable table = new JTable(model);
		
		JScrollPane scroll = new JScrollPane(table);
		TableRowSorter<TableModel> sort = new TableRowSorter<>(table.getModel());
		JTextField txtSearch = new JTextField();
		JLabel item = new JLabel("Search Item:");
		Vector <String> r = new Vector <String> ();
		//another table
		
		DefaultTableModel model1 = new DefaultTableModel(row1, column1);
		JTable table1 = new JTable(model1);
		JScrollPane scroll1 = new JScrollPane(table1);
		TableRowSorter<TableModel> sort1 = new TableRowSorter<>(table1.getModel());
		Vector <String> r1 = new Vector <String> ();
		double totalAmount = 0.0;
		 double newTotalAmount = 0.0;
		 double discountRate = 0.0;
		 double discountAmount;

         // Calculate the discounted total
         double discountedTotal ;
         
         JPanel ince = new JPanel();
     	JLabel in =new JLabel("Invoice No : ");
     	JTextField defaults =new JTextField();
     	JLabel defaults1 =new JLabel("100000");
     	int num1 =1;
		DecimalFormat decfor1 = new DecimalFormat("100000");
		int num;
		DecimalFormat decfor= new DecimalFormat("100000");
		
		JLabel time =new JLabel("Time : ", JLabel.CENTER);
		JLabel date =new JLabel("Date : ", JLabel.CENTER);
		JLabel time1 =new JLabel();
		JLabel date1 =new JLabel();

	
		frame(){
			this.setSize(1000, 700);
	        this.setTitle("Login");
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        
	        kkop.setFont(new Font("Cambria", Font.BOLD, 60));
	        kkop.setBounds(170, 40, 400, 50);
	        kkop.setForeground(Color.decode("#FEFDF3"));
	        
	        
	        in.setBounds(10,10,200,30);
	        in.setFont(new Font("Arial", Font.BOLD, 20));
	        in.setForeground(Color.BLACK);
	        defaults.setForeground(Color.BLACK);
	        defaults.setBounds(10,50,150,30);
	        defaults.setFont(new Font("Arial", Font.BOLD, 20));
	        defaults.setEditable(false);
	        defaults.setHorizontalAlignment(JTextField.CENTER);
	        defaults1.setForeground(Color.BLACK);
	        defaults1.setBounds(10,50,150,30);
	        defaults1.setFont(new Font("Arial", Font.BOLD, 20));
	        defaults1.setHorizontalAlignment(JLabel.CENTER);
	        inc.add(defaults);
	        inc.add(defaults1);
	        inc.add(in);
	        inc.setLayout(null);
	        
	        panel.setBounds(0, 0, 1000, 680);
	        panel.setBackground(new Color(0,0,0,80));
	        panel.setForeground(Color.BLACK);
	        
	        title.setBounds(0, 0, 750, 120);
	        title.setBackground(new Color(255,255,255,100));
	        title.setForeground(Color.white);
	        title.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        
	        dt.setBounds(0, 130, 750, 100);
	        dt.setForeground(Color.white);
	        dt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        dt.setForeground(Color.white);
	        dt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	      
	        time.setBounds(530,10,100,30);
	        time.setFont(new Font("Cambria", Font.BOLD, 20));
	        time.setForeground(Color.BLACK);
	        date.setForeground(Color.BLACK);
	        date.setBounds(50,10,100,30);
	        date.setFont(new Font("Cambria", Font.BOLD, 20));
	        
	        dt.add(date);
	        dt.add(time);
	        dt.setLayout(null);
	        
	       
	        
	        dt.setForeground(Color.white);
	        dt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	        dt.setLayout(new FlowLayout());
	        
	        time1.setBounds(550,40,400,50);
	        time1.setFont(new Font("Cambria", Font.BOLD, 20));
	        time1.setForeground(Color.BLACK);
	        date1.setForeground(Color.BLACK);
	        date1.setBounds(60,40,400,50);
	        date1.setFont(new Font("Cambria", Font.BOLD, 20));
	        
	        
	        Thread updateTimeThread = new Thread(() -> {
	            while (true) {
	                SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
	                SimpleDateFormat df = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.ENGLISH);

	                String ft = tf.format(new Date());
	                String fd = df.format(new Date());

	                SwingUtilities.invokeLater(() -> {
	                    time1.setText(ft);
	                    date1.setText(fd);
	                });

	                try {
	                    Thread.sleep(1000); // Delay for 1 second
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        updateTimeThread.start();
	        
	        dt.add(date1);
	        dt.add(time1);
	        dt.setLayout(null);
	        
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
	        
	        cl.setBounds(790, 480, 150, 30);
	        cl.setBackground(Color.white);
	        cl.setFont(new Font("Cambria", Font.PLAIN, 14));
	        cl.setFocusable(false);



	        background.setBounds(0, 0, 1000, 700);
	        
	   
	      

	        table.getTableHeader().setEnabled(false);
	        table.setDefaultEditor(Object.class, null);
	        
	        table1.getTableHeader().setEnabled(false);
	        table1.setDefaultEditor(Object.class, null);
	        
	      
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
			
			
		
	
			item.setBounds(350, 240, 150, 30);
			item.setFont(new Font("Cambria", Font.PLAIN, 18));
			
			
			table.setRowSorter(sort);
			qtyfield.setBounds(60, 273, 180, 30);
			QTY.setFont(new Font("Cambria", Font.PLAIN, 18));
			qtyfield.setHorizontalAlignment(JTextField.CENTER);
			QTY.setHorizontalAlignment(JTextField.CENTER);
			QTY.setBounds(60, 240, 180, 30);
			amnt1.setBounds(795, 155, 150, 50);
			amnt1.setText("Total Amount:");
			amnt1.setFont(new Font("Cambria", Font.PLAIN, 18));
			amnt.setBounds(795, 200, 150, 50);
			amnt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			amnt.setEditable(false);
			aitem.setBounds(100, 250, 150, 40);
			aitem.setFocusable(false);
			aitem.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        try {
			            int selectedRow = table.getSelectedRow();
			            if (selectedRow != -1) {
			                int numRowsToAdd = 3;
			                int addedRows = 0;

			                for (int row : table.getSelectedRows()) {
			                    String[] rowData = new String[table1.getColumnCount()];
			                    int rowDataIndex = 0;

			                    for (int i = 0; i < table.getColumnCount() - 1; i++) {
			                        if (i != 2) {
			                            rowData[rowDataIndex] = table.getValueAt(row, i).toString();
			                            rowDataIndex++;
			                        }
			                    }

			                    int enteredQuantity = Integer.parseInt(qtyfield.getText());
			                    int currentStock = Integer.parseInt(rowData[5]);
			                    int updatedStock = currentStock - enteredQuantity;
			                    rowData[5] = String.valueOf(updatedStock);

			                    double price = Double.parseDouble(rowData[2]);
			                    double total = price * enteredQuantity;

			                    rowData[5] = String.valueOf(total);
			                    rowData[rowData.length - 2] = qtyfield.getText();

			                    qtyfield.setText("");
			                    model1.addRow(rowData);
			                    addedRows++;
			                    totalAmount += total;

			                    if (addedRows == numRowsToAdd) {
			                        break;
			                    }
			                }

			                amnt.setText(String.valueOf(totalAmount));
			            }
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Please input a valid quantity.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			            qtyfield.setText("");
			        }

			        dialog.dispose();
			    }
			});

				    	srch.setBounds(350, 273, 150, 30);
				srch.setBackground(Color.white);
				srch.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				srch.setFocusable(false);
				srch.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        // TODO Auto-generated method stub

				       
				        
		        		 if (qtyfield.getText().isEmpty()) {
		        	            JOptionPane.showMessageDialog(null, "Please fill the quantity.","Invalid Input", JOptionPane.ERROR_MESSAGE);
		        	        } else {
		        	              	 
		        	    dialog.dispose();
		        	}
		        	}
		        });
				        srch.addMouseListener(new MouseAdapter() {
				        	@Override
				        	public void mouseClicked(MouseEvent e) {
				        	

				        panel2.setBounds(40, 60, 1000, 300);
				        panel2.add(scroll);
				        panel2.setLayout(null);
				       
				        stem.setBounds(20, 20, 150, 30);
				        aitem.setBounds(700, 20, 150, 30);
				        txtSearch.setBounds(100, 20, 450, 30);
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
				        dialog.add(stem);
				        dialog.add(panel2);
				        dialog.add(txtSearch);
				        dialog.add(aitem);

				        dialog.pack();
				        dialog.setSize(1000, 350);
				        dialog.setLocationRelativeTo(null);
				        dialog.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
				        dialog.setVisible(true);
				    }
				
				});
	//------------------------------------------------>DISCOUNT DIALOG<----------------------------------------------------------------//
				        
				        dsc.setBounds(790, 380, 150, 30);
				        dsc.setBackground(Color.white);
				        dsc.setFont(new Font("Cambria", Font.PLAIN, 14));
				        dsc.setFocusable(false);
				        dsc.addActionListener(new ActionListener() {
				            @Override
				            public void actionPerformed(ActionEvent e) {
				                if (paneldt.getComponentCount() == 0) {
				                   
				                    paneldt.setOpaque(true);
				                    paneldt.setBounds(0, 0, 350, 300);
				                    paneldt.setLayout(new GridLayout(0, 2, 0, 0));
				                    paneldt.setBackground(Color.white);
				                    paneldt.setForeground(Color.BLACK);

				                    for (int a = 0; a < rdtxt.length; a++) {
				                        rdBtn[a] = new JRadioButton(rdtxt[a]);
				                        rdBtn[a].setFocusable(false);
				                        rdBtn[a].setFont(new Font("Times New Roman", Font.PLAIN, 12));
				                        rdGroup.add(rdBtn[a]);
				                        paneldt.add(rdBtn[a]);
				                    }
				                }
				                    dialogdt = new JDialog();
				                    dialogdt.setTitle("Discount");
				                    dialogdt.setSize(350, 300);
				                    dialogdt.setLocationRelativeTo(null);
				                    dialogdt.setLayout(null);
				                    dialogdt.getContentPane().setBackground(Color.white);
				                    dialogdt.getContentPane().add(paneldt);

				                    ok.setBounds(110, 110, 60, 30);
				                    ok.setFocusable(false);
				                    ok.addActionListener(new ActionListener() {
				                    @Override
				                    public void actionPerformed(ActionEvent e) {


				                        if (rdBtn[2].isSelected()) {
				                            discountRate = 0.03; 
				                        } else if (rdBtn[3].isSelected()) { 
				                            discountRate = 0.2; 
				                        } else if (rdBtn[0].isSelected()) {
				                            discountRate = 0.25; //
				                        } else if (rdBtn[1].isSelected()) { 
				                            discountRate = 0.15; 
				                        }

				                        int selectedRowIndex = table1.getSelectedRow();

				                        if (selectedRowIndex != -1) {
				                            double originalTotal = Double.parseDouble(table1.getValueAt(selectedRowIndex, 5).toString()); // Assuming the total column is at index 5

				                           
				                          discountAmount = originalTotal * discountRate;

				                           
				                            discountedTotal = originalTotal - discountAmount;

				                           
				                            
				                            totalAmount -= (originalTotal - discountedTotal);
				                            amnt.setText(String.valueOf(totalAmount));

				                            dialogdt.dispose();
				                        } else {
				                            JOptionPane.showMessageDialog(null, "Please select a row to apply a discount!", "Select Item", JOptionPane.ERROR_MESSAGE);
				                        }
				                    }
				                });

				                


				                JScrollPane scrollPane = new JScrollPane(paneldt);
				                scrollPane.setBounds(0, 0, 350, 100);
				                scrollPane.setViewportView(paneldt); 

				                JPanel contentPane = new JPanel();
				                contentPane.setLayout(null); 
				                contentPane.add(ok);
				                contentPane.add(scrollPane);
				                contentPane.setPreferredSize(new Dimension(300, 150));

				                dialogdt.setContentPane(contentPane);
				                dialogdt.pack();
				                dialogdt.setLocationRelativeTo(null);
				                dialogdt.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
				                dialogdt.setVisible(true);
				            }
				        });
//-------------------------------------------------------->REMOVE ITEM<----------------------------------------------------------//				        
				        rmv.setBounds(790, 330, 150, 30);
				        rmv.setText("Remove Item");
				        rmv.setFont(new Font("Cambria", Font.PLAIN, 14));
				        rmv.setBackground(Color.white);
				        rmv.setFocusable(false);
				        rmv.addActionListener(new ActionListener() {
				            @Override
				            public void actionPerformed(ActionEvent e) {
				                int selectedRowIndex = table1.getSelectedRow();
				                if (selectedRowIndex != -1) {
				                    int cancels = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Delete", JOptionPane.YES_NO_OPTION);
				                    if (cancels == JOptionPane.YES_OPTION) {
				                        double deletedTotal = Double.parseDouble(table1.getValueAt(selectedRowIndex, 5).toString()); // Assuming the total column is at index 5
				                        model1.removeRow(selectedRowIndex);
				                        totalAmount -= deletedTotal;

				                       
				                        amnt.setText(String.valueOf(totalAmount));

				                        JOptionPane.showMessageDialog(null, "Item Successfully Deleted");
				                    }
				                } else {
				                    JOptionPane.showMessageDialog(null, "Please select a row to delete!","Select item",JOptionPane.ERROR_MESSAGE);
				                }
				            }
				        });
				        
//--------------------------------------------------------> PAYMENT<----------------------------------------------------------//
				        pment.setBounds(790, 430, 150, 30);
				        pment.setBackground(Color.white);
				        pment.setFont(new Font("Cambria", Font.PLAIN, 14));
				        pment.setFocusable(false);
				        pment.addActionListener(new ActionListener() {
				            @Override
				            public void actionPerformed(ActionEvent e) {
				               
				                JDialog dialogpm = new JDialog();
				                dialogpm.setTitle("Cash");
				                dialogpm.setSize(300, 200);
				                dialogpm.setLocationRelativeTo(null);
				                dialogpm.setLayout(null);

				               
				                JTextField pmnt = new JTextField();
				                pmnt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
				                pmnt.setHorizontalAlignment(JTextField.CENTER);
				                pmnt.setBounds(70, 50, 150, 30);
				                
				                JLabel pmt = new JLabel("Payment:");
				                pmt.setFont(new Font("Cambria", Font.PLAIN, 14));
				                pmt.setBounds(70, 20, 150, 30);
				                
				                JButton kay = new JButton("OK");
				                JButton cal = new JButton("Cancel");
            	                kay.setBounds(145, 90, 70, 30);
            	                cal.setBackground(Color.white);
            	                cal.setFont(new Font("Cambria", Font.PLAIN, 12));
            	                cal.setFocusable(false);
            	                cal.addActionListener(new ActionListener() {
            	                    @Override
            	                    public void actionPerformed(ActionEvent e) {
            	                        // TODO: Implement cancel button functionality
            	                    	 int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
     				        	        
     				        	        if (option == JOptionPane.YES_OPTION) {
     				        	        	dialogpm.dispose();
     				        	        }
            	                    }
            	                });

            	                

				                
				                cal.setBounds(70, 90, 70, 30);
				                kay.setBackground(Color.white);
				                kay.setFont(new Font("Cambria", Font.PLAIN, 12));
				                kay.setFocusable(false);
				                kay.addActionListener(new ActionListener() {
				                    @Override
				                    public void actionPerformed(ActionEvent e) {
				                        String paymentText = pmnt.getText();
				                        if (paymentText.isEmpty()) {
				                            JOptionPane.showMessageDialog(dialogpm, "Please enter the payment amount.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				                       
				                        } else {
				                	        try {
				                	            double paymentAmount = Double.parseDouble(paymentText);
				                	            double totalAmount = Double.parseDouble(amnt.getText());

				                	            if (paymentAmount < totalAmount) {
				                	                JOptionPane.showMessageDialog(dialogpm, "Insufficient payment amount.", "Invalid Payment", JOptionPane.ERROR_MESSAGE);
				                	            } else {
				                	                double changeAmount = paymentAmount - totalAmount;

				                	                // Create and configure the second dialog
				                	                JDialog dialogok = new JDialog();
				                	                dialogok.setBounds(0, 0, 460, 550);
				                	                dialogok.setLocationRelativeTo(null);
				                	                dialogok.setLayout(null);

				                	                JPanel panelok = new JPanel();
				                	                panelok.setBounds(0, 0, 460, 550);
				                	                panelok.setBackground(Color.white);
				                	                panelok.setBorder(BorderFactory.createLineBorder(Color.black, 1));
				                	                panelok.setLayout(null);
				                	                
				                	               
				    				                okButton.setBounds(185, 480, 60, 20);
				    				                okButton.setBorder(null);
				    				                okButton.setFocusable(false);
				    				                okButton.setFont(new Font("Arial", Font.PLAIN, 12));
				    				                okButton.setBackground(Color.white);
				    				                okButton.addActionListener(new ActionListener() {
				    				                    @Override
				    				                    public void actionPerformed(ActionEvent e) {
				    				                        dialogok.dispose(); 
				    				                        dialogpm.dispose();
				    				                     // Clear the data from table1
				    				                        DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				    				                        while (model1.getRowCount() > 0) {
				    				                            model1.removeRow(0);
				    				                        }

				    				                        table1.removeAll();
				    				                        amnt.setText(" ");
				    				                        
				    				                        defaults.setText(decfor1.format(num1));
				    				    					
				    				    					num1 ++;
				    				    					
				    				    					 
				    				    					
				    				    					
				    				                 
				    				                    }});
				    				                
				    				               
				    				                
				    				                dialogok.add(okButton);

				                	                JLabel rpt = new JLabel("KKOPI DAYTS");
				                	                rpt.setBounds(125, 20, 250, 40);
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
				                	             

				                	                
				                	                dialogok.add(scrollPane);

				                	                dialogok.add(panelok);
				                	                dialogok.setVisible(true); 
				                	            }

				                	        } catch (NumberFormatException ex) {
				                                JOptionPane.showMessageDialog(dialogpm, "Invalid payment amount. Please enter a valid number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				                	        }
				                	    }
				                	}

				                });
				               

				               
				                dialogpm.add(pmnt);
				                dialogpm.add(pmt);
				                dialogpm.add(cal); 
				                dialogpm.add(kay);
				                dialogpm.setVisible(true); 

				            }
		                });
				        
				        cl.setBounds(790, 480, 150, 30);
				        cl.setBackground(Color.white);
				        cl.setFont(new Font("Cambria", Font.PLAIN, 14));
				        cl.setFocusable(false);
				        cl.addActionListener(new ActionListener() {

				        	@Override
				        	public void actionPerformed(ActionEvent e) {
				        	    if (e.getSource() == cl) {
				        	        
				        	        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
				        	        
				        	        if (option == JOptionPane.YES_OPTION) {
				        	            DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				        	            while (model1.getRowCount() > 0) {
				        	                model1.removeRow(0);
				        	            }

				        	            table1.removeAll();
				        	            amnt.setText("");
				        	            qtyfield.setText("");
				        	            defaults.setText("");
				        	            
				        	        }
				        	    }
				        	}

				        	
				        });
				        
				        
				        
				        
	
			tblPanel.setBounds(15, 350, 900, 200);
			tblPanel.setBackground(Color.white);
			tblPanel.add(scroll);
			tblPanel.setVisible(false);
			
			tblPanel1.setBounds(15, 350,720, 300);
			tblPanel1.setBackground(Color.white);
			tblPanel1.add(scroll1);


			this.add(amnt1);
			this.add(kkop);
			this.add(cl);
			this.add(kay);
			this.add(QTY);
			this.add(panelok);
			this.add(pment);
			this.add(rmv);
			this.add(item);
			this.add(dsc);
			//this.add(paneldt); 
			this.add(panelpm);
			this.add(amnt);
			this.add(srch);
			this.add(qtyfield);
			this.add(tblPanel);
			this.add(tblPanel1);
	        this.add(dt);
	        this.add(tbl);
	        this.add(itm);
	        this.add(ttl);
	        this.add(inc);
	        this.add(qty);
	        this.add(title);
	        this.add(panel);
	        this.add(panel2);       
	        this.add(background);
	        this.setLayout(null);
	        this.setVisible(true);
	        
	        
	}


		@Override
		public void actionPerformed(ActionEvent e) {
		    
		}
}