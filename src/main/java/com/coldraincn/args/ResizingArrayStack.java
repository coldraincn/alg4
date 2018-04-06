package com.coldraincn.args;

import java.util.Iterator;
/**
 * args 1.1
 */
public class ResizingArrayStack<Item> implements Iterable<Item>{
    private int n=0;
    private Item[] list=(Item[]) new Object[1];
    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public Item pop(){
        Item item=list[--n];
        item=null;
        if(n>0&&n==list.length/4){
            Item[] listCache=(Item[]) new Object[list.length/2];
            for(int i=0;i<n;i++){
                listCache[i]=list[i];
            }
            list=listCache;
        }
          
        return item; 
    }
    public void push(Item item){
        if(n==list.length){
            Item[] listCache=(Item[]) new Object[2*n];
            for(int i=0;i<n;i++){
                listCache[i]=list[i];
            }
            list=listCache;
        }
        list[n++]=item;
    }
    public Iterator<Item> iterator(){
        return new RASIterator();
    }
    private class RASIterator implements Iterator<Item>{
        private int i=n;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return list[--i];
        }
        public void remove(){

        }
    }
    
}    