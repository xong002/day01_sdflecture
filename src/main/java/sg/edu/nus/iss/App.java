package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What is your name?\n");

        System.out.printf("Nice to meet you, %s\n", name);

        Integer age = 80;
        System.out.printf("%s is %d years old.\n", name, age);

        // Slide 17
        // Read input from keyboard
        String input = con.readLine("What is your hobby?\n");
        input = input.trim();

        // if (input.equals("swim")) {
        // System.out.println("The nearest swimming pool is Clementi");
        // } else if (input.equals("jog")) {
        // System.out.println("The nearest park is West Coast Park");
        // } else if (input.equals("cycle")) {
        // System.out.println("You could cycle along the PCN");
        // } else {
        // System.out.println("Seems like you are a boring person without a hobby");
        // }

        // Slide 18
        // switch statements
        switch (input) {
            case "swim":
                System.out.println("The nearest swimming pool is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without a hobby");
        }

        // Slide 19
        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?\n");

        myAge = Integer.parseInt(inputAge);

        if (myAge >= 0 && myAge <= 2) {
            System.out.println("You are a baby");
        } else if (myAge > 2 && myAge <= 4) {
            System.out.println("You are a toddler");
        } else if (myAge > 4 && myAge <= 12) {
            System.out.println("You are a child");
        } else if (myAge > 12 && myAge < 19) {
            System.out.println("you are a teenager");
        } else {
            System.out.println("You are an adult");
        }
    }
}
