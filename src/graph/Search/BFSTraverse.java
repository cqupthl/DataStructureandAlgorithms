package graph.Search;

import graph.create.Arcnode;
import graph.create.Vexnode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName BFSTraverse
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/21
 * @Version V1.0
 **/
public class BFSTraverse {
    public void BFSTraverse(Vexnode[] graph){
         Arcnode arcnode=new Arcnode();
         Queue<Integer> queue = new LinkedList<Integer>();
         Boolean []type=new Boolean[graph.length];

         for(int i=0;i<graph.length;i++){
             type[i]=false;
         }
         for(int j=0;j<graph.length;j++){
             if(!type[j]){
                 type[j]=true;
                 System.out.println(graph[j].getXexData());
                 queue.add(j);

                 while(!queue.isEmpty()){

                     arcnode=graph[queue.poll()].getFirstArc();
                     while(arcnode!=null){
                         if(!type[arcnode.getAdjvex()]){
                             type[arcnode.getAdjvex()]=true;
                             System.out.println(graph[arcnode.getAdjvex()].getXexData());
                             queue.add(arcnode.getAdjvex());
                         }
                         arcnode=arcnode.getNextArc();
                     }
                 }



             }
         }

    }
}
