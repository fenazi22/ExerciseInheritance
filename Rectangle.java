public class Rectangle extends Shape{
    private  double withd;
    private double length;

    Rectangle(){}
    Rectangle(double withd,double length){
        this.length=length;
        this.withd=withd;
    }

    public Rectangle (String color, boolean filled){
        super(color, filled);
    }
     public Rectangle(String color, boolean filled,double withd,double length) {
        super(color, filled);
        this.length=length;
        this.withd=withd;
    }

    public double getWithd() {
        return withd;
    }

    public void setWithd(double withd) {
        this.withd = withd;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*withd;
    }
    public String printInfo(){
        System.out.println("---Rectangle---");
        return "color"+getColor()+" isFilled:"+isFilled()+" Rectangle Area: "+getArea();
    }
}
