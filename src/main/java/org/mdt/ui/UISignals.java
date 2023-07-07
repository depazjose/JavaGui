package org.mdt.ui;

import javax.swing.*;
import java.awt.*;

public class UISignals extends JFrame {

    private final Dimension dimension;
    public UISignals(Dimension minSize) {
      this.dimension = minSize;
      this.setComponents();
    }

    private void setComponents() {
        this.setMinimumSize(this.dimension);
        this.setPreferredSize(this.dimension);
        this.mainPanel = new JPanel();
        this.mainPanel.setBackground(Color.YELLOW);
        this.getContentPane().add(mainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private javax.swing.JPanel mainPanel;
}
