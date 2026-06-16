class MyCircularQueue {
      int n;
      int front;
      int rear;
      int[] arr;
      int size;

    public MyCircularQueue(int k) {
        arr=new int[k];
        front=-1;
        rear=-1;
        size=0;
        n=k;
    }
    
    public boolean enQueue(int value) {
        if(size==n) return false;
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1)%n;
        }
        arr[rear]=value;
        size++;
        return true;
       
    }
    
    public boolean deQueue() {
        if(size==0) return false;
        else{
            front=(front+1)%n;
        }
        size--;
        
        return true;
    }
    
    public int Front() {
        if(size==0)
        return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(size==0)
        return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==n;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */