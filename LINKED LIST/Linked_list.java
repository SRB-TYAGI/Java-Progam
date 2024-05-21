// public class Linked_list{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addfirst(int data){
//         // step 1= create new node
//         Node newNode =new Node(data);
//         if (head==null){
//             head=tail=newNode;
//             return ;
//         }

//         // Step 2= new node next =head
//         newNode.next=head; // fLink

//         // Step 3=head =newnode;
//         head =newNode;

//     }
    
//      public void addlast(int data){
//         Node newNode=new Node(data);
//         if (head ==null){
//             head =tail=newNode;
//             return ;
//         }
//         tail.next=newNode;
//         tail=newNode;

//      }
//      // print linked list

//      public void print(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//      }
//     public static void main (String args[]){
//         Linked_list ll=new Linked_list();
//         ll.print();
//         ll.addfirst(1);
//         ll.print();
//         ll.addfirst(2);
//         ll.print();
//         ll.addlast(5);
//         ll.print();
//         ll.addlast(6);
//         ll.print();

//     }
// }

// public class Linked_list{
//     public static class Node{
//         int data;
//         Node Next;
//         public Node(int data){
//             this.data=data;
//             this.Next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){

//     Node newnode=new Node(data);
//     if(head ==null){
//         head=tail=newnode;
//         return;

//     }
//     newnode.next=head;
//     head=newnode;
// }
// public static void main(String args[]){
//     Linked_list ll=new Linked_list();
//     ll.addfirst(1);
//     ll.addfirst(2);
// }
// }


// import java.util.ArrayList;
// import java.util.List;

// public class Linked_list {
//     public static double minimum(List<? extends Number> list) {
//         if (list == null || list.isEmpty()) {
//             throw new IllegalArgumentException("List is null or empty");
//         }

//         double min = Double.POSITIVE_INFINITY;
//         for (Number number : list) {
//             double value = number.doubleValue();
//             if (value < min) {
//                 min = value;
//             }
//         }

//         return min;
//     }

//     public static void main(String[] args) {
//         List<Integer> integerList = new ArrayList<>();
//         integerList.add(5);
//         integerList.add(3);
//         integerList.add(9);
//         double minInteger = minimum(integerList);
//         System.out.println("Minimum integer value: " + minInteger);

//         List<Double> doubleList = new ArrayList<>();
//         doubleList.add(2.5);
//         doubleList.add(1.8);
//         doubleList.add(3.7);
//         double minDouble = minimum(doubleList);
//         System.out.println("Minimum double value: " + minDouble);
//     }
// }


public class Linked_list{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){

    

     Node newnode =new Node(data);
     if (head==null){
        head=tail=newnode;
        return;
     }
     newnode.next=head;
     head=newnode;
}
    public static void main(String args[]){
        Linked_list ll=new Linked_list();
        ll.addfirst(1);
    }
}

// public class Linked_list{
//     public class Node{
//         int data;
//         Node next;

//         public Node()
//     }
// }