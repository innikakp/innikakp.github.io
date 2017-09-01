import java.util.Scanner;

/**
 * A text-base user interface that accepts input from the user and prints the result of the calculate(String expression) method
 * @author Innika Pang
 * Used http://stackoverflow.com/questions/21899448/my-scanner-for-user-input-only-reads-the-first-word-how-to-make-it-read-all-i,
 * https://codereview.stackexchange.com/questions/70414/close-scanner-if-no-input
 * https://codereview.stackexchange.com/questions/70414/close-scanner-if-no-input
 * and the textbook for help
 */
public class CalculatorInputTester {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("This is a postfix calculator that will calculate a given postfix expression.\n");
    System.out.println("Please enter a valid postfix expression: ");
    Calculator result = new Calculator();
    boolean count;
    count = true;

    //Loops through the input (given expression) and returns the result of the calculation
    while (scan.hasNextLine() & (count == true)) {
      String expression = scan.nextLine();

      //Checks if input is newline by itself or a valid postfix expression. Single new line terminates program
      if (expression.equals("")) {
        count = false;
        System.out.println("All outputs for postfix expressions calculated.\n");
        System.out.println("Please press the 'ENTER' key again to end the program.");
      }
      else {
        System.out.println("Result = " + result.calculate(expression));
      }
    }

    scan.close();
  }

}
