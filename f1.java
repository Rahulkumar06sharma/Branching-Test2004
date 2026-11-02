import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        System.out.println("Test practice for branching concept");
        for(int i = 0;i<=10;i++){
            System.out.println(i);
        }
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array value");
        for(int i = 0 ;i<arr.length;i++){
        arr[i]= sc.nextInt();
        }
        System.out.println("this is your array which you enter");
        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print(arr[4]);

    }
    
}
