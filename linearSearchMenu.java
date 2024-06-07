import java.util.Scanner;

public class linearSearchMenu {

    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {  // Use equals() for string comparison
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to search:");

        String key = sc.nextLine();  // Read the input as a string
        
        String menu[] = {"dosa", "meggi", "noodles", "rasgula"};  // Fix syntax errors and use quotes for string literals
        
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item is found at index: " + index);
        }
        
        sc.close();  // Close the scanner
    }
}
