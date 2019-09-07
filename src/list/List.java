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
  /*按num值查找*/
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
  /*取出第i个元素(从0开始计数)*/
  public Node getNode(int i){
      Node temp=head;
      int j=0;
      while(j<i&&temp!=null){
         temp=temp.next;
      }
      if(j==i){
          return temp;
      }else{
          return null;
      }
  }
  /*插入算法*/
  //在p节点之后插入
  public void insertNode(Node p,int num){
      Node s=new Node(num);
      s.next=p.next;
      p.next=s;
  }
  //在第i个元素之前插入一个元素(i从0开始计数)
    public void insertElementAt(int i,int num){
      Node s=new Node(num);
      int k=0;
      Node p=head;
      while(k<i-1&&p!=null){
         k++;
         p=p.next;
      }
      if(p!=null){
          s.next=p.next;
          p.next=s;
      }
    }

/*删除算法*/
//删除第i个元素，i从0开始计数
public void deleteNode(int i){
    Node p,l;
    p=head;
    int k=0;
    while(k<i-1&&p!=null){
     k++;
     p=p.next;
    }
   if(p!=null){
        l=p.next;
        p.next=l.next;
        l=null;  //释放被删除元素的空间
   }
}

}
