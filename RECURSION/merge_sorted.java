public class merge_sorted {

	public static void mergeSort(int[] input,int si,int ei){
		// Write your code here
			if (si>=ei){
				return ;
			}
			int mid=(si+ei)/2;
			mergeSort(input,si,mid);
			mergeSort(input,mid+1,ei);
			merge(input,si,ei);
	}
	private static void merge(int [] input,int si,int ei){
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei){
			if (input[i]<input[j]){
				ans[k]=input[i];
				i++;
				k++;
			}
			else {
				ans[k]=input[j];
				k++;
				j++;
			}
		}
		while(i<=mid){
			ans[k]=input[i];
			i++;
			k++;
		}
		while (j<=ei){
			ans[k]=input[j];
			k++;
			j++;
		}
		for (int index=0;index<ans.length;index++){
			input[si+index]=ans[index];
		}
	}
		public static void main(String args[]){
			int arr[]={5,2,8,9,1};
                mergeSort(arr,0,arr.length-1);
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		}

	}
