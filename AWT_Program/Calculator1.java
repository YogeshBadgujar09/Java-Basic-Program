
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator1 {
    private JFrame frame;
    private JTextField display;

    public Calculator1() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(new ButtonListener());
            panel.add(jButton);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("=")) {
                try {
                    double result = eval(display.getText());
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else {
                display.setText(display.getText() + command);
            }
        }

        private double eval(String expression) {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if      (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if      (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    double x;
                    int startPos = pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, pos));
                    } else if (ch >= 'a' && ch <= 'z') { // functions
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = expression.substring(startPos, pos);
                        x = parseFactor();
                        if (func.equals("sqrt")) x = Math.sqrt(x);
                        else throw new RuntimeException("Unknown function: " + func);
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    return x;
                }
            }.parse();
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}


