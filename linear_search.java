import java.util.Scanner;
public class linear_search {
    public static int linearSearch(int num[],int key){
       
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you went to search:");

        int key=sc.nextInt();
        
        System.out.println(key);
       
        int num[]={2,4,6,8,10,12,14,16};
        //string num={dosa,meggi,noddles ,rasgula}
        
        int index=linearSearch(num, key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is found at index:"+index);
        }
    }
}
