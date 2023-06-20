package queue;

public class Queue1  {
int size;
int front,rear;
int arr[];
public Queue1(int size)
{
	this.size=size;
	front=rear=-1;
	arr=new int[size];
	
}
public boolean isFull()
{
	if(rear==size-1)
		return true;
	else
		return false;
	
}
public boolean isEmpty()
{
	if(front==-1 && rear==-1)
		return true;
	else
		return false;
}
public void enQueue(int ele)
{
	if(isFull())
		throw new Queue_Exception("Queue is full");
	else
	{
		if(front==-1)
			front=0;
		rear++;
		arr[rear]=ele;
		
		
	}
}
public int deQueue()
{
	int ele;
	if(isEmpty())
		throw new Queue_Exception("queue is empty");
	ele=arr[front];
	if(front==rear)
		front=rear=-1;
	else
		
	front++;
	return ele;
}
public void display()
{
	if(isEmpty()) {
     throw new Queue_Exception("can't display arr is empty");
	}
	for(int i=front;i<=rear;i++)
	{
		System.out.println(arr[i]);
	}
}




}
