import java.util.Scanner;
import java.util.Stack;

/**
 * A test class that tests the calculate(String expression) method and the stack 
 * @author Innika Pang
 * Got help from the textbook, http://www.mtholyoke.edu/~blerner/cs102/Examples/Lecture22/PostfixEvaluator.java
 * and http://alvinalexander.com/java/java-int-double-float-mixed-type-division-arithmetic-rules 
 * for arithmetic health 
 */
public class CalculatorTester {
  
  public static void main(String[] args) {
    /**Test stack**/
    Stack<Number> s = new Stack<Number>();
    //s.peek(); //throws empty exception
    //s.pop(); //throws empty exception
    System.out.println(s.empty()); //throws empty exception
    System.out.println("Item pushed into stack: " + s.push(1));
    //Item at the top of stack returned
    System.out.println("Item at top of stack: " + s.peek()); 
    s.push(9.88888887);
    s.push(1000);
    s.push(5.0);
    s.push(0.0);
    //Item at the top of stack returned
    System.out.println("Item at top of stack: " + s.peek()); 
    System.out.println("Item at the top of stack: " + s.pop());
    //Removed item at top (old top) and returned item currently at the top
    System.out.println("Item at top of stack after removing item: " + s.peek()); 
    s.pop();
    s.pop();
    s.pop();
    System.out.println("Item at top of stack after removing items: " + s.peek());
    //Popped the item that was first added to list
    s.pop(); 
    //System.out.println(s.peek()); //throws empty exception
    System.out.println();
    
    //Create a new calculator
    Calculator answer = new Calculator();
    
    //System.out.println(expression);

    /**Test Valid postfix expression**/
    String expression = "1 3 5 + -";
    String expression2 = "2.2 7.0 + 3.0 *";
    String expression4 = "1 2 + 3 * 6 + 2 3 + /";
    String expression15 = "1 3 /";
    String expression16 = "2 3 /";
    String expression18 = "3 2.0 /";
    String expression19 = "3.0 2 /";
    String expression20 = "3 2 /";
    
    //Print expressions and mathematical expressions for good postfix expressions
    System.out.println(answer.calculate(expression));
    System.out.println("1 3 5 + - = " + (1 - (3 + 5)));

    System.out.println(answer.calculate(expression2));
    System.out.println("2.2 7.0 + 3.0 * = " + ((2.2 + 7.0) * 3.0));
    
    System.out.println(answer.calculate(expression4));
    System.out.println("1 2 + 3 * 6 + 2 3 + / = " + ((((1 + 2) * 3) + 6) / (2 + 3) ));
    
    System.out.println(answer.calculate(expression15));
    System.out.println("1 3 / = " + (1 / 3));

    System.out.println(answer.calculate(expression16));
    System.out.println("2 3 / = " + (2 / 3));
    
    System.out.println(answer.calculate(expression18));
    System.out.println(("3 / 2.0   = " + (3 / 2.0)));
    
    System.out.println(answer.calculate(expression19));
    System.out.println("3.0 / 2   = " + (3.0 / 2));
    
    System.out.println(answer.calculate(expression20));
    System.out.println("3 / 2     = " + (3 / 2));
    
    /**Test Mixed expressions**/
    //String expression12 = "2.3 3 - 4 *"; 
    //String expression13 = "1.2 8.9 + 2 -";
    
    //Print expressions and mathematical expressions for good postfix expressions
    //System.out.println(answer.calculate(expression12));
    //System.out.println("2.3 3 - 4 * = " + ((2.3 - 3) * 4));
    
    //System.out.println(answer.calculate(expression13));
    //System.out.println("1.2 8.9 + 2 - = " + ((1.2 + 8.9) - 2 ));
    
    /**Test Prefix expressions**/
    //String expression21 = "+ 100 3";
    //String expression24 = "- 81 1 * 2";
    //String expression25 = "* 12 2 +";
    
    //Should give ICS211Exception
    //System.out.println(answer.calculate(expression21));
    //System.out.println(answer.calculate(expression24));
    //System.out.println(answer.calculate(expression25));
    
    /**Test Infix expressions**/
    //String expression22 = "10 + 10";
    //String expression23 = "(70 * 3) + 8";
    
    //Should give ICS211Exception
    //System.out.println(answer.calculate(expression22));
    //System.out.println(answer.calculate(expression23));
    
    /**Test Bad postfix expressions and bad input**/
    //String expression5 = "a b c + -"; 
    //String expression6 = " "; 
    //String expression7 = "a b c"; 
    //String expression8 = "2 4 6"; 
    //String expression9 = "+ - /"; 
    //String expression10 = "10 / 10 30 *";
    //String expression11 = "2.3 9.0 99.8999";
    //String expression14 = "palindrome";
    //String expression17 = "+ 2 3 /";
    
    //Should give ICS211Exception
    //System.out.println(answer.calculate(expression5));
    //System.out.println(answer.calculate(expression6));
    //System.out.println(answer.calculate(expression7));
    //System.out.println(answer.calculate(expression8));
    //System.out.println(answer.calculate(expression9));
    //System.out.println(answer.calculate(expression10));
    //System.out.println(answer.calculate(expression11));
    //System.out.println(answer.calculate(expression14));
    //System.out.println(answer.calculate(expression17));
  }
}
