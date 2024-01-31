import java.util.*;
public class Practice {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node currPtr=head;
        while(currPtr!=null){
            System.out.print(currPtr.data+" -> ");
            currPtr=currPtr.next;
        }
        System.out.print("null");
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.print("null");
            return;
        }
        Node currPtr=head;
        while(currPtr.next!=null){
            currPtr=currPtr.next;
        }
        currPtr.next=newNode;
    }
    public static void main(String[] args){
        Practice p1=new Practice();
        p1.addFirst("Sayan");
        p1.addFirst("CR7");
//        p1.printList();
        p1.addLast("LM10");
        p1.addLast("DM10");
        p1.printList();
    }


}
