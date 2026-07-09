// Last updated: 09/07/2026, 15:11:30
class Solution {
    public boolean isValid(String  s)   {
        char[] ch = s.toCharArray();
        Stack <Character> stack = new Stack<>();
        for(char c: ch){
            if(c == '(' || c == '[' || c == '{')
            stack.push(c);
            else{
                if(stack.empty()) return false;
              else  if(c==')' && stack.peek() == '(')
              stack.pop();
              else  if(c==']' && stack.peek() == '[')
              stack.pop();
              else  if(c=='}' && stack.peek() == '{')
              stack.pop();
              else return false;}
            }
            return stack.empty();
              }
        }

      
   

    
