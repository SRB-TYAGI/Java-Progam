public class firdt_occurance {
    public static int occurence(int arr[],int i,int key){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
       
        return occurence(arr,i+1,key);
    }
    public static void main (String args[]){
        int [] arr={11,12,13,14,15};
        System.out.println(occurence(arr,0,20));
    }

        }
    
    