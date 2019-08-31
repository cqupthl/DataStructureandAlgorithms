package list;

public class List {
    Node head=null;

    /*
      遍历节点与长度
     */
   public void sysNode(){
       Node temp=head;
       while(temp!=null){
           if(temp.next==null){
               System.out.println(temp.toData());
           }else{
               System.out.println(temp.toData()+"---");
           }
           temp=temp.next;
       }

   }
    /*增加节点
    */
    public void addNode(int num){
        Node newNode=new Node(1);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
            }
            temp=newNode;
        }

    }

}
