public class Square extends Rectangle   {
private double side;


public Square(){

}
public Square(double side){

}

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double width) {
        this.side=width*width;

    }
    public String printInfo(){
        System.out.println("--Circle");
        return "color: "+getColor()+" isFilled:"+isFilled()+" Square Area: "+getSide();
    }
}
