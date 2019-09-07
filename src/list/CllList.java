package list;

/*循环链表*/
public class CllList {
    Node head=null;

    public void addCllNode(int num){

        Node newNode=new Node(num);

       if(head==null){
           head=newNode;
           head.next=head;
       }else{
           Node temp=head;
           while(temp.next!=head){
               temp=temp.next;
           }
           temp.next=newNode;
           newNode.next=head;
       }

    }

    public int cllListLength(){
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
            if(temp==head){
                break;
            }
        }
        return  length;
    }
    public void printCllList(){
        Node temp=head;
        while(temp!=null){
            if(temp.next==head){
                System.out.println(temp.data);
                break;
            }else{
                System.out.print(temp.data+"---");
                temp=temp.next;
            }
        }

    }
}
