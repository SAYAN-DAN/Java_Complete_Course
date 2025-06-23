public class maximum_minimum {
    public static void main(String[] args) {
        int[] myarray = {14,45,24,32,58,47,55};
        int n = myarray.length;
        int minlement = myarray[0];
        int mxnelement = myarray[0];

        for(int i=0;i<n;i++){
            if(myarray[i] > mxnelement){
               mxnelement = myarray[i];
            }
            if(myarray[i] < minlement){
            minlement = myarray[i];
            }
        }
        System.out.println("The maximum element of this array is : "+ mxnelement);
        System.out.println("The minimum element of this array is : "+ minlement);
    }
}
