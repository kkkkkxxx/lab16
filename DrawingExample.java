package lab16;
import java.awt.*;
import javax.swing.JFrame;

public class DrawingExample extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My drawing");
        Canvas canvas = new DrawingExample();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillOval(100,100,200,200);
    }
}
