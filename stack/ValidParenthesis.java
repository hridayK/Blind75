import java.util.Stack;

public class ValidParenthesis{
    public static void main(String[] args) {
        String input = "(){}}{";
        System.out.println(isValid(input));
    }

    private static Boolean isValid(String input){
        Stack<Character> stack = new Stack<Character>();
        
        if(input.length() == 1){
            return false;
        }

        boolean answer = false;
        boolean error = false;
        int count = 0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == '{' || ch == '(' || ch=='['){
                stack.push(ch);
                count++;
            }else if(ch == '}' || ch == ')' || ch==']'){
                try {
                    if(ch == ')' && stack.peek() == '('){
                        stack.pop();
                    }else if(ch == '}' && stack.peek() == '{'){
                        stack.pop();
                    }else if(ch == ']' && stack.peek() == '['){
                        stack.pop();
                    }else{
                        break;
                    }
                } catch (Exception e) {
                    error = true;
                    break;
                }
            }else{
                error = true;
                break;
            }
        }

        if(stack.isEmpty() && count>0 && error==false){
            answer = true;
        }
        return answer;
    }
}