package solution;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("1");
        System.out.println("Before reverse: ");
        printList(list);
        list.reverse();
        System.out.println("After reverse: ");
        printList(list);
        list.add("2");
        System.out.println("Before reverse: ");
        printList(list);
        list.reverse();
        System.out.println("After reverse: ");
        printList(list);
        list.add("3");
        System.out.println("Before reverse: ");
        printList(list);
        list.reverse();
        System.out.println("After reverse: ");
        printList(list);
        System.out.println();
    }

    private static void printList(SinglyLinkedList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
}
