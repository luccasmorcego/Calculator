import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainCalculadora {
    private JTextField painel;
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

    public String valorSinal = "0";
    public String valor1 = "0";

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new mainCalculadora().Calculadora);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public void teste(int x){
        painel.setText(painel.getText()+ x);//add numero no visor
    }

    public void sinais(String sinal) {
        valor1 = painel.getText(); //guarda o valor atual do visor
        painel.setText(sinal); // limpa o visor e coloca o sinal no lugar
        valorSinal = sinal; // guarda o sinal da operação
    }
    public void resultado(){

        int result = 0;

        if (valorSinal.equals("+")){
            result = Integer.parseInt(valor1) + Integer.parseInt(painel.getText());
            painel.setText( String.valueOf(result));
        }

        if (valorSinal.equals("-")){
            result = Integer.parseInt(valor1) - Integer.parseInt( painel.getText().substring(1) );
            painel.setText( String.valueOf(result));
        }

        if (valorSinal.equals("*")){
            result = Integer.parseInt(valor1) * Integer.parseInt( painel.getText().substring(1) );
            painel.setText( String.valueOf(result));
        }

        if (valorSinal.equals("/")){
            result = Integer.parseInt(valor1) / Integer.parseInt( painel.getText().substring(1) );
            painel.setText( String.valueOf(result));
        }


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
                painel.setText("");
                valor1 = "0";
                valorSinal = "0";

            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado();
            }
        });
        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("+");
            }
        });

        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("-");
            }
        });

        btnVezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("*");
            }
        });

        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinais("/");
            }
        });



    }
}
