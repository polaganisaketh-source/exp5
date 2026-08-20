import java.util.Scanner;
class Names
  {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("enter ur name:");
      String name = input.nextLine();
    if (args.length > 0) {
        name = args[0];
        System.out.println("Your name is: " + name);
    } else {
        System.out.println("No name provided.");
    }
    input.close();
    }
  }


