import java.util.Scanner;

public class Pt_bac2 {
     double a,b,c;

    public Pt_bac2(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double getDental(){
        return  b*b - 4*a*c;
    }
    public void getX() {
        double x1, x2;
        if (getDental() < 0) {
            System.out.println("pt vô No");
        } else if (getDental() == 0) {
            x1 = -b / 2 * c;
            System.out.println("pt có No kép :" + x1);
        } else {
            x1 = ((-b) - Math.sqrt(getDental())) / (2 * a);
            x2 = ((-b) + Math.sqrt(getDental())) / (2 * a);
            System.out.println("pt có No x1 =" + x1);
            System.out.println("pt có No x2 =" + x2);

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap c: ");
        double c = scanner.nextDouble();
        Pt_bac2 delta = new Pt_bac2(a,b,c);
        delta.getX();

    }
}
