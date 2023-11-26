//package InventoryActivity;

//lako me panga comment int package nung gamitan me, kinoment ke kasi eya mag run keng cmd pag eya maka comment



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
@SuppressWarnings("serial")
public class subClassFrame extends JFrame{
//this will create a new Panel with BorderLayout------------{
	JPanel tblPanel = new JPanel(new BorderLayout());
	
//tableProperties--------------------------------------------------------------------------------------------------------------
	String [] column = new String []{"Item Code","Item Description","Price","Size", "Stocks.","Re-Order Point" ,	"Remarks"};
	String [][] row = new String [][] {};
	
//Parts Of Table---------------------------------------------------------------------------------------------------------------
	DefaultTableModel model = new DefaultTableModel(row, column);
	JTable table = new JTable(model);
	JScrollPane scroll = new JScrollPane(table);
	Vector <String> r = new Vector <String> ();	
//}
	
//labels-----------------------------------------------------------------------------------------------------------------------
	
	JLabel [] lblFields = new JLabel[6];
	String [] strLblFields = {"Item Code : ", "Item Description : ", "Price : ", "Size", "Stocks : ", "Re-Order Point : "};
	
//text box---------------------------------------------------------------------------------------------------------------------
	
	JTextField [] txtFields = new JTextField[6];
	DecimalFormat decfor = new DecimalFormat("00000");
	
//Buttons----------------------------------------------------------------------------------------------------------------------
	JButton [] buttons = new JButton[3];
	JButton [] button = new JButton[3];
	String [] btnlabels = {"Stock in","Add","Edit"};
	String [] btnlabel = {"Remove","Save","Cancel"};
	int num = 1;
	JButton save2 = new JButton();
	/*JButton stockin  = new JButton();
	JButton add = new JButton();
	JButton edit= new JButton();
	JButton remove = new JButton();
	JButton save = new JButton();
	JButton cancel = new JButton();
	
	int num = 1;*/
	
	
	subClassFrame(){
		
//FrameProperties--------------------------------------------------------------------------------------------------------------
		
		this.setTitle("Inventory");
		this.setSize(1100, 450);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
//This loop will set the properties of JTextField , JLabel -------------------------------------------------------------------
		int y =50;
		for(int i = 0; i <= lblFields.length-1 ; i++) {
//properties of JTextField ---------------------------------------------------------------------------------------------------
			txtFields[i] = new JTextField();
			txtFields[i].setBounds(180, y, 150, 25);
			this.add(txtFields[i]);
			txtFields[i].setEditable(false);
//properties of JLabel--------------------------------------------------------------------------------------------------------
			lblFields[i] = new JLabel();
			lblFields[i].setText(strLblFields[i]);
			lblFields[i].setBounds(50, y, 150, 25);
			this.add(lblFields[i]);
			y += 30;
		}

//Table-----------------------------------------------------------------------------------------------------------------------	
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
		table.setDefaultEditor(Object.class, null);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub

			int rows = table.getSelectedRow();
			if(rows == -1){
				
			}

			else{
				for(int i =0; i<=txtFields.length-1; i++){
					txtFields[i].setText((String) table.getValueAt(rows,i));
				
				}
			}
								
		}	
		});
		
//panel------------------------------------------------------------------------------------------------------------------------		
		tblPanel.setBounds(350, 20, 720, 370);
		tblPanel.setBackground(Color.white);
		tblPanel.add(scroll);

//Buttons----------------------------------------------------------------------------------------------------------------------

		int x=50;
		for(int i = 0; i <= buttons.length-1 ; i++) {

			buttons[i] = new JButton();
			buttons[i].setText(btnlabels[i]);
			buttons[i].setBounds( x,250, 80, 30);
			buttons[i].setFocusable(false);
			this.add(buttons[i]);
			//y += 30;
			x +=90;
		}
		int z=50;
		for(int i = 0; i <= button.length-1 ; i++) {
			
			button[i] = new JButton();
			button[i].setText(btnlabel[i]);
			button[i].setBounds( z,300, 80, 30);
			button[i].setFocusable(false);
			this.add(button[i]);
			//y += 30;
			z +=90;
		}
		
		button[1].setEnabled(false);
		button[2].setEnabled(false);
		
//Stock in Process ------------------------------------------------------------------------------------------------------------------		
		buttons[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selected = table.getSelectedRow();

			if(selected == -1){
				JOptionPane.showMessageDialog(null, "Select row and try again.", "No row selected", JOptionPane.WARNING_MESSAGE);
			}

			else{

				try{
					String fours = table.getValueAt(selected,4).toString();
					String fives = JOptionPane.showInputDialog("Enter Stocks:");
					
					int intfours = Integer.parseInt(fours);
					int intfives = Integer.parseInt(fives);
					int inttotal = intfives + intfours;

					JOptionPane.showMessageDialog(null, "Stocks Added");
					model.setValueAt(String.valueOf(inttotal), selected,4);
					String val = table.getValueAt(selected,5).toString();


					if(intfives>Integer.parseInt(val)){
						model.setValueAt("High Stock", selected,6);
					}

					else if(intfives == Integer.parseInt(val)){
						model.setValueAt("Low Stock", selected,6);
					}

					else if(intfives<Integer.parseInt(val)){
						model.setValueAt("Low Stock", selected,6);
					}


					for(int a=0; a<=txtFields.length-1; a++){
						txtFields[a].setText("");
				
					}

					table.getSelectionModel().clearSelection();

				}


				catch(Exception jm){
					JOptionPane.showMessageDialog(null, "Enter number on stocks. Please try again", "Input Error", JOptionPane.WARNING_MESSAGE);
					table.getSelectionModel().clearSelection();
					for(int i=0; i<=txtFields.length-1; i++){
						txtFields[i].setText("");
				
					}
				}


			}

			}
		});
		
//add Process ------------------------------------------------------------------------------------------------------------------		
		buttons[1].addActionListener(new ActionListener() {
			
			@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	
				r = new Vector<String>();
				if (e.getSource()==buttons[1]) {						
				txtFields[0].setText(decfor.format(num));	
				num ++;
				}
				 
					
				
				if(e.getSource()==buttons[1]) {
					buttons[0].setEnabled(false);
					buttons[1].setEnabled(false);
					buttons[2].setEnabled(false);
					
					button[0].setEnabled(false);
					button[1].setEnabled(true);
					button[2].setEnabled(true);
				
				}
				
				
				if(e.getSource()==buttons[1]) {
						txtFields[1].setText("");						
						txtFields[2].setText("");
						txtFields[3].setText("");
						txtFields[4].setText("");
						txtFields[5].setText("");
						
						txtFields[1].setEditable(true);
						txtFields[2].setEditable(true);
						txtFields[3].setEditable(true);
						txtFields[4].setEditable(true);
						txtFields[5].setEditable(true);
				}	
			}
			
			});
		
//edit Process ------------------------------------------------------------------------------------------------------------------		
			buttons[2].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==buttons[2]) {
						buttons[1].setEnabled(false);
						buttons[0].setEnabled(false);
						button[0].setEnabled(false);
						buttons[2].setEnabled(false);
						button[1].setEnabled(true);
						button[2].setEnabled(true);

					}
					
				if(e.getSource() == buttons[2]){

						if(table.getSelectedRow() == -1){
							JOptionPane.showMessageDialog(null,"Select row to edit.");
							buttons[0].setEnabled(true);
						buttons[1].setEnabled(true);
						buttons[2].setEnabled(true);
					
						button[0].setEnabled(true);
						button[1].setEnabled(false);
						button[2].setEnabled(false);
						}

						else{

							for(int a=0; a<=txtFields.length-1;a++){
								txtFields[a].setEditable(true);
							}

							txtFields[4].setEditable(false);
							save2.setVisible(true);
							buttons[2].setVisible(false);
							
							
							buttons[0].setEnabled(false);
							buttons[1].setEnabled(false);
							buttons[2].setEnabled(false);

							button[0].setEnabled(false);
							button[1].setEnabled(false);
							button[2].setEnabled(true);

						}
					}
				}});
			

			save2.setBounds(230, 250, 80, 30);
			save2.setText("Save");
			save2.setFocusable(false);
			save2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

				try{

				 if(txtFields[0].getText().isBlank() || txtFields[1].getText().isBlank() || txtFields[2].getText().isBlank() || txtFields[3].getText().isBlank() || txtFields[4].getText().isBlank() || txtFields[5].getText().isBlank()){
		    		JOptionPane.showMessageDialog(null,"Fill up the fields correctly.");		    	
		    		}


		    	else{
				int rows = table.getSelectedRow();
				int fours = Integer.parseInt(txtFields[4].getText());
				int fives = Integer.parseInt(txtFields[5].getText());

				

				for(int i=0; i<= 3; i++){

					model.setValueAt(txtFields[i].getText(), rows, i);
				}

				model.setValueAt(String.valueOf(fours), rows, 4);
				model.setValueAt(String.valueOf(fives), rows, 5);


					if(fours<fives){
						model.setValueAt("Low Stock", rows,6);
					}

					else if(fours>fives){
						model.setValueAt("High Stock", rows,6);
					}

					JOptionPane.showMessageDialog(null,"Row Edited.");
					table.getSelectionModel().clearSelection();


					button[1].setEnabled(false);
					button[2].setEnabled(false);
					buttons[1].setEnabled(true);
				    buttons[0].setEnabled(true);
				    button[0].setEnabled(true);
				    buttons[2].setEnabled(true);

				    save2.setVisible(false);
				    buttons[2].setVisible(true);
					

					for(int i=0; i<=txtFields.length-1; i++){
					txtFields[i].setText("");
					txtFields[i].setEditable(false);
					}
				}

			}
			catch(Exception v){
				JOptionPane.showMessageDialog(null,"Enter number on stocks and re-order point.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
					
			}
					
				}
			});

			
//remove Process ------------------------------------------------------------------------------------------------------------------				
			button[0].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==button[0]) {
						int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete",JOptionPane.YES_NO_OPTION);
						if(cancels ==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null,"Item Successfully Deleted");
							
			                    
			                     int i = table.getSelectedRow();
									
									if(table.isRowSelected(i)) {
										
										model.removeRow(table.getSelectedRow());
										
							}
						}
					}
					
				}
				
			});
//Save Process ------------------------------------------------------------------------------------------------------------------		
			button[1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
			if(txtFields[0].getText().isBlank() || txtFields[1].getText().isBlank() || txtFields[2].getText().isBlank() || txtFields[3].getText().isBlank() || txtFields[4].getText().isBlank() || txtFields[5].getText().isBlank()){
		    	JOptionPane.showMessageDialog(null,"Invalid/Empty inputs. Please try again.");		    	
		    }

			 else if(txtFields[0].getText().equals("") || txtFields[1].getText().equals("") || txtFields[2].getText().equals("") || txtFields[3].getText().equals("") || txtFields[4].getText().equals("") || txtFields[5].getText().equals("")){
		    	JOptionPane.showMessageDialog(null,"Invalid/Empty inputs. Please try again.");		    	
		    }


			 else if(txtFields[0].getText().isEmpty() || txtFields[1].getText().isEmpty() || txtFields[2].getText().isEmpty() || txtFields[3].getText().isEmpty() || txtFields[4].getText().isEmpty() || txtFields[5].getText().isEmpty()){
		    	JOptionPane.showMessageDialog(null,"Invalid/Empty inputs. Please try again.");		    	
		    }

		   

		    else{


				try{
					int int1 = Integer.parseInt(txtFields[4].getText());
					int int2 = Integer.parseInt(txtFields[5].getText());

					for(int cc=0; cc<=3; cc++){
					r.add(txtFields[cc].getText());
					}

				r.add(String.valueOf(int1));
				r.add(String.valueOf(int2));


				int dialog = JOptionPane.showConfirmDialog(null, "Do you want to save the row?", "Saving", JOptionPane.YES_NO_OPTION);
				 
				if(dialog == 0){

					if(int1<int2){
						r.add("Low Stock");
					}

					else if(int1==int2){
						r.add("Low Stock");
					}

					else if(int1>int2){
						r.add("High Stock");
					}


					model.addRow(r);
					
					JOptionPane.showMessageDialog(null,"Row Added");
					table.getSelectionModel().clearSelection();

					for(int a=0; a<=txtFields.length-1; a++){
						txtFields[a].setText("");
						txtFields[a].setEditable(false);
					}



					button[1].setEnabled(false);
					button[2].setEnabled(false);
					buttons[1].setEnabled(true);
				    buttons[0].setEnabled(true);
				    button[0].setEnabled(true);
				    buttons[2].setEnabled(true);
					

	 			
			}

				}
				catch(Exception m){
					JOptionPane.showMessageDialog(null,"Please enter number on stocks and re-order point.", "Unsupported Input", JOptionPane.WARNING_MESSAGE);
					
				}

			}

				//	
				}
				
			});
		
		
			button[2].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==button[2])	{
						int cancels =JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all the data?","Cancel",JOptionPane.YES_NO_OPTION);
						if(cancels ==0) {
							JOptionPane.showMessageDialog(null,"this will remove all the data you input");
							
						buttons[0].setEnabled(true);
						buttons[1].setEnabled(true);
						buttons[2].setEnabled(true);
					
						button[0].setEnabled(true);
						button[1].setEnabled(false);
						button[2].setEnabled(false);
						save2.setVisible(false);
						buttons[2].setVisible(true);

							
						}
					}
					
				}
				
			});
		
//add to frame------------------------------------------------------------------------------------------------------------------
		
	
		this.add(tblPanel);
		this.add(save2);
		this.setLayout(null);
		this.setVisible(true);	
		
	}
}
