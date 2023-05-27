public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(5, "Asyl");
        bst.put(2, "Ruslan");
        bst.put(7, "Miras");
        bst.put(3, "Elvira");
        bst.put(6, "Bakyt");
        //Test
        System.out.println(bst.consist(5));
        System.out.println(bst.consist(2));
        System.out.println(bst.consist(7));
        System.out.println(bst.consist(3));
        System.out.println(bst.consist(6));
        System.out.println(bst.consist(4));
        System.out.println(bst.consist(8));

    }
}


