import java.util.Scanner;

public class maximum_product_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the number: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int left = 1;
        int right = 1;
        int ans = nums[0];

        for(int j = 0;j<size;j++){

            //if the product is zero then update to 1

            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= nums[j];

            right *= nums[size - 1 - j];

            ans = Math.max(ans, Math.max(left, right));
        }
        System.out.println("Product is: "+ans);
        sc.close();
    }
}
