import java.util.Scanner;

public class LinearTwoVari{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a_11: ");
        double a_11 = scanner.nextDouble();

        System.out.print("Nhap so a_12: ");
        double a_12 = scanner.nextDouble();

        System.out.print("Nhap so a_21: ");
        double a_21 = scanner.nextDouble();

        System.out.print("Nhap so a_22: ");
        double a_22 = scanner.nextDouble();

        System.out.print("Nhap so b_1: ");
        double b_1 = scanner.nextDouble();

        System.out.print("Nhap so b_2: ");
        double b_2 = scanner.nextDouble();

        double D = a_11 * a_22 - a_21 * a_12;
        double D1 = b_1 * a_22 - b_2 * a_12;
        double D2 = a_11 * b_2 - a_21 * b_1;

        if(D == 0){
            System.out.println("Dung voi moi x, y");
        }
        else{
            double x = D1 / D;
            double y = D2 / D;
            System.out.println("x = " + x + " and " + "y = " + y); 
        }
        scanner.close();
    }
}