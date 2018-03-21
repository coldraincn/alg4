
public class Josephus {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        Queue<Integer> queue=new Queue<Integer>();
        for(int i =0;i<n;i++){
            queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            for(int j=1;j<m;j++ ){
                queue.enqueue(queue.dequeue());
            }
            StdOut.print(queue.dequeue());
        }


    
       
        StdOut.println();
      
    }
}