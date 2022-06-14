package com.company.LinkedLIst;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        DLL list=new DLL();
        CLL list1=new CLL();
        Scanner sc=new Scanner(System.in);
       /* for(int i=0;i<5;i++)
        {
            list.insertFirst(sc.nextInt());
        }*/
        for(int i=0;i<5;i++)
        {
            list1.Insert(sc.nextInt());
        }
        System.out.println(list1.tail.next.value);
        list1.display();
       /* list.display();
        list.revDisplay();
        list.insert(sc.nextInt(),sc.nextInt());
        list.display();
        list.revDisplay();*/

    }
}
