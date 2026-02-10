class ll {
    Node head; // Step 1: Define head

    class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
// Working on deleting elememt from linked list.
//    Delete first - jab bhi phele wala head khi whi dusri jagah point krdenege.
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        // Step 2: Change condition to print the LAST node too
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void reverseList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        ll list = new ll();

        // Note: addFirst pushes items to the front (like a stack)

        list.addFirst("created");
        list.addFirst("list");
        list.addFirst("linked");


        list.printList();
        list.reverseList();
        list.printList();
        // Output: created -> linked -> list -> NULL
    }
}