package day171;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class basiclinkedlist {
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
//        System.out.println(a.next);
        a.next=b;
        b.next=c;
        System.out.println(a.next);
    }
}
