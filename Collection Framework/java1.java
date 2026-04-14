
import java.util.ArrayList;

public class ArrayDemo2 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(5);//1
        list.add(80);//2
        System.out.println(list.add(2));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(1));
        }
        for(int x: list){
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));

        list.remove(2);
        for (int x: list){
            System.out.println(x);
        }

        list.add(2,50);
        for (int x: list){
            System.out.println(x);
        }

        list.set(2,50);
        for(int x: list){
            System.out.println(x);
        }
    }
}
