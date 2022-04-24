/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatro.controlador;
import teatro.view.form;
import teatro.model.modelado;

import teatro.model.modelado;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
/**
 *
 * @author acamposl
 */
public class controlador implements MouseListener, KeyListener, ActionListener {
    
    Model modelado;
    View form;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        view.setModel(model);
        view.setController(this);
    }

    // MouseListener Interface
    @Override
    public void mouseClicked(MouseEvent e) {
        JButton digit = (JButton) e.getSource();
        model.digit(digit.getText().charAt(0));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
