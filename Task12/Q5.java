public class Q5 {
    public static void main(String[] args) {
        String[] arr = new String[] { "This" , "is" , "the" ,
         "best","and",
         "most","important", "topic."};
         StringBuffer sb = new StringBuffer();

         for(String str : arr){
            sb.append(str).append(" ");
         }
         System.out.println(sb);
    }
}
