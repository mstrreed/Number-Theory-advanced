package com.company.LinkedLIst;

public class DLL {
    public int size;
    public Node head;
    public Node tail;

    public DLL() {
        this.size = 0;
    }


    public class Node {
        public int value;
        public Node next;
        public Node prev;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(head.next!=null)
        {
            head.next.prev = head;
        }
        if (tail==null)
        {
            tail = head;
        }
        size++;
    }
        public void display ()
        {
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            System.out.println("END");
        }
        public void revDisplay()
        {
            Node temp=tail;
            while(temp!=null)
            {
                System.out.print(temp.value+"->");
                temp=temp.prev;
            }
            System.out.println("START");
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
    public void insert (int index,int val)
        {
            Node node1=get(index-1);
            Node node =new Node(val,node1.next,node1);
            node.next.prev=node;
            node1.next=node;
        }
    }