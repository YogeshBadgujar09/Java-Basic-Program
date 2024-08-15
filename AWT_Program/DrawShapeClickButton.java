import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawShapeClickButton extends JPanel {
    private int shapeType = 1; // 1 = rectangle, 2 = circle, 3 = triangle

    public DrawShapeClickButton() {
        setBackground(Color.WHITE);
        JButton rectButton = new JButton("Rectangle");
        rectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeType = 1;
                repaint();
            }
        });

        JButton circleButton = new JButton("Circle");
        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeType = 2;
                repaint();
            }
        });

	 JButton triButton = new JButton("Triangle");
	        triButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                shapeType = 3;
	                repaint();
	            }
	        });

	        JFrame frame = new JFrame("Shape GUI");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(this);
	        frame.add(rectButton, BorderLayout.NORTH);
	        frame.add(circleButton, BorderLayout.CENTER);
	        frame.add(triButton, BorderLayout.SOUTH);
	        frame.setSize(600, 300);
	        frame.setVisible(true);
	    }

 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (shapeType) {
            case 1:
                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 50);
                break;
            case 2:
                g.setColor(Color.BLUE);
                g.fillOval(200, 50, 100, 100);
                break;
            case 3:
                g.setColor(Color.GREEN);
                int[] xPoints = {350, 400, 450};
                int[] yPoints = {50, 150, 50};
                g.fillPolygon(xPoints, yPoints, 3);
                break;
        }
    }

    public static void main(String[] args) {
        new DrawShapeClickButton();
    }
}
