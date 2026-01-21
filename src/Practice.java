public class Practice {
    public static void main(String[] args) {

        // Node head = new Node('g', null);
        // Node ryan = new Node('s', null);
        // head.next = ryan;
        // ryan.next = new Node('t', null);
        // ryan.next.next = new Node('x', null);
        // // Expect to return true
        // System.out.println(contains(head, 'x'));

        // // Expect to return false
        // System.out.println(contains(head, 'e'));

        // System.out.println(remove(head, 't'));

        MyLL<Character> list = new MyLL<>();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');

        list.printList();
        MyLL<Integer> intList = new MyLL<>();

        intList.addToBack(5);
        intList.addToBack(99);
        intList.addToBack(2);
        intList.addToBack(-333);
        intList.addToBack(66);

        intList.printList();

        MyLL<Integer> dubleintList = new MyLL<>();
        dubleintList.addToBack(1);
        dubleintList.addToBack(2);
        dubleintList.addToBack(3);
        dubleintList.addToBack(4);
        dubleintList.addToBack(5);

        dubleintList.printBackWards();
    }

    public static void printList(Node start) {

        Node current = start;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

    public static boolean contains(Node start, char tofind) {

        while (start != null) {

            if (start.value == tofind) {
                return true;
            }
            start = start.next;
        }

        return false;
    }

    // remove the first node that has toremove
    public static char remove(Node head, char toRemove) {

        Node current = head;
        while (current.next != null) {
            if (current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;

        }
        return '\0';

    }
}
