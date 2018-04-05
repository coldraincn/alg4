package com.coldraincn.char15;
import static org.junit.Assume.assumeNoException;

import com.coldraincn.libs.*;
public class QuickUnionPathCompressionUF{

    private int[] id;
    private int count;

    public QuickUnionPathCompressionUF(int N){
        count=N;
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }
    public int count(){
        return count;
    }
    public boolean connected(int p,int q){
        return find(p)==find(q);
    }
    public int find(int p){
        return 1;
    }
    public void union(int p,int q){

    }
    public static void main(String[] args){
        int N= StdIn.readInt();
        QuickUnionPathCompressionUF uf=new QuickUnionPathCompressionUF(N);
        while(!StdIn.isEmpty()){
            int p=StdIn.readInt();
            int q=StdIn.readInt();
            if(uf.connected(p, q)){
                continue;
            }
            uf.union(p, q);
            StdOut.println(p+" "+q);
        }
        StdOut.println(uf.count()+"componts");
    }
}