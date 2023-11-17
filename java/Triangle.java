import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle:");

        System.out.print("Angle 1: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Angle 2: ");
        double angle2 = scanner.nextDouble();

        System.out.print("Angle 3: ");
        double angle3 = scanner.nextDouble();

        scanner.close();

        if (isTriangle(angle1, angle2, angle3)) {
            if (isRightTriangle(angle1, angle2, angle3)) {
                System.out.println("The triangle is a right-angle triangle.");
            } else if (isAcuteTriangle(angle1, angle2, angle3)) {
                System.out.println("The triangle is an acute-angle triangle.");
            } else if (isObtuseTriangle(angle1, angle2, angle3)) {
                System.out.println("The triangle is an obtuse-angle triangle.");
            }
        } else {
            System.out.println("The entered angles do not form a valid triangle.");
        }
    }

    private static boolean isTriangle(double angle1, double angle2, double angle3) {
        return angle1 + angle2 + angle3 == 180;
    }

    private static boolean isRightTriangle(double angle1, double angle2, double angle3) {
        return angle1 == 90 || angle2 == 90 || angle3 == 90;
    }


    private static boolean isAcuteTriangle(double angle1, double angle2, double angle3) {
        return angle1 < 90 && angle2 < 90 && angle3 < 90;
    }


    private static boolean isObtuseTriangle(double angle1, double angle2, double angle3) {
        return angle1 > 90 || angle2 > 90 || angle3 > 90;
    }
}
