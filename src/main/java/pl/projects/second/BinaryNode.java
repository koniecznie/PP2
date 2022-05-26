package pl.projects.second;

public class BinaryNode {
    private int wartość;
    private BinaryNode lewy = null;
    private BinaryNode prawy = null;

    BinaryNode(int wartość) {
        this.wartość = wartość;
    }

    public BinaryNode getPrawy() {
        return prawy;
    }

    public BinaryNode getLewy() {
        return lewy;
    }

    public void setLewy(BinaryNode lewy) {
        this.lewy = lewy;
    }

    public int getWartość() {
        return wartość;
    }

    public void setPrawy(BinaryNode prawy) {
        this.prawy = prawy;
    }

}
