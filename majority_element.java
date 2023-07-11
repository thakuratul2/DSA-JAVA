import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int majority = 0;

        for(int j = 0;j<size;j++){
            if(count ==0 && majority!=nums[j]){
                majority = nums[j];
                count =1;
            }else if(majority == nums[j]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("Majority Element is: ");
        System.out.println(majority+"");
        sc.close();
    }
}
