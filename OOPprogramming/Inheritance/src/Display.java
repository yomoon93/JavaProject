import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class Display {
    static List<Drawable> myList = new ArrayList<Drawable>();

    private static JPanel canvas;

    public static void main(String[] a) {
        initGUI();


    }



    private static void drawAllShapes(Graphics g) {
        //TODO: Implement me

        Circle myCircle = new Circle(4,8,"red", 250);
        Rectangle myRectangle = new Rectangle(4, 8,"green", 400, 500 );
        BankAccount myBankAccount = new BankAccount(10000, 4241993, 250,300);
        myList.add(myCircle);
        myList.add(myRectangle);
        myList.add(myBankAccount);
        for(Drawable x : myList){
            x.draw(g);
        }

    }

    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics g) {
                drawAllShapes(g);
            }
        };
        canvas.setPreferredSize(new Dimension(500,500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}