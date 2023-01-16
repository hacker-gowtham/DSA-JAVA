public class StackDemo {
    public static void main(String[] args) {
         Stack stack=new Stack();
        stack.push(7);
        stack.push(67);
        stack.push(87);
        stack.push(97);
        stack.display();
        stack.pop();
         System.out.println();
        stack.display();
        System.out.println();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
