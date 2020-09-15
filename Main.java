import java.util.Scanner;
/**
 * Determines the ascending order of two numbers
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Asking for two integers
    System.out.println("Please enter an integer");
    int num = input.nextInt();
    System.out.println("Please enter another integer");
    int num2 = input.nextInt();
    // Deciding and stating the ascending order of the two integers
    if (num2 > num){
      System.out.println("Your numbers in ascending order are, " + num + ", " + num2);
    } else {
      System.out.println("Your numbers in ascending order are, " + num2 + ", " + num);
    }
    
  }
}
