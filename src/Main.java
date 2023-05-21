import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(5, "Apple");
        bst.put(2, "Banana");
        bst.put(7, "Orange");
        bst.put(1, "Grapes");
        bst.put(4, "Mango");
        bst.put(6, "Pineapple");
        bst.put(8, "Watermelon");

        System.out.println("Size of the tree: " + bst.size());

        // Retrieve values using keys
        System.out.println("Value at key 2: " + bst.get(2));
        System.out.println("Value at key 7: " + bst.get(7));

        bst.delete(4);

        System.out.println("Size after deletion: " + bst.size());

        Iterator<BST.NodeData<Integer, String>> iterator = bst.iterator();
        while (iterator.hasNext()) {
            BST.NodeData<Integer, String> nodeData = iterator.next();
            System.out.println("Key: " + nodeData.getKey() + ", Value: " + nodeData.getValue());
        }
    }
}
