import java.util.Scanner;
public class LinearEquation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Dung voi moi so.");
            }
            else{
                System.out.println("Khong co x thoa man.");
            }
        }
        else{
            double x = -b / a;
            System.out.println("x = " + x);
        }
        scanner.close();
    }
}
