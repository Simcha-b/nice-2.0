import java.util.Scanner;

public class Basic3 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        
    }

    public static void printAll(){
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }
    public static void sumAvgMax(){
        int[] arr = new int[5];
        for (int i : arr) {
            System.out.print("Enter number: ");
            arr[i]=scan.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        for (int i : arr) {
            sum+=arr[i];
            max = (arr[i]>max)? arr[i]:max;
        }
        System.out.println("sum: "+ sum);
        System.out.println("average: "+ (double) sum/5);
        System.out.println("max: "+max);
    }
    public static void numOfShows(int[] arr, int n){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                num++;
            }
        }
        System.out.println(num);
    }
    public static void rotateRight(int[] arr){
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(arr.toString());
    }
    public static void chekPlindrom(int[] arr){
         for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]){
                System.out.println("not Plindrom");
                return;
            }
        }
        System.out.println("is Plindrom");
    }
}
