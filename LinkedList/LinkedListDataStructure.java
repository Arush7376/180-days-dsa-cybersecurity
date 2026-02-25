package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LinkedList{ // user defined data structure.
    Node head;
    Node tail;
    int size=0;
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val) {
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;

        }
        size++;
    }
    void deleteAtHead() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;

    }
    void search(int data){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.val==data){
                return;
            }
            temp=temp.next;
        }
    }
    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.print("Invalid index");
            return;
        }
        if(idx==0)addAtHead(val);
        else if(idx==size)addAtTail(val);
        else{
            Node temp=head;
            for(int i=0;i<=idx-1;i++){
                temp=temp.next;

            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.print("Invalid Index");
            return;
        }
        if(idx==0){
            deleteAtHead();
        }
        Node temp=head;
        for(int i=0;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1){tail=temp;}
        size--;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.display();
        list.addAtHead(4);
        list.addAtHead(5);
        list.addAtHead(6);
        list.display();
        list.deleteAtHead();
        list.display();
        list.search(4);
        list.display();
        list.insert(2,2);
        list.display();
        list.delete(2);
        list.display();

    }

}
// jab linked list ko kisi platform p solve krte h .
//
// Questions kaunse se krne h .. middle of linked list;
// slow fast pointer approach
//  Node slow
//  Node fast
//  While(fast!=null && fast.next!=null){
//       slow=slow.next;
//       fast=fast.next.next;
//      }
// return slow.data;
