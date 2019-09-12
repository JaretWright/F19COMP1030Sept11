import java.util.Scanner;

public class NameAsker {
    public static void main(String[] args)
    {
        System.out.printf("What is your name?: ");

        //Use a Scanner object to read info from the keyboard
        //the variable name is called "keyboard" because that is
        //what it represents in the physical world, you can call
        //it anything, but it's a best practice to name it to represent
        //something real
        Scanner keyboard = new Scanner(System.in);

        //This line will create a variable of type String
        //it is called "name" and we can reference it later by
        //using the word name
        String name = keyboard.nextLine();

        System.out.printf("Hello %s", name);
    }
}
