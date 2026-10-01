class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
        this.next=null;
        this.back=null;
    }
    Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
        
    }
}
public class DoubleLL{
    private static Node CreateLLFromArray(int []arr){
        Node head=new Node(arr[0]);
        Node prev =head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;

    }
    private static Node remHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    private static Node remTail(Node head){
        Node cur = head;
        if(head == null && head.next == null){
            return null;
        }
        while(cur.next != null){
            cur = cur.next;
        }
        cur.back.next = null;
        cur.back = null;
        return head;
    }
    private static Node remPos(Node head, int pos){
        if(head == null){
            return null;
        }
        if(pos == 0){
            return remHead(head);
        }
        Node cur = head;
        for(int i = 0;i<pos && cur != null;i++){
            cur = cur.next;
        }
        if(cur == null){
            return head;
        }
        cur.back.next = cur.next;
        if(cur.next != null)
            cur.next.back = cur.back;
        cur.back = null;
        cur.next = null;
        return head;
    }
    private static Node remNode(Node head,int key){
        if(head == null){
            return null;
        }
        if(head.data == key){
            return remHead(head);
        }
        Node cur = head;
        while(cur != null && cur.data  != key){
            cur = cur.next;
        }
        if(cur == null){
            return head;
        }
        cur.back.next = cur.next;
        if(cur.next != null){
            cur.next.back = cur.back;
            cur.back = null;
            cur.next = null;
        }
        return head;
    }
    private static void printLL(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        Node head=CreateLLFromArray(arr);
        head = remNode(head,3);
        printLL(head);

    }
    
}