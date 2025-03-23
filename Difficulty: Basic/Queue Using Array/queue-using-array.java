//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 
System.out.println("~");
}
	}
}




// } Driver Code Ends




class MyQueue {

    int rear;
	int arr[] = new int[100005];
	int size;

    MyQueue()
	{
		size=arr.length;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(rear==size-1){
	        return;
	    }
	    arr[++rear] = x;
	    
	    // Your code here
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(rear==-1){
	        return -1;
	    }
	    int front = arr[0];
	    for(int i=0;i<rear;i++){
	        arr[i] = arr[i+1];
	    }
	    --rear;
	    return front;
		// Your code here
	} 
}




