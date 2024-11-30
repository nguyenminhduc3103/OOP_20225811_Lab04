import java.util.Scanner;

public class SecondDegreeEq {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();

        double x, x1, x2;
        double delta = b*b - 4*a*c;
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Dung voi moi so.");
                }
                else{
                    System.out.println("Khong co x thoa man.");
                }
            }
            else{
                x = -c / b;
                System.out.println("PT co duy nhat 1 nghiem x = " + x);
            }
        }
        else{
            if(delta < 0){
                System.out.println("PT vo nghiem.");
            }
            else if(delta == 0){
                x = -b / (2*a);
                System.out.println("PT co nghuem duy nhat x = " + x);
            }
            else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println(("PT co 2 nghiem x1 = " + x1 + " va " + "x2 = " + x2));
            }
        }
        scanner.close();
    }
}
