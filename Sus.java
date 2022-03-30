package tt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import tt2.Stack;


import java.util.*;

public class Sus {
   
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result = 0.0;

 
    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("sqrt", 2);
        OPERATORS.put("^", 2);
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }


    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }


    public Sus(String expression) {
      
        this.expression = expression;


        this.termTokenizer();

        this.tokensToReversePolishNotation();


        this.rpnToResult();
    }


    private boolean isOperator(String token) {
        // find the token in the hash map
        return OPERATORS.containsKey(token);
    }


    private boolean isSeperator(String token) {
        // find the token in the hash map
        return SEPARATORS.containsKey(token);
    }

    private Boolean isPrecedent(String token1, String token2) {

        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }


    private void termTokenizer() {

        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
           
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
             
                if (c != ' ') {
                    tokens.add(c.toString());
                }
  
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                multiCharTerm.append(c);
            }

        }
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));
        }
    }

    private void tokensToReversePolishNotation () {

        this.reverse_polish = new ArrayList<>();


        Stack tokenStack = new Stack();
        for (String token : tokens) {
            switch (token) {

                case "(":
                    tokenStack.push(token);
                    break;
                case ")":
                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        reverse_polish.add( (String)tokenStack.pop() );
                    }
                    tokenStack.pop();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "^":
                case "sqrt":

                    while (tokenStack.peek() != null && isOperator((String) tokenStack.peek()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
                            reverse_polish.add((String)tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    
                    tokenStack.push(token);
                    break;
                default:   
                    this.reverse_polish.add(token);
            }
        }

        while (tokenStack.peek() != null) {
            reverse_polish.add((String)tokenStack.pop());
        }

    }


    private void rpnToResult()
    {
     
        Stack stack = new Stack();


        for (String token: this.reverse_polish) {

            if (!isOperator(token)) {
   
                stack.push(token);
            }
           
            else {
        
                Double x1 = Double.valueOf((String)stack.pop());
                Double x0 = Double.valueOf((String)stack.pop());

          
                Double result;
                switch (token) {
                    case "+":
                        result = x0 + x1;
                        break;
                    case "-":
                        result = x0 - x1;
                        break;
                    case "*":
                        result = x0 * x1;
                        break;
                    case "/":
                        result = x0 / x1;
                        break;
                    case "%":
                        result = x0 % x1;
                        break;
                    case "^":
                        result = Math.pow(x0, x1);
                        break;
                    case "sqrt":
                        result = Math.sqrt(x0);
                        break;
                    default:
                        result = 0.0;
                }


                stack.push(String.valueOf(result));
            }
        }

        this.result = Double.valueOf((String)stack.pop());
    }

    public String toString() {
        return ("Original expression: " + this.expression + "\n" +
                "Tokenized expression: " + this.tokens.toString() + "\n" +
                "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
                "Final result: " + String.format("%.2f", this.result));
    }

    public static void main(String[] args) {
        // Random set of test cases
        Sus simpleMath = new Sus("100 + 200  * 3");
        System.out.println("Simple Math\n" + simpleMath);

        System.out.println();

        Sus parenthesisMath = new Sus("(100 + 200)  * 3");
        System.out.println("Parenthesis Math\n" + parenthesisMath);

        System.out.println();

        Sus fractionMath = new Sus("100.2 - 99.3");
        System.out.println("Fraction Math\n" + fractionMath);

        System.out.println();

        Sus moduloMath = new Sus("300 % 200");
        System.out.println("Modulo Math\n" + moduloMath);

        System.out.println();

        Sus divisionMath = new Sus("300/200");
        System.out.println("Division Math\n" + divisionMath);

        System.out.println();

        Sus multiplicationMath = new Sus("300 * 200");
        System.out.println("Multiplication Math\n" + multiplicationMath);

        System.out.println();

        Sus allMath = new Sus("200 % 300 + 5 + 300 / 200 + 1 * 100");
        System.out.println("All Math\n" + allMath);

        System.out.println();

        Sus allMath2 = new Sus("200 % (300 + 5 + 300) / 200 + 1 * 100");
        System.out.println("All Math2\n" + allMath2);

        System.out.println();

        Sus allMath3 = new Sus("200%(300+5+300)/200+1*100");
        System.out.println("All Math3\n" + allMath3);

        System.out.println();

        Sus expMath = new Sus("8 ^ 4");
        System.out.println("Exponential Math\n" + expMath);

        System.out.println();

        String userInput;
        Scanner input = new Scanner(System.in);

        System.out.println("What equation would you like to calculate?");

        userInput = input.next();
        Sus test = new Sus(userInput);
        System.out.print("Result:\n" + test);
    }
}
