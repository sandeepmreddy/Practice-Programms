package algo;

public class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

    Queue(int capacity)
    {
        size=0;
        queue= new int[capacity];
        rear=-1;
        front=0;

    }

    void enQueue(int ele)
    {
        if(isFull())
        {
            System.out.println("algo.Queue is full");
        }else
        {
            rear = rear+1 % queue.length;
            queue[rear]=ele;
            size++;
        }

    }

    int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("algo.Queue is empty");
            return -1;
        }else
        {
            int element = queue[front];
            front = front+1 % queue.length;
            size--;
            return element;
        }
    }

    boolean isFull()
    {
        if(queue.length == size)
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
    {
        if(queue.length == 0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
