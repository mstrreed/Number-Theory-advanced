package com.company.LinkedLIst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	LL linked=new LL();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
        linked.InsertFirst(sc.nextInt());
    }
    linked.display1();
    /*linked.InsertEnd(13);
linked.display();
linked.InsertEnd(14);
linked.display();
linked.Insert(sc.nextInt());
linked.display();*/
linked.DeleteLast();
linked.display();
linked.Delete(2);
linked.display();
    }
}
