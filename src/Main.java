
// @author Evgeniy Hirin

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(3);
        myLinkedList.add(10);
        myLinkedList.add(13);

        System.out.println(myLinkedList.toString());

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);

        System.out.println(myLinkedList.toString());
    }
}
