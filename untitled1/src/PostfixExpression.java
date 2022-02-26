import java.util.*;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {
        if(isNumber(exp)) return Integer.parseInt(exp);
        char[] expArray = exp.toCharArray();
        Stack<Integer> stk = new Stack<>();
        int num = 0;
        for(int i=0;i<expArray.length;i++){
            if(expArray[i] == ' '){
                stk.push(num);
                num = 0;
            }else if(isNumber(expArray[i])){
                int dig = expArray[i] - '0';
                num = (num*10) + dig;
            }else{
                int first = stk.pop();
                int second = stk.pop();
                int result = computeValue(first,second,expArray[i]);
                stk.push(result);
                i++;
            }
        }
        return stk.peek();
    }
    static int computeValue(int first , int second , char operand){
        int result =0;
        if(operand == '+'){
            result = second+first;
        }else if(operand == '-'){
            result = second-first;
        }else if(operand=='*'){
            result = second*first;
        }else{
            result = second/first;
        }
        return result;
    }

    static boolean isNumber(char ch){
        return ch >= '0' && ch <= '9';
    }
    static boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}

