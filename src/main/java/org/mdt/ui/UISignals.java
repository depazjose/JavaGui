package org.mdt.ui;

import org.mdt.components.RoundedButton;

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
        this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.X_AXIS));

        this.cardPanel = new JPanel();
        this.cardPanel.setBackground(Color.BLUE);

        fillCardPanel(this.cardPanel);

        this.ledPanel = new JPanel();
        this.ledPanel.setBackground(Color.black);

        fillLedPanel(this.ledPanel);

        this.mainPanel.add(this.cardPanel);
        this.mainPanel.add(this.ledPanel);
        this.getContentPane().add(mainPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setWidthPanel(this.ledPanel, 25, this.getWidth());
        setWidthPanel(this.cardPanel, 75, this.getWidth());
    }

    private void fillLedPanel(javax.swing.JPanel panel) {
        panel.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER, 10,10));
        //panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        Dimension dimensionButton = new Dimension(128, 128);
        redButton = new RoundedButton(dimensionButton);
        redButton.setBackground(Color.red);
        panel.add(redButton);
        yellowButton = new RoundedButton(dimensionButton);
        yellowButton.setBackground(Color.yellow);
        panel.add(yellowButton);
        greenButton = new RoundedButton(dimensionButton);
        greenButton.setBackground(Color.green);
        panel.add(greenButton);
    }

    private void fillCardPanel(javax.swing.JPanel panel) {

    }

    private void setWidthPanel(javax.swing.JPanel panel, int percentage, int totalWidth) {
        Dimension size = panel.getPreferredSize();
        int newWidth = ((percentage * totalWidth) / 100);
        panel.setMinimumSize(new Dimension(newWidth, size.height));
        panel.setPreferredSize(new Dimension(newWidth, size.height));
    }

    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel ledPanel;
    private RoundedButton redButton;
    private RoundedButton yellowButton;
    private RoundedButton greenButton;

}
