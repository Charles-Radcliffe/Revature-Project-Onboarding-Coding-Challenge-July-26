public class Stack<E> {
    public class Node{
        E data;
        Node next;
    }
    Node head;

    Stack(){
        head = null;
    }
    public boolean empty(){
        return(head == null);
    }
    public E peak(){
        return head.data;
    }
    public E pop(){
        E data = head.data;
        head = head.next;
        return data;
    }
    public E push(E newData){
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = head;
        head = newNode;
        return head.data;
    }
    public int search(E searchItem){
        Node curr = head;
        int i = 0;
        while(curr != null){
            i++;
            if(searchItem == curr.data){
                return i;
            }else{
                curr = curr.next;
            }
        }
        return -1;
    }
}
