package com.company.LinkedLIst;

public class CLL {
    int size;
    Node head;
    Node tail;

    public class Node
    {
       int value;
       Node next;
       public Node(int value)
       {
           this.value=value;
       }
       public Node (int value,Node next)
       {
           this.value=value;
           this.next=next;
       }
    }
    public void Insert (int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=head;
            return;
        }
        node.next=head;
        head=node;
        tail.next=head;
        size++;
    }
    public void display()
    {
        Node temp=head;
        if(temp!=null) {
            do {
                System.out.print(temp.value + "->");
                temp=temp.next;
            }

            while (temp != head);
        }
        System.out.println("END");
    }

}
