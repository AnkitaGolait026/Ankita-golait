import java.util.Scanner;
public class ArrayIntialization {
    public static void main(String[] args) {
        //Declration of array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        // Creation of array
        int[]arr= new int[size];
       // Displaying the array
        // for(int x:arr){
        //     System.out.println(x);
        // }
        //new//
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
           
            System.out.println(j+"  ");
            
        }
    }
    
}
