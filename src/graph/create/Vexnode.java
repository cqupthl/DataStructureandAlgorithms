package graph.create;

/**
 * @ClassName Vertex
 * @Description: 顶点
 * @Author hl
 * @Date 2019/12/18
 * @Version V1.0
 **/
public class Vexnode {
    private int xexData;
    private Arcnode firstArc;


    public int getXexData() {
        return xexData;
    }

    public void setXexData(int xexData) {
        this.xexData = xexData;
    }

    public Arcnode getFirstArc() {
        return firstArc;
    }

    public void setFirstArc(Arcnode firstArc) {
        this.firstArc = firstArc;
    }
}
