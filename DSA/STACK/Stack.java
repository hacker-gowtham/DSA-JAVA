public class Stack {

    int a[] =new int[10];
    int top=-1;

    void push(int item)
        {
        top++;
            if(top==9)
            {
                System.out.println("Stack is full");
            }
            else{
                a[top]=item;
            }
        }
    int pop()
    {
            if(top>=0)
            {
                System.out.println("TOP ELEMENT IS POPED");
                return a[top--]; 
            }
            else
            {
               System.out.println("Stack is empty"); 
               return -1;
            }
          

           
       
    }

    int peek()
    {
        return a[top];
    }
    
    public void display() 
    {
            if(top==-1){
                System.out.println("stack is ");
            }

        for(int i=0;i<=top;i++)
        {
            System.out.print(a[i] +"  ");
        }
    }
    
}
