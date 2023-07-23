import java.util.Scanner;

public class check_soted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){

            nums[i] = sc.nextInt();
        }

        int count = 0;
        for(int j = 0;j<size;j++){
            if(nums[j]>nums[(j+1)%size]){
                count++;
            }
            if(count>1){
                
                System.out.println("False");
            }
        }
        System.out.println("True");
        sc.close();
    }
}
