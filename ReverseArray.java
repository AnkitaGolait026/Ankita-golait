// import java.util.Scanner;
public class ReverseArray {
static int[]  reverseArray(int[] arr) {
   int i=0;
   int j=arr.length-1;

   while(i<=j){
    int temp =arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
   }
   return arr;
}


    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the array:");
        // int size=sc.nextInt();
        int[]arr={10,5,2,7,11};
	    for(int v:reverseArray(arr)){
		System.out.println(v+"");
		
        }
    }
}
