import java.util.Scanner;

public class Ex6_4 {
    
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;
        int days;
        
        while (true) {

            System.out.print("Enter month: ");
            monthInput = scanner.nextLine();

            System.out.print("Enter year: ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (year < 0) {
                    throw new Error();
                }
            } catch (Error e) {
                System.out.println("Invalid year.");
                continue;
            }

            switch (monthInput) {
                case "January":
                case "Jan":
                case "Jan.":
                case "1":
                    days = 31;
                    break;
                case "February":
                case "Feb":
                case "Feb.":
                case "2":
                    days = isLeapYear(year) ? 29 : 28;
                    break;
                case "March":
                case "Mar":
                case "Mar.":
                case "3":
                    days = 31;
                    break;
                case "April":
                case "Apr":
                case "Apr.":
                case "4":
                    days = 30;
                    break;
                case "May":
                case "5":
                    days = 31;
                    break;
                case "June":
                case "Jun":
                case "6":
                    days = 30;
                    break;
                case "July":
                case "Jul":
                case "7":
                    days = 31;
                    break;
                case "August":
                case "Aug":
                case "Aug.":
                case "8":
                    days = 31;
                    break;
                case "September":
                case "Sep":
                case "Sept.":
                case "9":
                    days = 30;
                    break;
                case "October":
                case "Oct":
                case "Oct.":
                case "10":
                    days = 31;
                    break;
                case "November":
                case "Nov":
                case "Nov.":
                case "11":
                    days = 30;
                    break;
                case "December":
                case "Dec":
                case "Dec.":
                case "12":
                    days = 31;
                    break;
                default:
                    System.out.println("Invalid month.");
                    continue;
            }

            System.out.println(days +" days");
            break;
        }

        scanner.close();
    }
}