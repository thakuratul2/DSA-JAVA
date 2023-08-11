import java.util.Scanner;

public class best_time_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int prices[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            prices[i] = sc.nextInt();
        }

        int profit = 0;
        int hand= prices[0];

        for(int price : prices){

            if(price > hand){

                profit = profit + (profit - hand);
            }

            hand = price;
        }
        System.out.println("Maximum Profit: "+profit);
        sc.close();
    }
}
