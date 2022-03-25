import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab15 extends JFrame{
    Lab15(){
        setSize(300,400);
        setLocation(500,500);
        setLayout(null);
        JLabel label = new JLabel("Число");
        label.setBounds(20,50,50,30);

        JTextField value = new JTextField("0");
        value.setEditable(false);
        value.setBounds(80,50,40,30);
        JButton buttonOne = new JButton("+1");
        buttonOne.setBounds(120,50,50,30);
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueFromTextField = value.getText();
                int a = Integer.parseInt(valueFromTextField);
                if(a<3){
                    a++;
                    value.setText(Integer.toString(a));
                }
            }
        });
        JButton buttonTwo = new JButton("-1");
        buttonTwo.setBounds(120,80,50,30);
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueFromTextField = value.getText();
                int a = Integer.parseInt(valueFromTextField);
                if(a>-5){
                    a--;
                    value.setText(Integer.toString(a));
                }
            }
        });
        add(label);
        add(value);
        add(buttonOne);
        add(buttonTwo);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab15();
    }
}
