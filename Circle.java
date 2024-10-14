
public class Circle {

    double radius;
    String color;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() { //getter method
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newradius) {//settter method
        this.radius = newradius;
    }

    public void setColor(String newcolor) {
        this.color = newcolor;
    }

    public double findArea() {   //finding the area of the circle
        return Math.PI * radius * radius;
    }

     @Override

    public String toString() {
        return "radius= " + radius + "\n"+
                " color= " + color + "\n"+
                " area= " + findArea() + "\n" ;
    }

}
