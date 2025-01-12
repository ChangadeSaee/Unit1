import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double area,r;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius : ");

        r = scan.nextDouble();
        area = 3.14159 * r * r ;
        System.out.printf("Area is %f",area);



    }
}


