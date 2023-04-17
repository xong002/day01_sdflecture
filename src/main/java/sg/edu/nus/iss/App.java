package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("What is your name?");

        System.out.printf("Nice to meet you, %s\n", name);

        Integer age = 80;
        System.out.printf("%s is %d years old.", name, age);

        //Slide 17
        //Read input from keyboard
        String input = con.readLine("What is your hobby?");
        input.trim();

        if (input.equals("swim")){
            System.out.println("The nearest swimming pool is Clementi");
        } else if (input.equals("jog")){
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")){
            System.out.println("You could cycle along the PCN");
        } else {
            System.out.println("Seems like you are a boring person without a hobby");
        }


    }
}
