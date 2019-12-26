package graph.create;

/**
 * @ClassName Arcnode
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/18
 * @Version V1.0
 **/
public class Arcnode {
    private int adjvex;
    private Arcnode nextArc;
    private Object info;

    public int getAdjvex() {
        return adjvex;
    }

    public void setAdjvex(int adjvex) {
        this.adjvex = adjvex;
    }

    public Arcnode getNextArc() {
        return nextArc;
    }

    public void setNextArc(Arcnode nextArc) {
        this.nextArc = nextArc;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
