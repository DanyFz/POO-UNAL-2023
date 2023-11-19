/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);

        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);

        piramide = new JButton();
        piramide.setText("Pirámide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        }
    }
}
