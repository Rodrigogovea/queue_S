package queue_s;

public class Queue_S 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        queue colas = new queue(10);
        colas.enqueue(1);

        colas.showItems();

        colas.dequeue();
        
        colas.showItems();

        colas.dequeue();
        colas.showItems();
    }
}
