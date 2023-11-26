package loginInvents;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PointOfSales extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;

    public PointOfSales() {
        // Create the table model with column names
        tableModel = new DefaultTableModel(new Object[]{"Item", "Quantity"}, 0);

        // Create the table with the model
        table = new JTable(tableModel);

        // Create the add button
        JButton addButton = new JButton("Add Item");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt for the item name
                String itemName = JOptionPane.showInputDialog("Enter item name:");
                if (itemName != null && !itemName.isEmpty()) {
                    // Add a new row with quantity 1
                    tableModel.addRow(new Object[]{itemName, 1});
                }
            }
        });

        // Create the remove button
        JButton removeButton = new JButton("Remove Item");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Get the current quantity
                    int currentQuantity = (int) tableModel.getValueAt(selectedRow, 1);
                    if (currentQuantity > 1) {
                        // Decrease the quantity by 1
                        tableModel.setValueAt(currentQuantity - 1, selectedRow, 1);
                    } else {
                        // Remove the row if quantity is 1
                        tableModel.removeRow(selectedRow);
                    }
                }
            }
        });

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        // Add the table and button panel to the frame
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set frame properties
        setTitle("Quantity Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuantityTableExample();
            }
        });
    }
}
