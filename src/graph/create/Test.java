package graph.create;

import graph.Search.BFSTraverse;
import graph.Search.DepthFirstSearch;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/21
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        Graph graph=new Graph();
        Vexnode[] vexnode=new Vexnode[4];
        for(int i=0;i<4;i++){
            vexnode[i]=new Vexnode();
        }
        graph.createGraph(vexnode);
      /*  DepthFirstSearch depthFirstSearch=new DepthFirstSearch();
        depthFirstSearch.DFSTraversr(vexnode);*/
        BFSTraverse bfsTraverse=new BFSTraverse();
        bfsTraverse.BFSTraverse(vexnode);
    }
}
