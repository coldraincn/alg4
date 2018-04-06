package com.coldraincn.args;

/**
 * args 1.2
 */
public class Stack<Item> implements Iterable<Item>{
    private class Node{
        Item item;
        Node next;
    }
    private int N=0;
    private Node first;

    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public void Push(Item item){
        Node oldFirst=first;
        first=new Node();
        first.item=item;
        first.next=oldFirst;
        N++;
    }
    public Item pop(){
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }
    

}