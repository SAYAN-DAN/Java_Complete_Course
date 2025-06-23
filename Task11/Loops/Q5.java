// import java.util.Scanner;

// class Q5 {

//     public static void main(String[] args) {
//         System.out.print("Welcome to finding the Array: ");
//         Scanner input = new Scanner(System.in);

//         int[] arr = ArrayUtility.inputArray();

//         int max = Integer.MIN_VALUE;
//         for (int num : arr) {
//             if (max < num) {
//                 max = num;
//             }
//         }

//         System.out.println("The maximum number is : " + max);
//     }

// }



import java.util.Scanner;

class Q5 {

    public static void main(String[] args) {
        System.out.print("Welcome to finding the Array: ");
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("The maximum number is : " + max);
    }

}

