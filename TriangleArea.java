import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator\n");
        System.out.print("Please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms:");
        double height = input.nextDouble();
        
        double area  = 0.5* base * height;
        
        
        System.out.println("The area of your triangle is : " + area + "cms2");
    }
}