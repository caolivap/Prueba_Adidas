package com.devco.adidas;

import com.devco.adidas.utils.Ejecutar;

import javax.swing.*;

public class Frame extends JFrame {
    private JButton ejecutarRunnerButton;
    private JPanel rootPanel;
    private JComboBox comboBoxRunner;
    private JLabel labelRunner;
    private String opcionRunner;

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(rootPanel);
        pack();
        llenarCombobox();
        opcionRunner = comboBoxRunner.getSelectedItem().toString();
        ejecutarRunnerButton.addActionListener(actionEvent -> Ejecutar.enCmd(opcionRunner));
        setVisible(true);
    }

    private void llenarCombobox(){
        comboBoxRunner.addItem("BusquedaTenisAdidasRunner");
    }
}
