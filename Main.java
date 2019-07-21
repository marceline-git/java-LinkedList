public class Main {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(10);
        llist.append(20);
        llist.prepend(0);
        llist.append(30);
        llist.deleteWithValue(20);
        llist.printNodes();
    }
}