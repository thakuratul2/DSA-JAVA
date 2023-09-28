public class sum_two_number {
    
        public int getSum(int a, int b) {
            if(a==0 || b==0) return a!=0?a:b;
            //by not using + and - only use bit manipulation
            int c=b,s=0;
            while(c!=0){

                s=a^b;
                
                c=(a&b)<<1;
                
                a=s;
                b=c;
            }
            return s;
        }
}
