import java.util.Scanner;

public class jump_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        //track the index 
        int reach = 0;

        for(int j = 0; j<size;j++){

            if(j > reach){
                
                System.out.println("Not Track");
                
            }
            reach = Math.max(reach, j + nums[j]);
        }
        System.out.println("Jump Game Done");
        sc.close();
    }
}
