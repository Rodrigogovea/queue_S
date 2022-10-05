package queue_s;

public class Queue_S 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        queue colas = new queue();
        colas.enqueue(1);
        colas.enqueue(2);
        colas.enqueue(3);
        colas.enqueue(4);
        colas.enqueue(5);
        colas.enqueue(6);
        colas.enqueue(7);
        colas.enqueue(8);
        colas.enqueue(9);
        colas.enqueue(10);
        
        
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
        
        colas.dequeue();
        colas.showItems();
    }
}
