import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("------------------------------Welcome-----------------------------");
        Scanner sc = new Scanner(System.in);
        boolean tempConvert = true;
        while (tempConvert){
            System.out.println("-------Celsius-Fahrenheit/Fahrenheit-Celsius Converter-------");
            System.out.println("1-Celsius-Fahrenheit");
            System.out.println("2-Fahrenheit-Celsius");
            System.out.print("Choose the conversion mode:");
            int num = sc.nextInt();
            if(num == 1) {
                System.out.print("Please enter the temperature to convert:");
                double C = sc.nextDouble();
                double F = (C * 9/5) + 32;
                System.out.print("The temperature in Fahrenheit is: ");
                System.out.println(F);
            }else if (num == 2){
                System.out.print("Please enter the temperature to convert:");
                double F = sc.nextDouble();
                double C = (F - 32) * 5/9;
                System.out.print("The temperature in Celsius is: ");
                System.out.println(C);
            } else {
                System.out.print("Your choice is invalid !");
            }
            System.out.println("do you want other temperatures?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            int temp = sc.nextInt();
            if(temp == 2) {tempConvert = false;
            }
            System.out.println("------------------Goodbye,see you soon-----------------");
            }
        }

    }
