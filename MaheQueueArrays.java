public class MaheQueueArrays {
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.push(4);
        q.push(5);
        q.push(8);
        q.push(10);
        //q.push(12);
        q.pop();
        q.top();
        q.size();
    }
}
class Queue {
    private int arr[];
    private int front, rear, currSize, maxSize;

    Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        int front = -1;
        int rear = -1;
        int currSize = 0;
    }

    public void push(int element) {
        if (currSize == maxSize) {
            System.out.println("Queue is full");
            System.exit(1);
        }
        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            arr[rear % maxSize] = element;
            rear++;
            System.out.println("Queue pushed element is " + element);
            currSize++;
        }
    }

    public void pop() {
        if (currSize==0) {
            System.out.println("Queue is empty");
            System.exit(1);
        } else {
            System.out.println("Popped element is "+arr[front]);
            arr[front%maxSize]=-1;
            front++;
            currSize--;
        }
    }
    public void top(){
        if(currSize==0){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        System.out.println("Top of the element is "+arr[front]);
    }
    public void size(){
        System.out.println("Current size of the Queue "+currSize);
    }

}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
Queue pushed element is 4
Queue pushed element is 5
Queue pushed element is 8
Queue pushed element is 10
Popped element is 4
Top of the element is 5
Current size of the Queue 3
*/
