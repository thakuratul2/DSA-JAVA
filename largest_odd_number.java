class largest_odd_number {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0l;i--){
            if(num.charAt(i) % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}