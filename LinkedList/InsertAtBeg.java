import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }

}
public class LinkedListStriver {
    static ListNode InsertAtFirst(int val,ListNode head){
        ListNode newNode=new ListNode(val);
        newNode.next=head;
        head=newNode;
        return head;
    }
    static void printList(ListNode head){
        ListNode temp=head;
        for(;temp!=null;temp=temp.next)
            System.out.print(temp.val+"->");
        System.out.println("null");

    }

    public static void main(String[] args) {
        ListNode head=null;
        head=InsertAtFirst(40,head);
        head=InsertAtFirst(30,head);
        head=InsertAtFirst(20,head);
        head=InsertAtFirst(10,head);
        System.out.println("Insert before 5 insert at beginning ");
        printList(head);
        head=InsertAtFirst(5,head);
        System.out.println("Insert after 5 insert at beginnning");
        printList(head);

    }


}

-----------------------------------------------------------------------------------------------------------
  /*
Insert before 5 insert at beginning 
10->20->30->40->null
Insert after 5 insert at beginnning
5->10->20->30->40->null


  */
