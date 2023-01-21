import java.awt.*;

abstract public class Shape implements Drawable {
    int x, y;
    String color;


    public Shape(int xCoor, int yCoor, String ranColor){
        this.x = xCoor;
        this.y = yCoor;
        this.color = ranColor;
    }
    public Shape(int xCoor, int yCoor ){
        this.x = xCoor;
        this.y = yCoor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(Graphics x){

    }

    public void circumference(){


    }
    public void area(){

    }


    public String toString(){
        return "The x coordinate: "+ x + " The y coordinate: " + y + " the color is: " + color ;
    }
}
