import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame {
    Calculator(String s) {
        super(s);
        setSize(400, 600);
        setLayout(new FlowLayout());

        Label labelA = new Label("a");
        Label labelP = new Label("+");
        Label labelB = new Label("b");
        Label labelD = new Label("=");
        Label labelS = new Label("sum");
        TextField textFieldA = new TextField();
        TextField textFieldB = new TextField();
        TextField textFieldS = new TextField();
        Button buttonA = new Button("Calculate");
        Button buttonB = new Button("Clear");
        add(labelA);
        add(labelP);
        add(labelB);
        add(labelD);
        add(labelS);
        add(textFieldA);
        add(textFieldB);
        add(textFieldS);
        add(buttonA);
        add(buttonB);
        setVisible(true);
        

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        
            private void buttonB(java.awt.event.ActionEvent e){
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldS.setText("");
                
            }
            private void buttonA(java.awt.event.ActionEvent e){
                float num1, num2, result;
                num1 = Float.parseFloat(textFieldA.getText());
                num2 = Float.parseFloat(textFieldB.getText());
                result = num1+num2;
                textFieldS.setText(String.valueOf(result));
        }
        });

        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(textFieldA.getText());
                num2 = Float.parseFloat(textFieldB.getText());
                String valueFromTextField = labelB.getText();
                result = num1+num2;
                textFieldS.setText(String.valueOf(result));
            }
        });
        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldS.setText("");
            }
        });
    }
    public static void main(String[] args){
        new Calculator("Sum of two digits");
    }

}