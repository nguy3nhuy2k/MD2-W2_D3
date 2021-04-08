import java.util.Scanner;

public class rectangle {
    double width,height;
    public rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimetter(){
        return ((this.width + this.height) * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("width :");
        double width = scanner.nextDouble();
        System.out.println("height :");
        double height = scanner.nextDouble();
       rectangle rec = new rectangle(width,height);
        System.out.println("Area" + rec.getArea());
        System.out.println("Perimetter" + rec.getPerimetter());
    }
}
