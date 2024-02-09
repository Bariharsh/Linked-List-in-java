public class SingleLinkedList {
    public Node head;
    public Node  tail;
    private int size;

    SingleLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add - first,last
    // add - first
    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    // add - last
    public void addlast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node curnode = head;
        while(curnode.next != null) {
            curnode = curnode.next;
        }
        curnode.next = newnode;
    }
    // display all
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curnode = head;
        while(curnode != null) {
            System.out.print(curnode.data + "  --> ");
            curnode = curnode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        size--;
        head = head.next;
    }

    // delete last
    public void deletelast(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;

        while(lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }
    //size
    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addfirst("is");
        list.addfirst("a");

        list.addlast("list");

        
        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();

        System.out.println(list.getsize());

        list.addfirst("This");
        System.out.println(list.getsize());

    }
}
