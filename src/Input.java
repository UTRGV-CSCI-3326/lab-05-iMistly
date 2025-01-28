import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight(lb): ");
        double weight = scanner.nextDouble();
        System.out.print("Do you have a habit of smoking?(true/false): ");
        boolean isSmoker = scanner.nextBoolean();
        scanner.close();

        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " year(s) old.");
        System.out.println("You currently weigh " + weight + "lbs.");
        if (isSmoker){
            System.out.println("You are a smoker...");
        }
        else{
            System.out.println("You are not a smoker!");
        }
    }
}