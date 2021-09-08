package com.company;

class Queue
{
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;


    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }


    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("Overflow");
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }



    public void dequeue()
    {

        if (isEmpty())
        {
            System.out.println("Underflow");

        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    public int size() {
        return count;
    }
    public Boolean isEmpty() {
        return (size() == 0);
    }
    public Boolean isFull() {
        return (size() == capacity);
    }
}

class Main
{
    public static void main (String[] args)
    {

        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}