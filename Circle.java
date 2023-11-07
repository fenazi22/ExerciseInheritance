public class Circle extends Shape{
    private double radius;

public Circle(){

}
public Circle(double radius){
    this.radius=radius;
}
    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius =radius;
    }
    public double getArea(){
        return   radius=(2*Math.PI)*radius;
    }
    public String printInfo(){
        System.out.println("--Circle");
        return "color: "+getColor()+" isFilled:"+isFilled()+" Circle: "+getArea();
    }
}
