import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainCalculadora {
    private JTextField txtResultado;
    private JButton btn4;
    private JButton btnMais;
    private JButton btn5;
    private JButton btn8;
    private JButton btn7;
    private JButton btnMenos;
    private JButton btnVezes;
    private JButton btn9;
    private JButton btn6;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn0;
    private JButton btnClean;
    private JButton btnIgual;
    private JButton btnDivisao;
    private JPanel Calculadora;

    public static void main(String[] args) {
        JFrame calculadora = new JFrame("MyCalculator");
        calculadora.setContentPane(new mainCalculadora().Calculadora);
        calculadora.pack();
        calculadora.setSize(500, 500);
        calculadora.setVisible(true);
    }

    public void teste(int x){
        txtResultado.setText(txtResultado.getText()+ x);
    }

    public mainCalculadora(){
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(1);

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(2);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(3);

            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(4);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(5);

            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(6);

            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(7);

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(8);

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(9);

            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teste(0);

            }
        });
        btnClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText("");

            }
        });

    }
}
