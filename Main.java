public class Main {
    public static void main(String[] args) {
        //   ---Circle---
        Circle c1 = new Circle("Red", true, 1.0);
        System.out.println(c1.printInfo());

        //   ---Rectangle---
        Rectangle r1 = new Rectangle("Blue", true, 10, 20);
        System.out.println(r1.printInfo());

        //   ---Square---
        Square s1=new Square("Blue",true,10);
        s1.setSide(10);
        System.out.println(s1.printInfo());

    }
}