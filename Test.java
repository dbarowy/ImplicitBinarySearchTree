public class Test {
    public static void main(String[] args) {
        BinarySearchTree<String> t = new BinarySearchTree<>();
	t.add("William");
        t.add("Diana");
        t.add("Charles");
        t.add("Frances");
        t.add("Edward");
        t.add("Elizabeth");
        t.add("Philip");

        System.out.println(t);
    }
}
