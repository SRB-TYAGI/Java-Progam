public class sorted_array {
    public static boolean issorted(int []array,int i){
        if (i==array.length-1){
              return true;
        }
        if (array[i]>=array[i+1]){
            return false;
        }
        return issorted(array,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
    }
}
