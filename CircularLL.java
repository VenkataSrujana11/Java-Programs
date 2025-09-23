class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CircularLL {
    static void printList(Node curr,Node head){
        if(head==null) return;
        System.out.print(curr.data+" ");
        if(curr.next==head) return;
        printList(curr.next,head);
    }
    public static void main(String argss[]){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head;

        printList(head,head);
    }
}
