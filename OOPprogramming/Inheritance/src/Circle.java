import java.awt.*;
import java.lang.Math;
public class Circle extends Shape implements Drawable{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics x){
        super.draw(x);
        x.setColor(Color.green);
//        x.fillOval(getX(),getY(),radius,radius);

        x.drawOval(getX(),getY(),getRadius(), getRadius());

    }

    public Circle(int xCoor, int yCoor, String ranColor, int radius) {
        super(xCoor, yCoor, ranColor);
        this.radius = radius;
    }

    public Circle(int xCoor, int yCoor, int radius) {
        super(xCoor, yCoor);
        this.radius = radius;
    }


    public void circumference(){
        double circum;
        circum = Math.PI * (2*radius);
        System.out.format("The circumference of the circle is: %.2f\n",circum);
    }
    public void area(){
        double area;
        area = Math.PI * radius * radius;
        System.out.format("The area of the circle is: %.2f\n",area);
    }


    public String toString(){
        return "The x coordinate: "+ x + " The y coordinate: " + y + " the color is: " + color + "the radius is: " + radius;
    }


}
