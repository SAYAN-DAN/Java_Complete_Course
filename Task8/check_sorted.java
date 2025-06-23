public class check_sorted {
    public static void main(String[] args) {
        int[] arr = { 45, 65, 78, 65, 32, 25 };
        int n = arr.length;
        boolean sort = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sort = false;
                break;
            }
        }
        if (sort == true) {
            System.out.println("The array is sorted;");
        }else{
            System.out.println("The array is not  sorted;");
        }
    }
}
