package Jtable_inventory_Activity;
	import java.awt.*;
	import java.awt.event.*;
	import java.text.DecimalFormat;
	import java.util.Vector;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import javax.swing.*;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;
	import javax.swing.table.DefaultTableCellRenderer;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.table.TableColumnModel;
@SuppressWarnings("serial")
public class inventory extends JFrame {

		//this will create a new Panel with BorderLayout
		JPanel tblPanel = new JPanel(new BorderLayout());
		
		//this will create an array of JTextField with fixed size of 5
		JTextField [] txtFields = new JTextField[6];
		
		//this will create an array of JLabel with fixed size of 5
		JLabel [] lblFields = new JLabel[6];
		
		//this string array will be the text of the Jlabel
		String [] strLblFields = {"Item Code : ", "Item Description : ", "Price : ", "Size", "Stocks : ", "Re-Order Point : "};

		//this will create a JButton
		JButton stockin  = new JButton();
		JButton add = new JButton();
		JButton edit= new JButton();
		JButton remove = new JButton();
		JButton save = new JButton();
		JButton cancel = new JButton();
		JButton save2 = new JButton();
		int num = 1;
		DecimalFormat decfor = new DecimalFormat("00000");	
		
		String [] column = new String []{"Item Code","Item Description","Price","Size", "Stocks.","Re-Order Point" ,	"Remarks"};
		
		//this will fill the info of the column of the table
		String [][] row = new String [][] {};
		//parts of tables
		DefaultTableModel model = new DefaultTableModel(row, column);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		Vector <String> r = new Vector <String> ();	
		
		
		inventory() {
			
			this.setTitle("Inventory");
			this.setSize(1200, 450);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			
			
			
			int y = 50;
			//this loop will set the properties of JTextField , JLabel
			for(int i = 0; i <= lblFields.length-1 ; i++) {
				
				//properties of JTextField
				txtFields[i] = new JTextField();
				txtFields[i].setBounds(180, y, 150, 25);
				this.add(txtFields[i]);
				
				txtFields[0].setEnabled(false);
				
				//properties of JLabel
				lblFields[i] = new JLabel();
				lblFields[i].setText(strLblFields[i]);
				lblFields[i].setBounds(50, y, 150, 25);
				this.add(lblFields[i]);
				
				y += 30;
				
				

			}
//BUTTONS---------------------------------------------------------------------------------------------------------		
			stockin.setBounds(20, 230, 100, 30);
			stockin.setText("Stock In");
			stockin.setFocusable(false);
			stockin.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					int viewRow = table.getSelectedRow();		
					if (viewRow < 0) {
	                    //Selection got filtered away.
	                
	                } else {
	                   
	                        table.convertRowIndexToModel(viewRow);

	                }

	                
	                if (e.getSource() == stockin) {
	                    
	                	int row = table.getSelectedRow();
	                	 Pattern p = Pattern.compile("[A-Za-z&%$#@!*0-9]+$");
						 Matcher n = p.matcher(txtFields[4].getText());
	        			if(row == -1){
	        				JOptionPane.showMessageDialog(null, "Please select row to edit", "Row Selection Invalid", JOptionPane.ERROR_MESSAGE);
	        			}
						
						     else{
						    	 String stock = JOptionPane.showInputDialog("Enter stocks to add: ");
						    	 if (stock == null) {
						    	 int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
						    	 if (option == JOptionPane.YES_OPTION) {
						    	// User clicked "Yes", so add the stock to the table
						    		 }
						    	 }


	        					String stockval = table.getValueAt(row,4).toString();
	        					int intStock = Integer.parseInt(stockval.trim());
	        					int totalStock = Integer.parseInt(stock.trim());
	        					
	        					model.setValueAt(totalStock, row,4);
	        					String val = table.getValueAt(row,5).toString();
	        					txtFields[4].setText(stock);
	        					if(totalStock <= Integer.parseInt(val.trim())){
	        						model.setValueAt("Low Stock", row,6);
	        					
	        					}

	        					else if(totalStock>Integer.parseInt(val.trim())){
	        						model.setValueAt("High Stock", row,6);
	        					}
	        					 else {
					    			 System.exit(0);
					    			 }
	        			}
					 }
	                	                
}});
			add.setBounds(130, 230, 100, 30);
			add.setText("ADD");
			add.setFocusable(false);
			add.addActionListener(new ActionListener() {
				
				@Override
					public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		
					
					if (e.getSource()==add) {
					
					
					txtFields[0].setText(decfor.format(num));
					
					num ++;
					
					 
					
					}
					 
						
					
					if(e.getSource()==add) {
						add.setEnabled(false);
						stockin.setEnabled(false);
						remove.setEnabled(false);
						edit.setEnabled(false);
						save.setEnabled(true);
						cancel.setEnabled(true);
					
					}
					
					
					if(e.getSource()==add) {
						
					
							txtFields[1].setText(" ");
							txtFields[2].setText(" ");
							txtFields[3].setText(" ");
							txtFields[4].setText(" ");
							txtFields[5].setText(" ");
					}	
				}
				
				});
			
			edit.setBounds(240, 230, 100, 30);
			edit.setText("Edit");
			edit.setFocusable(false);
			edit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==edit) {
						add.setEnabled(false);
						stockin.setEnabled(false);
						remove.setEnabled(false);
						edit.setEnabled(false);
						save.setEnabled(true);
						cancel.setEnabled(true);
	
					}
					
				if(e.getSource() == edit){

						if(table.getSelectedRow() == -1){
							JOptionPane.showMessageDialog(null,"Select row to edit.");
						}

						else{

							for(int a=0; a<=txtFields.length-1;a++){
								txtFields[a].setEditable(true);
							}

							txtFields[4].setEditable(false);
							save2.setVisible(true);
							edit.setVisible(false);
							{
							add.setEnabled(false);
							stockin.setEnabled(false);
							remove.setEnabled(false);
							edit.setEnabled(false);
							save.setEnabled(false);
							cancel.setEnabled(false);
							}
							edit.setEnabled(true);
							cancel.setEnabled(true);

						}
					}
				}});
			save2.setBounds(240, 230, 100, 30);
			save2.setText("Save");
			save2.setFocusable(false);
			save2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					 if(e.getSource() == save2){
						
						 Pattern p = Pattern.compile("^^[A-Za-z&%$#@!*^0-9]+$");
						 Matcher n = p.matcher(txtFields[5].getText());

						 if (e.getSource() == save2) {
						     if (!n.matches() || !n.matches()) {
						         JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid Input", JOptionPane.ERROR_MESSAGE);
						         save.setEnabled(true);
						         cancel.setEnabled(true);
						         add.setEnabled(false);
						         stockin.setEnabled(false);
						         remove.setEnabled(false);
						         edit.setEnabled(false);
						     }
						     else if (txtFields[0].getText().isBlank() || txtFields[1].getText().isBlank() || txtFields[2].getText().isBlank() || txtFields[3].getText().isBlank() || txtFields[4].getText().isBlank() || txtFields[5].getText().isBlank()) {
						         JOptionPane.showMessageDialog(null, "Please fill up all the inputs correctly.");
						     } 
						     else {
					
							int row = table.getSelectedRow();
							 String stck = txtFields[5].getText();
							 int stcks = Integer.parseInt(stck.trim());
			                    
			                    String stck1 = txtFields[4].getText();
			                    int stcks1 = Integer.parseInt(stck1.trim());

							

							for(int b=0; b<= 3; b++){

								model.setValueAt(txtFields[b].getText(), row, b);
							}

							model.setValueAt(String.valueOf(stcks1), row, 4);
							model.setValueAt(String.valueOf(stcks), row, 5);


								if(stcks1<=stcks){
									table.setValueAt("Low Stocks", row,6);
								}

								

								else if(stcks1>=stcks){
									table.setValueAt("High Stocks", row,6);
								}

								JOptionPane.showMessageDialog(null,"Item Successfully Edited!");
								table.getSelectionModel().clearSelection();
								{
								add.setEnabled(true);
								stockin.setEnabled(true);
								remove.setEnabled(true);
								edit.setEnabled(true);
								save.setEnabled(true);
								cancel.setEnabled(true);
								}
								cancel.setEnabled(false);
								edit.setVisible(true);
								save2.setVisible(false);

								for(int i=0; i<=txtFields.length-1; i++){
									txtFields[i].setText("");
									txtFields[i].setEditable(true);
								}
							}



						 }
						 
						
						
					}

					}
			});
			
			remove.setBounds(20, 280, 100, 30);
			remove.setText("Delete");
			remove.setFocusable(false);
			remove.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==remove) {
						int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete",JOptionPane.YES_NO_OPTION);
						if(cancels ==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null,"Item Successfully Deleted");
							
			                    
			                     int i = table.getSelectedRow();
									
									if(table.isRowSelected(i)) {
										
										model.removeRow(table.getSelectedRow());
										
									}
						}
					}
				}});
			
			save.setBounds(130, 280, 100, 30);
			save.setText("Save");
			save.setFocusable(false);
			save.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					 if(e.getSource()==save) {
						 save.setEnabled(false);
							cancel.setEnabled(false);
							add.setEnabled(true);
							stockin.setEnabled(true);
							remove.setEnabled(true);
							edit.setEnabled(true);
					}
					 
					 Pattern p = Pattern.compile("[A-Z, a-z, &%$#@!*^]");
					 Matcher m = p.matcher(txtFields[4].getText());
					 Matcher n = p.matcher(txtFields[5].getText());
					
					 
					 if(e.getSource()==save) {
						 if(txtFields[0].getText().isBlank() || txtFields[1].getText().isBlank()  || txtFields[2].getText().isBlank()  || txtFields[3].getText().isBlank()  || txtFields[4].getText().isBlank()  || txtFields[5].getText().isBlank() ){
					    	JOptionPane.showMessageDialog(null,"Please fill out all the required fields ", "Input", JOptionPane.WARNING_MESSAGE);
					 }
							
						 
						 else if (m.find() && m.find() || n.find() && n.find() ){
								JOptionPane.showMessageDialog(null,"Please enter a number", "Invalid Input", JOptionPane.ERROR_MESSAGE);			
								 save.setEnabled(true);
									cancel.setEnabled(true);
									add.setEnabled(false);
									stockin.setEnabled(false);
									remove.setEnabled(false);
									edit.setEnabled(false);
						 }
					 
					 else if(e.getSource()==save) {
						 
						
						 int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to save this item?","Save",JOptionPane.YES_NO_OPTION);
							if(cancels ==JOptionPane.YES_OPTION) {
								JOptionPane.showMessageDialog(null,"Item Successfully Save");
							}
							
								else  {
								
								JOptionPane.showMessageDialog(null,"Cancelled");
								setVisible(false);
								
							}
						 
							r.add(txtFields[0].getText());
							r.add(txtFields[1].getText());
							r.add(txtFields[2].getText());
							r.add(txtFields[3].getText());
							r.add(txtFields[4].getText());
							r.add(txtFields[5].getText());
							
//							  model.setValueAt(txtFields[0].getText(), 0, 0);
							  
							
	
							  if (e.getSource() == save) {					
								   String stockStr = txtFields[4].getText();
								   String ro = txtFields[5].getText();
								   int stock = Integer.parseInt(stockStr.trim());
								   int reorder = Integer.parseInt(ro.trim());
								  
								   if (stock >= reorder ) {   
									  
									   
									   r.add("High Stocks");
								   
								   
								   }
								   else if(stock <= reorder ){
									   r.add("Low Stocks");
								   }
								   model.addRow(r); r = new Vector <String> ();
							  } 
					 }  
							
					 }

				}});

			cancel.setBounds(240, 280, 100, 30);
			cancel.setText("Cancel");
			cancel.setFocusable(false);
			cancel.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==cancel)	{
						int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all the data?","Cancel",JOptionPane.YES_NO_OPTION);
						if(cancels ==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null,"this will remove all the data you input");
							setVisible(false);
						
							
						}
					}
					
				
				}});
//table------------------------------------------------------------------------------------------------------------------
			table.getTableHeader().setEnabled(false);
			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(JLabel.CENTER);
			
			
			for(int i = 0; i < column.length; i++) {
				table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			}
			
			TableColumnModel tmtblProducts = table.getColumnModel();
			tmtblProducts.getColumn(0).setPreferredWidth(150);
			tmtblProducts.getColumn(1).setPreferredWidth(150);
			tmtblProducts.getColumn(2).setPreferredWidth(150);
			tmtblProducts.getColumn(3).setPreferredWidth(150);
			tmtblProducts.getColumn(4).setPreferredWidth(150);
			tmtblProducts.getColumn(5).setPreferredWidth(150);
			tmtblProducts.getColumn(6).setPreferredWidth(150);
			
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
				table.setDefaultEditor(Object.class, null);					
			}
				
			});

			tblPanel.setBounds(400, 20, 720, 370);
			tblPanel.setBackground(Color.white);
			tblPanel.add(scroll);
			
			this.add(tblPanel);
			this.add(stockin);
			this.add(add);
			this.add(edit);
			this.add(remove);
			this.add(save);
			this.add(cancel);
			this.add(save2);
			this.setLayout(null);
			this.setVisible(true);
			
		}
}
