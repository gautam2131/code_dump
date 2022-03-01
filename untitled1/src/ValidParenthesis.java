import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class ValidParenthesis {
    // Implement your solution here
    public String isValid(String s) {
        char[] sArray = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i<sArray.length;i++){
            if (sArray[i] == '[' || sArray[i] == '(' || sArray[i] =='{') {
                stk.push(sArray[i]);
            }
            if(!(stk.isEmpty()) && sArray[i]==']' && stk.peek() == '['){
                stk.pop();
            }else if (sArray[i]==']'){
                stk.push(sArray[i]);
            }
            if(!(stk.isEmpty()) && sArray[i]==')' && stk.peek() == '('){
                stk.pop();
            }else if (sArray[i]==')'){
                stk.push(sArray[i]);
            }
            if(!(stk.isEmpty()) &&  sArray[i]=='}' && stk.peek() == '{'){
                stk.pop();
            }else if (sArray[i]=='}'){
                stk.push(sArray[i]);
            }
        }
        if(!stk.isEmpty()) return "false";
        return "true";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));

        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stk = new Stack<>();
       Vector[] obj = new Vector[2];
       obj[1]= vector;
       obj[2]= stk;
        checkMethod(new Stack<Integer>());
    }

    static void checkMethod(Vector<Integer> h){
        System.out.println("i do nothing");
    }
}
