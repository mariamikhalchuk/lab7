import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.*;

public class Panel extends JFrame implements ActionListener {

    String[] menu = {"Завтрак","Обед","Ужин"};
    JComboBox dropdown;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox checkBox4;


    public Panel() {
        super("Меню - Столовая №12");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        // Main label
        JLabel mainTitle = new JLabel("МЕНЮ", CENTER);
        mainTitle.setFont(new Font("Sans", Font.BOLD, 36));
        mainTitle.setBounds(0, 10, 600, 50);
        panel.add(mainTitle);
        // Main label
        JLabel subTitle = new JLabel("СТОЛОВАЯ №12", CENTER);
        subTitle.setFont(new Font("Sans", Font.BOLD, 14));
        subTitle.setBounds(0, 60, 600, 20);
        panel.add(subTitle);
        // Combobox
        dropdown = new JComboBox(menu);
        dropdown.setBounds(100, 100, 100, 30);
        dropdown.addActionListener(this);
        panel.add(dropdown);
        // CheckBox 1
        checkBox1 = new JCheckBox("Каша - 1 руб");
        checkBox1.setBounds(100, 130, 200,50);
        panel.add(checkBox1);
        // CheckBox 2
        checkBox2 = new JCheckBox("Яйцо - 10 коп");
        checkBox2.setBounds(100, 160, 200, 50);
        panel.add(checkBox2);
        // CheckBox 3
        checkBox3 = new JCheckBox("Кефир - 5 коп");
        checkBox3.setBounds(100,190, 200, 50);
        panel.add(checkBox3);
        // CheckBox 4
        checkBox4 = new JCheckBox("Яблоко - 30 коп");
        checkBox4.setBounds(100, 220, 200, 50);
        panel.add(checkBox4);
        // Text area
        JTextArea text = new JTextArea("Пожелания");
        text.setBounds(110,300, 200,80);
        panel.add(text);
        // Submit button
        JButton button = new JButton("СДЕЛАТЬ ЗАКАЗ");
        button.setBounds(200, 450, 200, 50);
        panel.add(button);
        //
        setContentPane(panel);
        setSize(600, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox dd = (JComboBox)e.getSource();
        String menu = (String)dd.getSelectedItem();
        updateMenu(menu);

    }

    private void updateMenu(String menu) {
        switch (menu) {
            case ("Завтрак"):
                checkBox1.setText("Каша - 1 руб");
                checkBox2.setText("Яйцо - 10 коп");
                checkBox3.setText("Кефир - 5 коп");
                checkBox4.setText("Яблоко - 30 коп");
                break;
            case ("Обед"):
                checkBox1.setText("Суп - 1 руб");
                checkBox2.setText("Пюре - 50 коп");
                checkBox3.setText("Котлета - 2 руб");
                checkBox4.setText("Компот - 60 коп");
                break;
            case ("Ужин"):
                checkBox1.setText("Творог - 1 руб");
                checkBox2.setText("Банан - 50 коп");
                checkBox3.setText("Булочка - 1 руб");
                checkBox4.setText("Кисель - 60 коп");
                break;
        }
    }
}
