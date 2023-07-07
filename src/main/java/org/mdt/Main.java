package org.mdt;

import org.mdt.ui.UISignals;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        showMainFrame();
    }

    public static void showMainFrame() {
        UISignals uiSignals = new UISignals(new Dimension(800, 480));
        uiSignals.setLocationRelativeTo(null);
        uiSignals.setVisible(true);
    }
}