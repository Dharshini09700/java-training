class Node{
    int  data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist{
    private static Node CreateFromArray(int arr[]){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1;i<arr.length;i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
    private static boolean SearchInd(Node head, int key){
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    private static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
    private static Node deleteTail(Node head){
        Node current = head;
        if(head == null || head.next == null){
            return null;
        }
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }
    private static Node deletePos(Node head, int pos){
        if(head == null){
            return null;
        }
        if(pos == 0){
            return deleteHead(head);
        }
        Node current = head;
        for(int i = 0; i<pos-1 && current != null;i++){
            current = current.next;
        }
        if(current == null || current.next == null){
            return null;
        }
        current.next = current.next.next;
        return head;
    }
    private static Node deleteNode(Node head, int key){
        if(head == null){
            return null;
        }
        if(head.data == key){
            return deleteHead(head);
        }
        Node cur = head;
        while(cur != null){
            if(cur.next.data == key){
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }
    private static Node insertHead(Node head,int data){


    }
    private static Node insertPos(Node head, int data, int pos){
        if(head == null || pos == 0){
            insertHead(head,data);
        }
        Node newNode = new Node(data);
        Node curr = head;
        for(int i = 0; curr != null && i<pos-1;i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    private static Node revNode(Node head){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node newNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = newNode;
        }
        return prev;
    }
    private static void PrintLL(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        Node head = CreateFromArray(arr);
        //System.out.println(SearchInd(head,6));
        //head = deleteHead(head);
        //PrintLL(head);
        head  = SearchInd(head,3);
        PrintLL(head);
    }
}