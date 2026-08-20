import java.util.Scanner;
class Names
  {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("enter ur name:");
      String name = input.nextLine();
      System.out.println("name:" +name);
      input.close();
    }
  }
