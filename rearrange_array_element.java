import java.util.Scanner;

public class rearrange_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 1;
        int[] ans = new int[size];

        for(int j = 0;j<size;j++){
            if(nums[j] >= 0){
                ans[positive] = nums[j];
                positive += 2;
            }else{
                ans[negative] = nums[j];
                negative += 2;
            }
        }
        System.out.println("Rearrange Order: ");
        for(int k = 0;k<size;k++){
            System.out.print(ans[k]+"");
        }
        sc.close();
    }
}
