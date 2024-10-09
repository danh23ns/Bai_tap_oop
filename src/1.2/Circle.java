public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "Circle[ radius="+radius+"]";
    }



}
