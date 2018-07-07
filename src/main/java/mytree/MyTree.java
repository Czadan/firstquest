package mytree;

public interface MyTree {

    void insert(int i);
    Node search(int i);
    Node min();
    void max();
    Node remove(int i) throws Exception;
    void showInOrder(Node node);
    void showPostOrder(Node node);
    void showPreOrder(Node node);
}
