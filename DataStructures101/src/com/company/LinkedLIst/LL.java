package com.company.LinkedLIst;

import java.util.Scanner;

public class LL {
    static Scanner sc= new Scanner(System.in);
    public Node head;
    public Node tail;
    public int size;
    public LL()
    {
        this.size=0;
    }
    public class Node
    {
        int value;
        Node next;
        public  Node (int value)
        {
            this .value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    public  void InsertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
         temp=temp.next;
        }
        return temp;
    }
    public void DeleteLast()
    {
        int val=tail.value;
        System.out.println(val);
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
    }
    public void Delete(int index)
    {
        Node node=get(index-1);
        System.out.println(node.next.value);
        node.next=node.next.next;
    }
    public void display1()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void InsertEnd(int val1)
    {
        Node node1=new Node(val1);
        tail.next=node1;
        tail=node1;
        size++;
    }
    public void Insert(int val)
    {
        Node temp=head;
        int pos =sc.nextInt();
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        Node node3=new Node(val,temp.next);
        temp.next=node3;
        size++;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


}
