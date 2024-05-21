public class last_occurance {
    public static int lastoccurence(int arr[],int i,int x){
        if (i==arr.length){
            return -1;
        }
        int isfound=lastoccurence(arr,i+1,x);
        if (isfound==-1 && arr[i]==x){
            return i;
        }
        return isfound;
    }
    public static void main (String args[]){
        int arr[]={11,12,15,13,14,15,16,17,15};
        System.out.println(lastoccurence(arr,0,15));
    }
    
}
