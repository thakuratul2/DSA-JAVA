import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        //int nums[] = new int[size];
        
        int arr[] = new int[size];

        System.out.println("Enter the element: ");
        
        for(int i = 0;i<size;i++){
            
            arr[i] = sc.nextInt();

        }
        //by using max variable
        int max = arr[0];

        for(int j=0;j<size;j++){

            if(arr[j]>max){
                
                max = arr[j];
                
            }
        }
        System.out.println("Largest Element: ");
        
        System.out.println(max+"");

        sc.close();
    }
}
