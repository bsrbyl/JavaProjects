package upWork;

import java.util.Scanner;

public class Tringle {



    //4- user enters 3 side lengths, each different, from which triangles can’t be formed and
    // the expected result will be the user should get an error message
    //
    //5- user enters 2 equal 3 side lengths that can’t create a triangle and
    // the expected result will be the user should get an error message

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three lengths to create a triangle: ");

        System.out.println("1st side length : ");
        double num1 = scan.nextDouble();
        System.out.println("2nd side length : ");
        double num2 = scan.nextDouble();
        System.out.println("3. side length : ");
        double num3 = scan.nextDouble();

        isTringle(num1, num2, num3);
    }

    private static void isTringle(double num1, double num2, double num3) {

        if (num1<num2+num3 && num2<num1+num3 && num3<num1+num2 ){
            System.out.println("Triangle can be formed");

            lookside(num1, num2, num3);

        }
        else
            //4- user enters 3 side lengths, each different, from which triangles can’t be formed and
            // the expected result will be the user should get an error message
            //
            //5- user enters 2 equal 3 side lengths that can’t create a triangle and
            // the expected result will be the user should get an error message
            System.out.println("A Triangle can't be created with the entered side lengths");

    }

    private static void lookside(double num1, double num2, double num3) {

        if (num1==num2 && num2==num3)
            //1-	user enters 3 equal side lengths from which triangle can be formed and
            // the expected result would be that the user should receive a success message.
            //
            System.out.println("This is Equilateral Triangle");
        else if (num1==num2 || num1==num3 || num2==num3)
            //2-	user enters 3 side lengths, 2 of which are equal, from which triangles can be formed  and
            // the expected result will be the user should get an error message
            //
            System.out.println("This is Isosceles Triangle");
        else
            //3-	user enters 3 side lengths, each different, from which triangles can be formed and
            // the expected result will be the user should get an error message
            //
            System.out.println("This is a Scalene Triangle");
    }


}
