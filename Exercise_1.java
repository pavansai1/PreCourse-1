class Stack {

    // Time complexity: O(1)
    // Space complexity: O(n)



    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    }
    boolean isFull()
    {
        return top > MAX;
    }

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    {
        if(isFull()) {
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    {
        if(isEmpty()) {
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
