package loginInvents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultRowSorter;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

public class trys  extends JFrame implements ActionListener{
	
	
	
	Dimension size = getToolkit().getScreenSize();
	Toolkit toolkit = this.getToolkit();

	JPanel tblPanel = new JPanel(new BorderLayout());
	
	JPanel pTitle = new JPanel();
	JPanel pdateTime = new JPanel();
	JPanel pdateTime2 = new JPanel();
	JPanel quantity = new JPanel();
	JPanel invoice = new JPanel();
	JPanel total = new JPanel();
	JPanel functions = new JPanel();
	
	JLabel lTitle = new JLabel("SARI-SARI STORE", JLabel.CENTER);
	JLabel time = new JLabel("Time : ", JLabel.CENTER);
	JLabel date = new JLabel("Date : ", JLabel.CENTER);
	JLabel timeLabel = new JLabel();
	JLabel dateLabel = new JLabel();
	JTextField quant = new JTextField();
	JLabel inv =new JLabel("Invoice No : ");
	JLabel defaults =new JLabel("1000000",JLabel.CENTER);
	JLabel tots =new JLabel("Total Amount : ");
	double totalAmount = 0.0;
	JLabel totals =new JLabel("0.00",JLabel.CENTER);
	
	JButton [] buttons = new JButton[5];
	String [] btns= {"New Transaction","Remove Item","Discount","Payment","Cancel"};
	
	JLabel [] qttysrch= new JLabel[2];
	String[] labels= {"Quantity","Search"};
	
	JButton Search = new JButton("Search");
	JButton addItemButton = new JButton("Add Item");
	
	JPanel tableP = new JPanel();
	
	JDialog discountDialog = new JDialog(this, "Select Discount");
	JRadioButton radio3Percent = new JRadioButton("3%");
    JRadioButton radio25Percent = new JRadioButton("25%");
    JRadioButton radio15Percent = new JRadioButton("15%");
    JRadioButton radio20Percent = new JRadioButton("20%");
	
	String [] column = new String [] {"Item Code", "Item Name ", "Price", "Size", "Quantity","Total"};			
	String [][] row = new String [][] {	};
	
	
	DefaultTableModel model = new DefaultTableModel(row, column);
	JTable table = new JTable(model);
	JScrollPane scroll = new JScrollPane(table);
	Vector <String> r = new Vector <String> ();	
	
	String [] column2 = new String [] {"Item Code", "item name", "Item Description", "Price", "Size", "Stocks", "Re-Order Point", "Remarks"};	
	String[][] row2 = new String [][] {
		    {"00001", "Palmolive", "Shampoo", "7.00", "10 ml", "50", "30", "High Stock"},
		    {"00002", "Creamsilk", "Shampoo", "7.00", "10 ml", "50", "30", "High Stock"},
		    {"00003", "Sanicare", "Cleaning Wipes", "50.00", "50 sheets", "60", "30", "High Stock"},
		    {"00004", "Datu Puti", "Soy Sauce", "20.00", "200 ml", "40", "30", "High Stock"},
		    {"00005", "Colgate", "Toothbrush", "20.00", "18 grams", "50", "30", "High Stock"},
		    {"00006", "Colgate", "Toothpaste", "80.00", "150 grams", "50", "30", "High Stock"},
		    {"00007", "Joy", "Dishwashing Liquid", "12.00", "18.5 ml", "50", "30", "High Stock"},
		    {"00008", "Century", "Canned Goods", "78.2", "5.3 oz", "50", "30", "High Stock"},
		    {"00009", "Shyflakes", "Biscuit", "55.6", "22 grams", "50", "30", "High Stock"},
		    {"00010", "Kopiko", "3 in 1", "12.00", "7 grams", "40", "30", "High Stock"}
		};

	
	DefaultTableModel model2 = new DefaultTableModel(row2, column2);
	JTable table2 = new JTable(model2);
	JScrollPane scroll2 = new JScrollPane(table2);
	Vector <String> r2 = new Vector <String> ();	
	
	JTextField searchField = new JTextField ();

	
	trys(){
		
		pTitle.setBounds(15, 30, 1050, 120);
		pTitle.setBackground(new Color(255,255,255,100));
		pTitle.setForeground(Color.white);
		pTitle.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	  
		lTitle.setBounds(0,0,1020,120);
		lTitle.setFont(new Font("Roboto", Font.BOLD, 50));
	    pTitle.add(lTitle);
	    pTitle.setLayout(null);
	    
	    pdateTime2.setBounds(15, 170, 750, 100);
	    pdateTime2.setBackground(new Color(255,255,255,100));
	    pdateTime2.setForeground(Color.white);
	    pdateTime2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      
        time.setBounds(530,10,100,30);
        time.setFont(new Font("Arial", Font.BOLD, 24));
        time.setForeground(Color.BLACK);
        date.setForeground(Color.BLACK);
        date.setBounds(50,10,100,30);
        date.setFont(new Font("Arial", Font.BOLD, 24));
        
        pdateTime2.add(date);
        pdateTime2.add(time);
        pdateTime2.setLayout(null);
        
        pdateTime.setBounds(15, 170, 750, 100);
        pdateTime.setBackground(new Color(255,255,255,100));
        pdateTime.setForeground(Color.white);
        pdateTime.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        pdateTime.setLayout(new FlowLayout());
        
        timeLabel.setBounds(550,50,400,50);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timeLabel.setForeground(Color.WHITE);
        dateLabel.setForeground(Color.WHITE);
        dateLabel.setBounds(60,50,400,50);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 24));
        
        timeLabel = new JLabel();
        timeLabel.setBounds(550, 50, 400, 50);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timeLabel.setForeground(Color.WHITE);
        pdateTime.add(timeLabel);

        dateLabel = new JLabel();
        dateLabel.setBounds(60, 50, 400, 50);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 24));
        dateLabel.setForeground(Color.WHITE);
        pdateTime.add(dateLabel);
        
        quantity.setBounds(15, 290, 530, 100);
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
		quant.setForeground(Color.BLACK);
		quant.setBackground(Color.BLACK);
		quant.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
		quant.setOpaque(false);
		quant.setForeground(Color.BLACK);
		
		invoice.setBounds(550, 290, 210, 100);
	    invoice.setBackground(new Color(255,255,255,100));
	    invoice.setForeground(Color.black);
	    invoice.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	    inv.setBounds(10,10,200,30);
	    inv.setFont(new Font("Arial", Font.BOLD, 20));
	    inv.setForeground(Color.BLACK);
	       
	    defaults.setForeground(Color.BLACK);
	    defaults.setBounds(10,50,200,30);
	    defaults.setFont(new Font("Arial", Font.BOLD, 20));
	    
	    invoice.add(defaults);
	    invoice.add(inv);
	    invoice.setLayout(null);
	    
	    total.setBounds(770, 170, 260, 100);
        total.setBackground(new Color(255,255,255,100));
        total.setForeground(Color.white);
        total.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        tots.setBounds(10,10,260,30);
        tots.setForeground(Color.BLACK);
        tots.setFont(new Font("Arial", Font.BOLD, 30));
            
        totals.setBounds(750,60,290,380);
        totals.setForeground(Color.BLACK);
        totals.setFont(new Font("Arial", Font.BOLD, 40));
        total.setLayout(null);
        total.add(tots);
        
        
        
        functions.setBounds(770, 290, 260, 370);
        functions.setBackground(new Color(255,255,255,100));
        functions.setForeground(Color.black);
        functions.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        int x=310;
		for(int i = 0; i <= buttons.length-1 ; i++) {
			buttons[i] = new JButton();
			buttons[i].setText(btns[i]);
			buttons[i].setBounds( 780,x, 240, 30);
			buttons[i].setFocusable(false);
			buttons[i].setOpaque(false);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 15));
			buttons[i].setForeground(Color.BLACK);
			buttons[i].setBackground(Color.BLACK);
			this.add(buttons[i]);
			//y += 30;
			x +=70;
			
			// Add ActionListener to the button
            final int index = i; // Need to create a final variable for inner class
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Perform actions when the button is clicked
                    System.out.println("Button clicked: " + btns[index]);
                    
                    switch (btns[index]) {
                    	case "Discount":
                    		discountDialog.setVisible(true);
                    		break;
                    	case "Remove Item":
                    		int cancels = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Delete", JOptionPane.YES_NO_OPTION);
                            if (cancels == JOptionPane.YES_OPTION) {
                                int selectedRowIndex = table.getSelectedRow();
                                System.out.println("Button clicked: " + selectedRowIndex);
                                if (selectedRowIndex != -1) {
                                    double deletedTotal = Double.parseDouble(table.getValueAt(selectedRowIndex, 5).toString()); // Assuming the total column is at index 5
                                    model.removeRow(selectedRowIndex);
                                    totalAmount -= deletedTotal;

                                    // Update the total amount in the amnt text field
                                    totals.setText(String.valueOf(totalAmount));

                                    JOptionPane.showMessageDialog(null, "Item Successfully Deleted");
                                }
                            }
                    		break;
                		default:
                			break;
                    }
                }
            });   
		}
		
		discountDialog.setSize(300, 200);
        discountDialog.setLayout(new FlowLayout());
        discountDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        discountDialog.setLocationRelativeTo(this);

        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(radio3Percent);
        discountGroup.add(radio25Percent);
        discountGroup.add(radio15Percent);
        discountGroup.add(radio20Percent);

        JButton applyDiscountButton = new JButton("Apply Discount");
        applyDiscountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double discount = 0.0;

                if (radio3Percent.isSelected()) {
                    discount = 0.03;
                } else if (radio25Percent.isSelected()) {
                    discount = 0.25;
                } else if (radio15Percent.isSelected()) {
                    discount = 0.15;
                } else if (radio20Percent.isSelected()) {
                    discount = 0.20;
                }

                // Apply the discount to the total amount
                double discountedAmount = totalAmount - (totalAmount * discount);
                totals.setText(String.valueOf(discountedAmount));

                discountDialog.dispose();
            }
        });

        discountDialog.add(radio3Percent);
        discountDialog.add(radio25Percent);
        discountDialog.add(radio15Percent);
        discountDialog.add(radio20Percent);
        discountDialog.add(applyDiscountButton);
		
		
		 functions.setLayout(null);
		
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
		 
			// Add the "Add Item" button to the functions panel
			functions.add(addItemButton);
	//	Search.setIcon( scaledImageIcon);	
			
			
		Search.setBounds(370,340,100,40);
		Search.addActionListener(this);
	
		Search.setFocusable(false);
		Search.setOpaque(false);
		Search.setBackground(Color.WHITE);
		this.add(Search);
		this.add(quant);
		quantity.setLayout(null);
	
	    
	    this.add(pTitle);
	    this.add(pdateTime);
	    this.add(pdateTime2);
	    this.add(quantity);
	    this.add(invoice);
	    this.add(total);
	    this.add(functions);
	    this.add(tableP);
	    this.add(tblPanel);
	    this.add(searchField);
	    this.add(totals);
	    
	    
	    this.setLayout(null);
        this.setVisible(true);
	
        this.setTitle("POS");
		this.setResizable(false);
		this.setSize(1100,800);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocation(size.width/2 - this.getWidth()/2, size.height/2 - this.getHeight()/2);
	
	}
	
	private void searchModel(String searchText, DefaultTableModel model) {
	    // Clear the table
	    model.setRowCount(0);

	    // Iterate through the rows and columns of the original data
	    for (String[] row : row2) {
	        for (String cell : row) {
	            // If the cell value matches the search text, add the row to the table model
	            if (cell.toLowerCase().contains(searchText.toLowerCase())) {
	                model.addRow(row);
	                break; // Once a match is found, move to the next row
	            }
	        }
	    }
	}
	private boolean isNumeric(String str) {
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	    if (e.getSource() == Search) {
	       
	        String searchQuery = quant.getText();

	          if (((CharSequence) searchQuery).isEmpty()) {
	              JOptionPane.showMessageDialog(null, "Please enter a quantity before searching.",
	                      "Quantity Required", JOptionPane.WARNING_MESSAGE);
	              return; 
	          }
	        if (!isNumeric(searchQuery)) {
	            JOptionPane.showMessageDialog(this, "Invalid quantity input", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	       
	        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model2);
	        sorter.setRowFilter(RowFilter.regexFilter(searchQuery));
	        table2.setRowSorter(sorter);


	        JDialog searchDialog = new JDialog(this, "Search Results", true);
	        searchDialog.setSize(800, 400);
	        searchDialog.setLocationRelativeTo(this);

	        // Create a table to display the search results
	        JTable searchTable = new JTable(model2);
	        JScrollPane searchScroll = new JScrollPane(searchTable);
	        searchDialog.add(searchScroll);

	        // Add a ListSelectionListener to the search table to handle the selection
	        searchTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                // Get the selected row index from the search table
	                int selectedRow = searchTable.getSelectedRow();

	                // Check if a row is selected
	                if (selectedRow != -1) {
	                    // Get the selected item data from the search table
	                    String[] selectedItemData = new String[model2.getColumnCount()];
	                    for (int i = 0; i < model2.getColumnCount(); i++) {
	                        selectedItemData[i] = model2.getValueAt(selectedRow, i).toString();
	                    }
	                }
	            }
	        });
	        
	        JTextField searchField = new JTextField();
	        searchField.setPreferredSize(new Dimension(300, searchField.getPreferredSize().height));
	        
	        JButton addItemButton = new JButton("Add Item");
	        addItemButton.setBounds(780, 310, 240, 100);
	        addItemButton.setFocusable(false);
	        addItemButton.setOpaque(false);
	        addItemButton.setFont(new Font("Arial", Font.BOLD, 15));
	        addItemButton.setForeground(Color.BLACK);
	        addItemButton.setBackground(Color.BLACK);
	        
	        JPanel searchPanel = new JPanel();
	        searchPanel.add(searchField);
	        searchPanel.add(addItemButton);
	        
	        searchDialog.add(searchPanel, BorderLayout.NORTH);	        
	        
	        searchField.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String searchText = searchField.getText();
	                searchModel(searchText, model2);
	            }
	        });

	        
	        addItemButton.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	
		            // Get the selected row index from the search table
		            
		            int selectedRow = searchTable.getSelectedRow();

	                // Check if a row is selected
	                if (selectedRow != -1) {
	                	int numRowsToAdd = 3;
			            int addedRows = 0;
			            
	                    // Get the selected item data from the search table
	                    // String[] selectedItemData = new String[model2.getColumnCount()];
	                    for (int i : searchTable.getSelectedRows()) {
	                    	String[] rowData = new String[model.getColumnCount()]; 
	                    	int rowDataIndex = 0;
	                    	
	                    	for (int row_i = 0; row_i < model2.getColumnCount() - 1; row_i++) {
			                    if (row_i != 2) { 
			                        rowData[rowDataIndex] = model2.getValueAt(i, row_i).toString();
			                        rowDataIndex++;
			                    }
			                }
	                    	
	                    	int enteredQuantity = Integer.parseInt(quant.getText());
			                int currentStock = Integer.parseInt(rowData[4]);
			                int updatedStock = currentStock - enteredQuantity;
			                // rowData[6] = String.valueOf(updatedStock);
			                
			                model2.setValueAt(String.valueOf(updatedStock), i, 5);

			                double price = Double.parseDouble(rowData[2]); 
			                double total = price * enteredQuantity;
			                
			                rowData[5] = String.valueOf(total);
				             
			                rowData[rowData.length - 2] = quant.getText();

			                quant.setText("");
			                model.addRow(rowData);
			                addedRows++;
			                totalAmount = totalAmount + total;
			          
			           
			                if (addedRows == numRowsToAdd) {
			                    break;
			                }
			                totals.setText(String.valueOf(totalAmount));
	                        //selectedItemData[i] = model2.getValueAt(selectedRow, i).toString();
	                    }

	                    // Add the selected item data to the main table model
	                     //model.addRow(selectedItemData);

	                    // Close the search dialog
	                     searchDialog.dispose();
	                }
		        	
		       
		            
		        }
		    });
	        

	        // Show the dialog
	        searchDialog.setVisible(true);
	    } else if (e.getSource() == addItemButton) {
	        // Get the selected row index from the main table
	        int selectedRow = table.getSelectedRow();

	        // Check if a row is selected
	        if (selectedRow != -1) {
	            // Get the selected item data from the main table
	            String[] selectedItemData = new String[model.getColumnCount()];
	            for (int i = 0; i < model.getColumnCount(); i++) {
	            		selectedItemData[i] = model.getValueAt(selectedRow, i).toString();
	                
	            }

	            // Add the selected item data to the main table again (to create a duplicate entry)
	            model.addRow(selectedItemData);
	        }
	    }
	}

}
