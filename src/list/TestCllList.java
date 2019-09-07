package list;

public class TestCllList {

    public static void main(String[] args) {
        CllList cllList=new CllList();
        for(int i=0;i<6;i++){
            cllList.addCllNode(i);
        }
        System.out.println(cllList.cllListLength());
        cllList.printCllList();
    }
}
