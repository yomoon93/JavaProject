import java.awt.*;

public class Rectangle extends Shape implements Drawable{
    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int xCoor, int yCoor, String ranColor, int reclength, int recwidth) {
        super(xCoor, yCoor, ranColor);
            this.length = reclength;
            this.width = recwidth;
    }

    public Rectangle(int xCoor, int yCoor,int reclength, int recwidth) {
        super(xCoor, yCoor);
        this.length = reclength;
        this.width = recwidth;
    }
    public void draw(Graphics g){
    super.draw(g);
    g.setColor(Color.green);
//    g.fillRect(getX(),getY(),width,length);
        g.fill3DRect(getX(),getY(),width,length,true);
    g.drawRect(getX(),getY(),getWidth(),getLength());

    }
    public void circumference(){
        double circum;
        circum = 2 * (length* width);
        System.out.format("The circumference of the rectangle is: %.2f\n",circum);
    }
    public void area(){
        double area;
        area = length * width;
        System.out.format("The area of the rectangle is: %.2f\n",area);
    }

    public String toString(){
        return "The x coordinate: "+ x + " The y coordinate: " + y + " the color is: " + color + "The length is: " + length + "The width is: " + width;
    }

}
