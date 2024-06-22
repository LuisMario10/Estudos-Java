package wiew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectGUI extends JFrame implements ActionListener {
    private JTextField nameProductText;
    private JTextField priceText;
    private JTextField quantityText;
    private JCheckBox isPromotion;
    private final JButton buttonConfirm;
    public ProjectGUI() {
        setSize(420,  300);
        setTitle("Gerenciamento de Produtos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        buttonConfirm = button("Confirm");
    }

    private JButton button(String text) {
        JButton b = new JButton();
        b.setBackground(new Color(50, 200, 0));
        b.setForeground(new Color(0, 255, 255));
        b.setText(text);
        b.addActionListener(this);
        add(buttonConfirm);
        b.setFont(new Font("arial", Font.BOLD, 24));
        return b;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}