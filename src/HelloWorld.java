import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Your name is " + name + ". Your age is " + age + ". Your height is " + height);
    }


}
