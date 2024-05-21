import java.util.*;
public class Linkedlistuse{
    public class Node<T>{
        T data;
        Node <T> next;
        Node(T data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String args[]){
        Node<Integer> node1=new Node<Integer>(15);
        Node<Integer> node2=new Node<Integer>(20);
        Node<Integer> node3=new Node<Integer>(30);
        node1.next=node2;
        node2.next=node3;
        Node <Integer> head=node1;

        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
}