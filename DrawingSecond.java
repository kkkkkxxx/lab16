package lab16;
import javax.swing.*;
import java.awt.*;

public class DrawingSecond extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillOval(100,100,200,200);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("My drawing");
        DrawingSecond draw = new DrawingSecond();
        draw.setSize(400,400);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }
}
