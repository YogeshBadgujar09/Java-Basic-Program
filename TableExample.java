


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a new table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("City");

        // Add data to the table model
        tableModel.addRow(new Object[]{"John Doe", 30, "New York"});
        tableModel.addRow(new Object[]{"Jane Doe", 25, "Los Angeles"});
        tableModel.addRow(new Object[]{"Bob Smith", 40, "Chicago"});

        // Create a new JTable
        JTable table = new JTable(tableModel);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the frame size
        frame.setSize(400, 300);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}