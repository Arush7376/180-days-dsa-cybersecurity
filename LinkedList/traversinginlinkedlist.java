package LinkedList;

//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val=val;
//        next=null;
//    }
//}

public class traversinginlinkedlist {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" " );
            temp=temp.next;
        }
        System.out.println();
    }
//    first node will made then connection will happen.
    public static void displayRec(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        displayRec(head.next);

    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
//        display(head);
          displayRec(head);
    }

}
