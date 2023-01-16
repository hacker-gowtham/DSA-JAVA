public class LinkedList {
    Node head;   

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

        LinkedList(){
            head=null;
        }

       public void InsertAtBeg(int val ){
             Node newNode= new Node(val);

             if(head==null){
                head=newNode;
             }
             else{
                newNode.next=head;
                head=newNode;
             }

       }

       public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println("  ");
        System.out.println(temp.data +" ");
        temp=temp.next;
        }
       }


       public void InsertAtPos(int pos,int val)
       {

            Node newNode=new Node(val);
               Node temp=head;
               for(int i=0;i<pos;i++){
                temp=temp.next;
               }
               newNode.next=temp.next;
               temp.next=newNode;

       }

       public void DeleteAtPos(int pos){
       Node prev=null;
       Node temp=head;
       for(int i=0 ;i<pos;i++){
        prev=temp;
        temp=temp.next;
       }
       prev.next=temp.next;
       

    }
  



}

