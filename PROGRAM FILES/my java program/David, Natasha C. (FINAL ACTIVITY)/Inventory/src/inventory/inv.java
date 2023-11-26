package inventory;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


@SuppressWarnings("serial")
public class inv extends JFrame implements ActionListener{
	
	//this will create a new Panel with BorderLayout
		JPanel tblPanel = new JPanel(new BorderLayout());
		
		//this will create an array of JTextField with fixed size of 5
		JTextField [] txtFields = new JTextField[7];
		
		//this will create an array of JLabel with fixed size of 5
		JLabel [] lblFields = new JLabel[7];
		
		//this string array will be the text of the Jlabel
		String [] strLblFields = {"Item Code : ","Item Name"  ,"Item Description : ", "Price : ", "Size", "Stocks : ", "Re-Order Point : "};
		
		//this will create a JButton
		JButton stockin  = new JButton();
		JButton add = new JButton();
		JButton edit= new JButton();
		JButton remove = new JButton();
		JButton save = new JButton();
		JButton cancel = new JButton();
		JButton save2 = new JButton();
		int num = 11;
		DecimalFormat decfor = new DecimalFormat("00000");
		int num1;
		DecimalFormat decfor1 = new DecimalFormat("00000");
		
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
		TableRowSorter<TableModel> sort = new TableRowSorter<>(table.getModel());
		JTextField txtSearch = new JTextField();
		JLabel item = new JLabel("Search Item:");
		
		Vector <String> r = new Vector <String> ();
		
		boolean addButtonClicked = false;
		
		inv() {
			
			this.setTitle("Table");
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
				txtFields[i].setHorizontalAlignment(JTextField.CENTER);
				this.add(txtFields[i]);
				
				txtFields[0].setEnabled(false);
				
				//properties of JLabel
				lblFields[i] = new JLabel();
				lblFields[i].setText(strLblFields[i]);
				lblFields[i].setBounds(50, y, 150, 25);
				this.add(lblFields[i]);
				
				y += 32;
				
				

			}
			
		

//buttons---------------------------------------------------------------------------------------------------------			
			
			stockin.setBounds(20, 280, 100, 30);
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
					                    TableModelListener[] modelRow = model.getTableModelListeners();
					                        table.convertRowIndexToModel(viewRow);

					                }
//					                r.add(txtFields[0].getText());
//									r.add(txtFields[1].getText());
//									r.add(txtFields[2].getText());
//									r.add(txtFields[3].getText());
//									r.add(txtFields[4].getText());
//									r.add(txtFields[5].getText());
//		                    	
					                
 if (e.getSource() == stockin) {
	 if (e.getSource() == stockin) {
		 txtFields[5].setEnabled(false);
		 
		 Pattern p = Pattern.compile("[A-Za-z&%$#@!*0-9]+$");
		 Matcher n = p.matcher(txtFields[5].getText());
	     
						                	int stk = table.getSelectedRow();
						        			if(stk == -1){
						        				JOptionPane.showMessageDialog(null, "Please select row to edit", "Row Selection Invalid", JOptionPane.ERROR_MESSAGE);
						        			}
						        			
						        			
	 
											 else  if (n.matches() || n.matches()) {
											         JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid Input", JOptionPane.ERROR_MESSAGE);
											        
											     }
											 
						        			else{

						        				String stock = JOptionPane.showInputDialog("Enter stocks to add: ");
						        				if (stock == null) {
						        				    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this stock?", "Confirmation", JOptionPane.YES_NO_OPTION);
						        				    if (option == JOptionPane.YES_OPTION) {
						        				    	
						        				    } else {
						        				    	
						        				    }
						        				} else if (stock.isBlank()) {
						        				    JOptionPane.showMessageDialog(null, "No input", "Input", JOptionPane.INFORMATION_MESSAGE);
						        			
												        
												     }
						        				    else {
						        				   
						        				


						        					String stockval = table.getValueAt(stk,5).toString();
						        					int intStock = Integer.parseInt(stockval.trim());
						        					int totalStock = Integer.parseInt(stock.trim());
						        					
						        					model.setValueAt(totalStock, stk,5);
						        					String val = table.getValueAt(stk,6).toString();
						        					txtFields[5].setText(stock);
						        					if(totalStock<=Integer.parseInt(val.trim())){
						        						model.setValueAt("Low Stock", stk,7);
						        						
						        					
						        					}

						        					else if(totalStock>=Integer.parseInt(val.trim())){
						        						model.setValueAt("High Stock", stk,7);
						        					
						        					}
						        					txtFields[5].setVisible(true);

						        			}
						                   
//						                   txtFields[4].setEnabled(false);
//						                        txtFields[4].setText(userInput);
//						                        r.add(userInput);
//						                        table.setValueAt(String.valueOf(userInput), 0, 4);
//						                        double userInputValue = Double.parseDouble(userInput);
//						                        if (userInputValue >= stcks) {
//						                            r.add("High Stocks");
//						                            table.setValueAt("High Stocks", 0, 6);
//						                        } else if (userInputValue <= stcks) {
//						                            r.add("Low Stocks");
//						                            table.setValueAt("Low Stocks", 0, 6); 
//						                        }
						                    }
						                
	 }
						                }
				
						
					}});
			
			add.setBounds(130, 280, 100, 30);
			add.setText("ADD");
			add.setFocusable(false);
			add.addActionListener(new ActionListener() {
				
				@Override
					public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		
					
					if (e.getSource()==add) {
					
						txtFields[6].setEnabled(true);
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
							txtFields[6].setText(" ");
						
				
					}

					

					if(e.getSource() == add){
					    addButtonClicked = true;
					    
					}
				
					
					
				//	table.clearSelection();
					
				}
				
				});
			

			edit.setBounds(240, 280, 100, 30);
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

							txtFields[5].setEditable(false);
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
			
			save2.setBounds(240, 280, 100, 30);
			save2.setText("Edit");
			save2.setFocusable(false);
			save2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if (e.getSource() == save2) {
					    try {
					        save.setEnabled(true);
					        cancel.setEnabled(true);
					        add.setEnabled(false);
					        stockin.setEnabled(false);
					        remove.setEnabled(false);
					        edit.setEnabled(false);

					        int row = table.getSelectedRow();
					        String stck = txtFields[6].getText();
					        int stcks = Integer.parseInt(stck.trim());

					        String stck1 = txtFields[5].getText();
					        int stcks1 = Integer.parseInt(stck1.trim());

					        for (int b = 0; b <= 3; b++) {
					            model.setValueAt(txtFields[b].getText(), row, b);
					        }

					        model.setValueAt(String.valueOf(stcks1), row, 4);
					        model.setValueAt(String.valueOf(stcks), row, 5);

					        if (stcks1 <= stcks) {
					            table.setValueAt("Low Stocks", row, 6);
					        } else if (stcks1 >= stcks) {
					            table.setValueAt("High Stocks", row, 6);
					        }

					        JOptionPane.showMessageDialog(null, "Item Successfully Edited!");
					        table.getSelectionModel().clearSelection();
					        add.setEnabled(true);
					        stockin.setEnabled(true);
					        remove.setEnabled(true);
					        edit.setEnabled(true);
					        save.setEnabled(true);
					        cancel.setEnabled(true);

					        cancel.setEnabled(false);
					        edit.setVisible(true);
					        save2.setVisible(false);

					        for (int i = 0; i <= txtFields.length - 1; i++) {
					            txtFields[i].setText("");
					            txtFields[i].setEditable(true);
					        }
					    } catch (Exception r) {
					        JOptionPane.showMessageDialog(null, "Re-Order Point must be number only.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
					    }
					

					   

					}
				}

					
			});
			
			remove.setBounds(20, 330, 100, 30);
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
			
			
			save.setBounds(130, 330, 100, 30);
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
					 Matcher m = p.matcher(txtFields[5].getText());
					 Pattern o = Pattern.compile("[A-Z, a-z, &%$#@!*^]");
					 Matcher n = o.matcher(txtFields[6].getText());
					
					 
					 if(e.getSource()==save) {
						 if(txtFields[0].getText().isBlank() || txtFields[1].getText().isBlank()  || txtFields[2].getText().isBlank()  || txtFields[3].getText().isBlank()  || txtFields[4].getText().isBlank()  || txtFields[5].getText().isBlank() ){
					    	JOptionPane.showMessageDialog(null,"Please fill out all the required fields ", "Input", JOptionPane.WARNING_MESSAGE);
					    	 save.setEnabled(true);
								cancel.setEnabled(true);
								add.setEnabled(true);
								stockin.setEnabled(false);
								remove.setEnabled(false);
								edit.setEnabled(false);
					 }
						 
							
						 
						 else if (m.find() && m.find()  ){
								JOptionPane.showMessageDialog(null,"Stocks and Re-order only have numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);			
								 save.setEnabled(false);
									cancel.setEnabled(true);
									add.setEnabled(false);
									stockin.setEnabled(false);
									remove.setEnabled(false);
									edit.setEnabled(false);
						 }
						 else if (n.find() && n.find()  ){
								JOptionPane.showMessageDialog(null,"Stocks and Re-order only have numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);			
								 save.setEnabled(false);
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
							
							else {
								
									
								
							}
						 
							r.add(txtFields[0].getText());
							r.add(txtFields[1].getText());
							r.add(txtFields[2].getText());
							r.add(txtFields[3].getText());
							r.add(txtFields[4].getText());
							r.add(txtFields[5].getText());
							r.add(txtFields[6].getText());

							
//							  model.setValueAt(txtFields[0].getText(), 0, 0);
							  
							
	
							  if (e.getSource() == save) {					
								   String stockStr = txtFields[5].getText();
								   String ro = txtFields[6].getText();
								   double stock = Double.parseDouble(stockStr);
								   double reorder = Double.parseDouble(ro);
								  
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

			cancel.setBounds(240, 330, 100, 30);
			cancel.setText("Cancel");
			cancel.setFocusable(false);
			cancel.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
//					if(e.getSource()==cancel)	{
//						int cancels =JOptionPane.showConfirmDialog(null, "Calculation Cancelled","",JOptionPane.YES_NO_OPTION);
//						if(cancels ==JOptionPane.YES_OPTION) {
//							JOptionPane.showMessageDialog(null,"");
//							setVisible(false);
//						
//							
//						}
//					}
					
					
					

					
					if (e.getSource() == cancel) {
						txtFields[5].setEnabled(true);
					    if (addButtonClicked) {
					    	txtFields[0].setText(decfor1.format(num1));
							
							num -=1;
					        int cancel1 = JOptionPane.showConfirmDialog(null, "Do you want to cancel all the inputs?", "Confirmation", JOptionPane.YES_NO_OPTION);
					        if (cancel1 == 0) {
//					            table.getSelectionModel().clearSelection();
					        	   int f = table.getSelectedRow();
									
									if(table.isRowSelected(f)) {
										
										model.removeRow(table.getSelectedRow());
										
									}
					            save.setEnabled(true);
					            cancel.setEnabled(true);
					            add.setEnabled(true);
					            stockin.setEnabled(true);
					            remove.setEnabled(true);
					            edit.setEnabled(true);
					            
					         
					            for (int i = 0; i <= txtFields.length - 1; i++) {
					                txtFields[i].setText("");
					                txtFields[1].setEnabled(true);
					                txtFields[2].setEnabled(true);
					                txtFields[3].setEnabled(true);
					                txtFields[4].setEnabled(true);
					                txtFields[5].setEnabled(true);
					                txtFields[6].setEnabled(true);
					            }
					            stockin.setEnabled(true);
					            cancel.setEnabled(false);
					            edit.setVisible(true);
					            save2.setVisible(false);
					        }
					        
					        addButtonClicked = false;
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
			tmtblProducts.getColumn(7).setPreferredWidth(150);
			
			
			
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
					
					int in = table.getSelectedRow();
					int columnCount = table.getColumnCount();

					if (in >= 0 && in < table.getRowCount()) {
					    for (int i = 0; i < columnCount-1; i++) {
					        txtFields[i].setText((String) table.getValueAt(in, i));
					    }
					} else {
					    
					    for (int i = 0; i < columnCount-1; i++) {
					        txtFields[i].setText("");
					    }
					}

					
//					table.setDefaultEditor(Object.class, null);
//					
//					
			}
				
			});
			item.setBounds(420, 20, 150, 30);
			item.setFont(new Font("Cambria", Font.PLAIN, 18));
			table.setRowSorter(sort);
			txtSearch.setBounds(530, 20, 450, 30);
			txtSearch.getDocument().addDocumentListener(new DocumentListener()
			{
			@Override
			public void insertUpdate(DocumentEvent e) {
			String str = txtSearch.getText();
			if (str.trim().length() == 0) {
			sort.setRowFilter(null);
			} else {
			//(?i) means case insensitive search
			sort.setRowFilter(RowFilter.regexFilter("(?i)" +
			str));
			}
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
			String str = txtSearch.getText();
			if (str.trim().length() == 0) {
			sort.setRowFilter(null);
			} else {
			sort.setRowFilter(RowFilter.regexFilter("(?i)" +
			str));
			}
			}
			@Override
			public void changedUpdate(DocumentEvent e) {}
			});
			
			tblPanel.setBounds(370, 70, 780, 300);
			tblPanel.setBackground(Color.white);
			tblPanel.add(scroll);
			
			this.add(item);
			this.add(tblPanel);
			this.add(stockin);
			this.add(add);
			this.add(edit);
			this.add(remove);
			this.add(save);
			this.add(cancel);
			this.add(save2);
			this.add(txtSearch);
			this.setLayout(null);
			this.setVisible(true);
				
			}
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}
	}

