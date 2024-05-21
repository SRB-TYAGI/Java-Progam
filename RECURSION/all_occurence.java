public class all_occurence {
    public static void alloccurence(int []arr,int i,int key){
        if (i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");

        }
        alloccurence(arr,i+1,key);
    }
    public static void main(String args[]){
            int arr[]={1,2,3,2,4,2,5,2,6,2};
            alloccurence(arr,0,2);
    }
}
