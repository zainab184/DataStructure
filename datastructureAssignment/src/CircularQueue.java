package datastructureAssignment;
class CircularQueue {
    int MAX = 5;
    int[] queue = new int[MAX];
    int front = -1;
    int rear = -1;
    void enqueue(int data) {
        if ((rear + 1) % MAX == front) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % MAX;
        queue[rear] = data;
        System.out.println("Added: " + data);
    }
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else
            front = (front + 1) % MAX;
        }
    
    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;
            i = (i + 1) % MAX;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
