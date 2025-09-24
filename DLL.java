import java.util.Scanner;
public class DLL {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ele;
        LinkedList list=new LinkedList();
        while((ele=sc.nextInt())!=-1){
            list.insertAtEnd(ele);
        }
        list.printrev();
    }
    static class LinkedList{
        Node head=null,tail=null;
        void insertAtEnd(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        void printrev(){
            Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
        }
    }
    static class Node{
        int data;
        Node prev=null,next=null;
        Node(int d){
            data=d;
        }
    }
}