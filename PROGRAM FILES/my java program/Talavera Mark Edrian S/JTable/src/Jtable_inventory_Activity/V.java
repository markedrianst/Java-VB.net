package Jtable_inventory_Activity;

public class V {
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
save2.setText("Edit");
save2.setFocusable(false);
save2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == save2){
		    Pattern p = Pattern.compile("^^[A-Za-z&%$#@!*^0-9]+$");
		    Matcher n = p.matcher(txtFields[5].getText());
		    if (n.matches() || n.matches()) {
		        JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid Input", JOptionPane.ERROR_MESSAGE);
		        save.setEnabled(true);
		        cancel.setEnabled(true);
		        add.setEnabled(false);
		        stockin.setEnabled(false);
		        remove.setEnabled(false);
		        edit.setEnabled(false);
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
		        add.setEnabled(true);
		        stockin.setEnabled(true);
		        remove.setEnabled(true);
		        edit.setEnabled(true);
		        save.setEnabled(true);
		        cancel.setEnabled(true);
		        
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
});
}
