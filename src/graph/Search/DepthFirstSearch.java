package graph.Search;

import graph.create.Arcnode;
import graph.create.Vexnode;

/**
 * @ClassName DepthFirstSearch
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/21
 * @Version V1.0
 **/
public class DepthFirstSearch {
    public void DFS(Vexnode[] graph,int i,boolean[] type){
        Arcnode arcnode=new Arcnode();
        type[i]=true;
        System.out.println(graph[i].getXexData());
        arcnode=graph[i].getFirstArc();
        while(arcnode.getNextArc()!=null){
            if(!type[arcnode.getAdjvex()]){
                DFS(graph,arcnode.getAdjvex(),type);
            }
            arcnode=arcnode.getNextArc();
        }

    }
    public void DFSTraversr(Vexnode[] graph){
        boolean[] type=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            type[i]=false;
        }

        for(int j=0;j<graph.length;j++){
            if(!type[j]){
                DFS(graph,j,type);
            }
        }
    }
}
