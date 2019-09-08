package list;

public class DouList {
    DouNode head=null;

    public void addNode(int num){
        DouNode newNode=new DouNode(num);
        if(head==null){
            head=newNode;
            head.next=head;
            head.pre=head;
        }else{
            DouNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
           newNode.pre=temp;
            newNode.next=head;
            head.pre=temp;
            temp.next=newNode;
        }
    }

    public void printNode(){
        DouNode temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"---");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertNode(int i,int num){
        DouNode newNode=new DouNode(num);
        int j=0;
        DouNode temp=head;
        while(j<i&&temp.next!=head){
            j++;
            temp=temp.next;
        }
        if(j==i){
            newNode.pre=temp.pre;
            newNode.next=temp;
            temp.pre.next=newNode;
            temp.pre=newNode;

        }

    }
}
