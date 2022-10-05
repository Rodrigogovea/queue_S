package queue_s;

public class queue 
{
    private int front, rear, size, capacity;
    private int queueArray[];
    
    queue(int theCapacity)
    {
        this.queueArray = new int[theCapacity];
        capacity = theCapacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    
    public void enqueue(int dato)
    {
        if(!isFull())
        {
            queueArray[rear] = dato;
            size++;
            rear++;
            System.out.println("Elemento encolado con éxito: " + dato);
        }
        else
        {
            System.out.println("La  cola ya está llena...");
        }
    }
    public void dequeue()
    {
        if(!isEmpty())
        {
            int aux = queueArray[front];
            queueArray[front] = 0;
            front++;
            System.out.println("Elemento atendido: " + aux);
            size--;
        }
        else
            System.out.println("No hay elementos en la fila...");
    }
    
    public int getFront()
    {
        return this.queueArray[front];
    }
    public int getRear()
    {
        return this.queueArray[rear];
    }
    
    public int getSize()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        if(this.size == 0)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if((queueArray.length) == size)
            return true;
        else
            return false;
    }
    
    public void showItems()
    {
        for(int i=0; i<10; i++)
        {
            System.out.print(this.queueArray[i] + " , ");

        }
        System.out.println("");
    }
    public int getCapacity()
    {
        return this.capacity;
    }
}
