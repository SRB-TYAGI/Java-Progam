// import java.util.ArrayList;

// public class Priority_Queue{

//     private ArrayList<Integer> heap;

//     public Priority_Queue(){
//         heap=new ArrayList<>();
//     }

//     boolean isEmpty(){
//         return heap.size()==0;
//     }
    
//     int size(){
//         return heap.size();
//     }

//     int getMin(){
//         if(isEmpty()){

//         }
//         return heap.get(0);
//     }



//     // insert new element

//     void insert(int element){
//         heap.add(element);
//         int childIndex=heap.size()-1;
//         int parentIndex=(childIndex-1)/2;

//         while(childIndex>0){
//             if(heap.get(childIndex)<heap.get(parentIndex)){
//                 int temp=heap.get(childIndex);
//                 heap.set(childIndex,heap.get(parentIndex));
//                 heap.set(parentIndex,heap.get(childIndex));
//                 childIndex=parentIndex;
//                 parentIndex=(childIndex-1)/2;
//             }
//             else{
//                 return;
//             }
//         }
//     }
//             int removeMin() throws PriorityQueueException {
//             if (isEmpty()) {
                
//                 throw new PriorityQueueException();
//             }
//             int temp=heap.get(0);
//             heap.set(0,heap.get(heap.size()-1));
//             heap.remove(heap.size()-1);
//             int index=0;
//             int minIndex=index;
//             int leftchildIndex=1;
//             int rightchildIndex=2;
    
//             while(leftchildIndex<heap.size()){
//                 if (heap.get(leftchildIndex)<heap.get(minIndex)){
//                     minIndex=leftchildIndex;
//                 }
    
//                 if(rightchildIndex<heap.size()&& heap.get(rightchildIndex)<heap.get(minIndex)){
//                     minIndex=rightchildIndex;
//                 }
//                 if (minIndex==index){
//                     break;
//                 }
//                 else{
//                     int temp1=heap.get(index);
//                     heap.set(index, heap.get(minIndex));
//                     heap.set(minIndex, temp1);
//                     index=minIndex;
//                     leftchildIndex=2*index+1;
//                     rightchildIndex=2*index+2;
//                 }
//             }
    
//             return temp;
//         }
//     public static void main(String args[]) throws PriorityQueueException{
//         Priority_Queue pq=new Priority_Queue();
//         int ans[]={5,1,2,0};
//         for (int i=0;i<ans.length;i++){
//             pq.insert(ans[i]);
//         }
//         while(!pq.isEmpty()){
//             System.out.print(pq.removeMin()+" ");
//         }
//     }
// }
// class PriorityQueueException extends Exception {
            
//         }





import java.util.ArrayList;

public class Priority_Queue {

	private ArrayList<Integer> heap;

	public Priority_Queue() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		if (isEmpty()) {
			
			throw new PriorityQueueException();
		}
	

		int temp=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int index=0;
		int minIndex=index;
		int leftchildIndex=1;
		int rightchildIndex=2;

		while(leftchildIndex<heap.size()){
			if (heap.get(leftchildIndex)<heap.get(minIndex)){
				minIndex=leftchildIndex;
			}

			if(rightchildIndex<heap.size()&& heap.get(rightchildIndex)<heap.get(minIndex)){
				minIndex=rightchildIndex;
			}
			if (minIndex==index){
				break;
			}
			else{
				int temp1=heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);
				index=minIndex;
				leftchildIndex=2*index+1;
				rightchildIndex=2*index+2;
			}
		}

		return temp;
	}
      public static void main(String args[]) throws PriorityQueueException{
        Priority_Queue pq=new Priority_Queue();
        int ans[]={5,1,2,0};
        for (int i=0;i<ans.length;i++){
            pq.insert(ans[i]);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.size()+" ");
        }
    }


}

class PriorityQueueException extends Exception {

}