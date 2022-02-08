import java.util.Scanner;

public class BMIrun {
    public static void main(String[] args)
    {
        BMI UserCurr = new BMI();

        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);

        System.out.println("Enter the weight in pounds: ");
        double weight = firstInput.nextDouble();

        System.out.println("Enter the height in inches: ");
        double height = secondInput.nextDouble();

        UserCurr.setWeight(weight);
        UserCurr.setHeight(height);
        double userBMI = UserCurr.getBMI();
        String info = UserCurr.getInfo();

        System.out.println("BMI is " + userBMI);
        System.out.println(info);
    }
}

