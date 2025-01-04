import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class SimpleFoodSupplyChain extends Frame {
    private TextField itemNameField, quantityField;
    private TextArea inventoryArea, notificationArea;
    private Map<String, Integer> inventory = new HashMap<>();

    public SimpleFoodSupplyChain() {
        setTitle("Simple Inventory Management");
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Input fields
        add(new Label("Item Name:"));
        itemNameField = new TextField(20);
        add(itemNameField);

        add(new Label("Quantity:"));
        quantityField = new TextField(20);
        add(quantityField);

        // Buttons
        Button addItemButton = new Button("Add/Update Item");
        addItemButton.addActionListener(e -> addItem());
        add(addItemButton);

        Button checkStockButton = new Button("Check Stock");
        checkStockButton.addActionListener(e -> checkLowStock());
        add(checkStockButton);

        // Inventory display
        inventoryArea = new TextArea("Inventory:\n", 10, 35, TextArea.SCROLLBARS_VERTICAL_ONLY);
        inventoryArea.setEditable(false);
        add(inventoryArea);

        // Notifications display
        notificationArea = new TextArea("Notifications:\n", 5, 35, TextArea.SCROLLBARS_VERTICAL_ONLY);
        notificationArea.setEditable(false);
        add(notificationArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void addItem() {
        String itemName = itemNameField.getText().trim();
        String quantityText = quantityField.getText().trim();

        if (itemName.isEmpty() || quantityText.isEmpty()) {
            showNotification("Please fill in both fields!");
            return;
        }

        try {
            int quantity = Integer.parseInt(quantityText);
            if (quantity <= 0) {
                showNotification("Quantity must be greater than zero!");
                return;
            }

            // Update inventory
            inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
            updateInventoryDisplay();
            showNotification("Item added/updated successfully!");

            // Clear input fields
            itemNameField.setText("");
            quantityField.setText("");

        } catch (NumberFormatException e) {
            showNotification("Quantity must be a valid number!");
        }
    }

    private void checkLowStock() {
        StringBuilder notifications = new StringBuilder("Low Stock Items:\n");
        boolean found = false;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() < 10) {
                notifications.append(entry.getKey()).append(" (").append(entry.getValue()).append(" units)\n");
                found = true;
            }
        }

        if (!found) {
            notifications.append("All items are sufficiently stocked.");
        }

        notificationArea.setText(notifications.toString());
    }

    private void updateInventoryDisplay() {
        StringBuilder inventoryText = new StringBuilder("Inventory:\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            inventoryText.append(entry.getKey()).append(": ").append(entry.getValue()).append(" units\n");
        }
        inventoryArea.setText(inventoryText.toString());
    }

    private void showNotification(String message) {
        notificationArea.setText("Notifications:\n" + message);
    }

    public static void main(String[] args) {
        new SimpleFoodSupplyChain();
    }
}