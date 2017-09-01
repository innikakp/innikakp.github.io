import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Used the textbook for help
 * Also used: https://www.youtube.com/watch?v=UU5UhVQhYkY, https://www.youtube.com/watch?v=MeRb_1bddWg for pseudocode, http://stackoverflow.com/questions/4668407/check-whether-a-float-number-contains-decimals-or-not, 
 * https://john.cs.olemiss.edu/~jxue/teaching/csci112_F11/notes/week8/PostfixEvaluator.java, http://www.mtholyoke.edu/~blerner/cs102/Examples/Lecture22/PostfixEvaluator.java,
 * and http://www.kirkwood.edu/pdf/uploaded/262/postfixcalculator.java for help
 * @author Innika Pang
 * My friend also helped me out a lot
 */
public class Calculator {
  private Stack<Number> sN;
  
  /**
   * Default constructor 
   */
  public Calculator() {
    this.sN = new Stack<Number>();
  }

  /**
   * Checks if the value is an integer
   * @param value, a value of the postfix expression
   * @return true if value is an integer; false if an exception is thrown 
   * Used this website for help: http://stackoverflow.com/questions/3133770/how-to-find-out-if-the-value-contained-in-a-string-is-double-or-not
   */
  public boolean isInteger(String value) {
    try {
      //Parse through the expression and look for integers
      Integer.parseInt(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
  
  /**
   * Checks if the value is a float
   * @param value, a value of the postfix expression
   * @return true if value is an float; false if an exception is thrown 
   * Used this website for help: http://stackoverflow.com/questions/3133770/how-to-find-out-if-the-value-contained-in-a-string-is-double-or-not
   */
  public boolean isFloat(String value) {
    try {
      //Parse throught the expression and look for floats
      Float.parseFloat(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
  
  /**
   * Evaluates the current operation for integers. Pops the two operands off the operand stack and applies the operator. 
   * @param op, a character representing the operator
   * @return the result of the applied operator 
   * Taken and adapted from the book and used this for a little help: http://stackoverflow.com/questions/2182924/java-convert-float-to-integer
   */
  private Integer evaluateOpI(char op) { //??
    int rhs = (int) sN.pop();
    int lhs = (int) sN.pop();
    int result = 0;

    //Do operation and push result back into stack
    switch (op) {
      case '+':
        result = (int) sN.push(lhs + rhs);
        break;
      case '-':
        result = (int) sN.push(lhs - rhs);
        break;
      case '*':
        result = (int) sN.push(lhs * rhs);
        break;
      case '/':
        result = (int) sN.push(lhs / rhs);
        break;
    }

    return (int) result;
  }
  
  /**
   * Evaluates the current operation for floating points. Pops the two operands off the operand stack and applies the operator. 
   * @param op, a character representing the operator
   * @return the result of the applied operator 
   * Adapted from the book and used this for a little help: http://stackoverflow.com/questions/2182924/java-convert-float-to-integer
   */
  private Float evaluateOpF(char op) {
    float rhs = (float) sN.pop();
    float lhs = (float) sN.pop();
    float result = 0;

    //Do operation and push result back into stack
    switch (op) {
      case '+':
        result = (float) sN.push(lhs + rhs);
        break;
      case '-':
        result = (float) sN.push(lhs - rhs);
        break;
      case '*':
        result = (float) sN.push(lhs * rhs);
        break;
      case '/':
        result = (float) sN.push(lhs / rhs);
        break;
    }

    return result; 
  }
  
  /**
   * Calculates the given postfix expression
   * @param expression the postfix expression to be evaluated
   * @return the result of the evaluated expression as the top of the stack
   * Adapted code from textbook and got help from: http://stackoverflow.com/questions/32167807/checking-if-a-string-contains-a-dot
   */
  public Number calculate(String expression) {
    String[] tokens = expression.split("\\s");
    System.out.println(expression);

    try {
      for (String nextToken: tokens) { 
        if (!expression.contains(".")) {
          //Pushes integers in stack 
          if (isInteger(nextToken)){
            Integer y = Integer.valueOf(nextToken);
            //Push integer into stack
            sN.push(y);
            //System.out.println(sN.peek());
          }    
          //Evaluates for integers
          else {
            char secondChar = nextToken.charAt(0);
            Integer result = evaluateOpI(secondChar);
            //Pop result from stack
            sN.pop();
            //System.out.println(sN.pop());
            //Push result onto stack 
            sN.push(result);
            //System.out.println(sN.peek());
          }
        } else {
          //Pushes floats into stack 
          if (isFloat(nextToken)) {
            //Push floating point into stack
            Float value = Float.valueOf(nextToken);
            sN.push(value);
            //System.out.println(sN.peek());
          } 
          //Evaluates for floating points
          else {
            char firstChar = nextToken.charAt(0);
            //Evaluate operator
            Float result = evaluateOpF(firstChar);
            //Pop result from stack
            sN.pop();
            //Push result onto stack 
            sN.push(result);
            //System.out.println(sN.peek());
          }
        }
       }

       //Pop result from stack if there are no tokens
       Number answer = sN.pop();
      return answer;
    } catch (EmptyStackException ex) {
      throw new ICS211Exception();
    }
  }
}
