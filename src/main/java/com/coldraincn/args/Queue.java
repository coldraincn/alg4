package com.coldraincn.args;

/**
 * args 1.3
 */
public class Queue<Item> implements Iterable<Item>{
    private class Node{
        Item item;
        Node next;
    }
    private int N;
    private Node first;
    private Node last;
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void enqueue(Item item){
        Node oldLast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()){
            first=last;
        }else{
            oldLast.next=last;
        }
        N++;
    }
    public Item dequeue(){
        Item item=first.item;
        first=first.next;
        N--;
        if(isEmpty()){
            last=null;
        }
        
        return item;
    }
}