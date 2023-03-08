import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{


    private JTextField valueField;
    private JPanel calculator;
    private JButton bt7;
    private JButton bt4;
    private JButton bt8;
    private JButton bt5;
    private JButton bt9;
    private JButton btDivide;
    private JButton bt6;
    private JButton btMult;
    private JButton btPlus;
    private JButton btMinus;
    private JButton bt3;
    private JButton bt2;
    private JButton bt0;
    private JButton bt1;
    private JButton btClear;
    private JButton btResult;

    //needed variables for arithmetic operations
    double num;
    double ans;

    int calculation;

    // method for operation cases
    public void operations(){

        switch (calculation) {
            case 1 -> { //Addition ++
                ans = num + Double.parseDouble(valueField.getText());
                valueField.setText(Double.toString(ans));
            }
            case 2 -> { //subtraction --
                ans = num - Double.parseDouble(valueField.getText());
                valueField.setText(Double.toString(ans));
            }
            case 3 -> { //Division //
                ans = num * Double.parseDouble(valueField.getText());
                valueField.setText(Double.toString(ans));
            }
            case 4 -> { //multiplication
                ans = num / Double.parseDouble(valueField.getText());
                valueField.setText(Double.toString(ans));
            }
        }
    }

    //constructor
    public MainFrame(){
        setTitle("Willkommen");
        setSize(400, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(calculator);
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText("");
            }
        });
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "0");
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "1");
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "2");
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "3");
            }
        });
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "4");
            }
        });
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "5");
            }
        });
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "6");
            }
        });
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "7");
            }
        });
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "8");
            }
        });
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "9");
            }
        });
        btDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "/");
            }
        });
        btMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "*");
            }
        });
        btPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "+");
                num = Double.parseDouble(valueField.getText());
                calculation =1;

            }
        });
        btMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueField.setText(valueField.getText() + "-");
            }
        });
        btResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations();
            }
        });
    }

}


