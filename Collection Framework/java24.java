
import java.util.Arrays;
import java.util.LinkedList;

public class ListDemo {
    static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addLast(4);
        linkedList.addFirst(0);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dog", "elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList ("dog", "lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

//        Node node1 = new Node();
//        Node node2 = new Node();
//        node2.value = 1;
//        node1.value = 1;
//        node1.next = node2;
//        node2.next = null;
   }
}
//
//class Node{
//
//   public int value;
//
//   public Node next;
//
//}
