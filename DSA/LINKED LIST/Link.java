public class Link {
   public static void main(String[] args) {
    LinkedList list =new LinkedList();
    list.InsertAtBeg(7);
    list.InsertAtBeg(5);
    list.InsertAtBeg(56);
    list.InsertAtBeg(76);
    list.InsertAtBeg(96);
    list.InsertAtPos(2, 9);
    list.InsertAtPos(4, 99);
    list.DeleteAtPos(3);
    System.out.println("  ");
    list.display();
   } 
}
