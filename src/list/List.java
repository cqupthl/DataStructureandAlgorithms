package list;

public class List {
    Node head=null;

    /*
      遍历节点
     */
   public void sysNode(){
       Node temp=head;
       while(temp!=null){
           if(temp.next==null){
               System.out.println(temp.toData());
           }else{
               System.out.print(temp.toData()+"---");
           }
           temp=temp.next;
       }

   }
    /*增加节点
    */
    public void addNode(int num){
        Node newNode=new Node(num);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
  /*长度
  * */
  public int length(){
      Node temp=head;
      int length=0;
      while(temp!=null){
          length++;
          temp=temp.next;
      }
      return length;
  }
  /*按值查找*/
  public boolean findNode(int num){
      Node temp=head;
      if(head==null){
          return false;
      }
      while(temp!=null){
          if(num==temp.data){
              return true;
          }
          temp=temp.next;
      }
      return false;
  }
}
