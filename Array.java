
import java.util.Scanner;
import java.util.Arrays;

public class Array{

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Hello");


    // Starting with Arrays
    
    // Store  5 rollno
    // int[] rnos= new int[5];
    // int[] ros;// Decalaration of array;
    // ros = new int[5];// Initialisation;  
    // int arr[]=new int[5];
    //      for(int i=0;i<arr.length;i++)
    //        arr[i]=in.nextInt();
    //     // printting
    //     for (int element : arr)// for every element in the array print the element
    //         System.out.println(element);
    
    //  Arrays of objects
    String[] str =new String[4];
    for(int i=0;i<str.length;i++)
      {
        str[i]=in.next();
      }
      System.out.println(Arrays.toString(str));

 }
}
// import java.util.Scanner;
// import java.util.Arrays; // Import the Arrays class

// public class Array {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Hello");

//         // Arrays of objects
//         String[] str = new String[4];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = in.next();
//         }
//         System.out.println(Arrays.toString(str)); // Use Arrays.toString() to print the array
//     }
// }
