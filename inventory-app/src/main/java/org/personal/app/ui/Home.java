package org.personal.app.ui;

import javax.swing.*;
import java.awt.*;

public class Home {
    private JPanel rootPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JButton inventoryButton;
    private JButton salesButton;
    private JButton summaryButton;
    private JButton itemsButton;

    // Inventory
    private JPanel inventoryPanel;
    private JScrollPane inventoryTablePanel;
    private JTable inventoryTable;
    private JPanel inventoryActionsPanel;
    private JButton addStockButton;
    private JButton viewStockHistoryButton;

    public Home() {
        setupGUI();
    }

    public JPanel getRootPanel() {
        return this.rootPanel;
    }

    private void setupGUI() {
        createLeftPanel();
    }

    // LEFT PANEL
    private void createLeftPanel() {
        // Creates a right border
        leftPanel.setBorder(BorderFactory.createMatteBorder(0,0,0,1, Color.LIGHT_GRAY));
    }
}
