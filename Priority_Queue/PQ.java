import java.util.ArrayList;
public class PQ {
	public ArrayList<Integer> heap;
	public PQ(){
		heap=new ArrayList<>();
	}
	boolean isEmpty() {
		return heap.size()==0;
	}

	int getSize() {
			return heap.size();
	}

	int getMax() {
		
	return heap.get(0);
	}

	void insert(int element) {
	heap.add(element);
	int childIndex=heap.size()-1;
	int parentIndex=(childIndex-1)/2;

	while(childIndex>0){
		if (heap.get(childIndex)>heap.get(parentIndex)){
				int temp=heap.get(childIndex);
				heap.set(childIndex,heap.get(parentIndex));
				heap.set(parentIndex,temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
		}
		else{
			return;
		}
	
	}
	}

	int removeMax() {
		int temp=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int index=0;
		int maxIndex=index;
		int leftchildIndex=1;
		int rightchildIndex=2;

		while(leftchildIndex<heap.size()){
			if (heap.get(leftchildIndex)>heap.get(maxIndex)){
				maxIndex=leftchildIndex;
			}
			if(rightchildIndex>heap.size()&& heap.get(rightchildIndex)>heap.get(maxIndex)){
				maxIndex=rightchildIndex;
			}
			if (maxIndex==index){
				break;
			}
			else{
				int temp1=heap.get(index);
				heap.set(index, heap.get(maxIndex));
				heap.set(maxIndex, temp1);
				index=maxIndex;
				leftchildIndex=2*index+1;
				rightchildIndex=2*index+2;
			}
		}

		return temp;

		}
	}

   class PriorityQueueException extends Exception {

}