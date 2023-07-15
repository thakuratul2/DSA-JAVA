package Stack;

public class basic {

   static class Stack{
        private int arr[];
        private int top;
        private int capacity;


        Stack(int size){
            arr = new int[size];
            capacity = size;
            top =-1;
        }
        public void push(int x){
            if(capacity - top >1){
                
                top++;
                arr[top]=x;

                System.out.println("Inserting: "+x);
            }else{
                System.out.println("Stack Overflow");
            }
        }

        public void pop(){
            if(top>=0){
                top--;
            }else{
                System.out.println("Stack Overflow");
            }
        }

        public void printStack(){
            for(int i = 0;i<=top;i++){
                System.out.println(arr[i]+"");
            }
        }
    }
    public static void main(String[] args) {
        
        Stack stk = new Stack(4);

        stk.push(14);
        stk.push(11);
        stk.push(10);
        System.out.println("Stack: ");
        stk.printStack();

       stk.pop();
        System.out.println("After Pop: ");
        stk.printStack();
    }
}
