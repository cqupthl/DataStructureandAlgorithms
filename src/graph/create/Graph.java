package graph.create;

import java.util.Scanner;

/**
 * @ClassName Graph
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/18
 * @Version V1.0
 **/
public class Graph {
    public void createGraph(Vexnode[] graph) throws Exception{

        Arcnode e;
        int numberArcnode,numberVexnode;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入边数和顶点数");
        numberArcnode=scanner.nextInt();//边数
        numberVexnode=scanner.nextInt();//顶点数

        for(int i=0;i<numberVexnode;i++){
            int b=scanner.nextInt();
          graph[i].setXexData(b);
          graph[i].setFirstArc(null);

        }
        for(int k=0;k<numberArcnode;k++){
            System.out.println("请输入顶点号");
            int i=scanner.nextInt();
            int j=scanner.nextInt();

            e=new Arcnode();
            e.setAdjvex(j);
            e.setNextArc(graph[i].getFirstArc());
            graph[i].setFirstArc(e);

            e=new Arcnode();
            e.setAdjvex(i);
            e.setNextArc(graph[j].getFirstArc());
            graph[j].setFirstArc(e);


        }
    }
}
