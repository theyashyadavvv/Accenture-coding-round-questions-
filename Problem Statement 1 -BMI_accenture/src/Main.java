
/*     PROBLEM STATMENT

A person’s body mass index is a simple calculation based on height and weight that classifies the person as underweight, overweight, or normal. The formula for metric unit is,

BMI = weight in kilograms / (height in meters)2

You are given a function,

Int GetBMICategory(int weight, float height);

The function accepts the weight (an integer number) and height (a floating point number) of a person as its arguments. Implement the function such that it calculations the BMI of the person and returns an integer, the person’s BMI category as per the given rules:

If BMI < 18, return 0.
If 18 >= BMI < 25, return 1.
If 25 >= BMI <30, return 2.
If 30 >= BMI < 40, return 3.
If BMI >= 40, return 4.
Note:

Weight > 0 and its unit is kilogram.
Height > 0 and its unit is metre.
Compute BMI as a floating-point.
Example : Input:

42

1.54

Output:

0
 */


import java.util.Scanner;
class problem_1 {
    public int GetBMICategory(int weight, double height) {

        double bmi = weight / (height * height);

        if (bmi < 18) {

            return 0;

        } else if (bmi >= 18 && bmi < 25) {

            return 1;

        } else if (bmi >= 25 && bmi < 30) {

            return 2;

        } else if (bmi >= 30 && bmi < 40) {

            return 3;

        } else {

            return 4;

        }
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the bmi: ");
        int weight = sc.nextInt();
        System.out.println("Enter the height of the bmi: ");
        double height = sc.nextDouble();
      problem_1 p= new problem_1();

        int res = p.GetBMICategory(weight, height);

        System.out.println("result" + res );

        System.out.println(res);
    }
}