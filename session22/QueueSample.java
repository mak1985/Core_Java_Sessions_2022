package session22;

import java.util.PriorityQueue;

public class QueueSample {

    public static void main(String[] args) {

        // create priority queue
        PriorityQueue pq = new PriorityQueue();
        //pq.add("Makhan");
        pq.add(200);
        pq.add(300);
        pq.add(400);
        pq.add(999);
        //pq.add(1000);
//        System.out.println(pq);

        //offer() - Insert the specific element into the queue, if the task is successfully, offer() returns true, if not then false
//        pq.offer(500);
//        System.out.println(pq);//[100, 200, 300, 400, 500]
//        pq.offer(500);
//        pq.offer(100);
//        System.out.println(pq);

        //To access - element()
        //System.out.println(pq.element()); //It's checks head of the queue

        //peek() -
        //System.out.println(pq.peek()); //null

        //remove()
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.remove());//400
        System.out.println(pq);//999, 1000

        //poll()
        System.out.println(pq.poll());//999
        System.out.println(pq);//1000
        System.out.println(pq);
        System.out.println(pq.poll());//null


        pq.add(2000);
        pq.add(3000);
        System.out.println(pq.element());
    }
}
