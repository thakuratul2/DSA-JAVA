package Stack;

import java.util.Stack;

public class basic_cal_2 {
    public int calculate(String s) {
        
        int curr = 0;
        char op = '+';

        Stack<Integer> st = new Stack<>();
        char[] ch= s.toCharArray();

        for(int i =0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                curr = curr*10  + ch[i] - '0';
                
            }

            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length-1){

                if(op == '+'){
                    
                    st.push(curr);
                    
                    
                }else if(op == '-'){
                    st.push(-curr);
                }else if(op == '*'){
                    
                    st.push(st.pop() * curr);
                }
                else if(op == '/'){
                    st.push(st.pop() / curr);
                }

                //if no operation done so make the op to current value
                op = ch[i];
                curr = 0;
            }

        }

        int sum = 0;
        while(!st.isEmpty()){
            sum +=st.pop();
        }

        return sum;
    }
}