import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    static void main(String[] args) {
        HashMap<Person , String> map = new HashMap<>();
        Person p1 = new Person("Vanshu" , 1);
        Person p2 = new Person("Anshii" , 2);
        Person p3 = new Person("ladu" , 1);

        map.put(p2 , "Engineer"); // hashcode1 --> index1
        map.put(p1 , "Designer"); // hashcode2 --> index2
        map.put(p3 , "Manager"); // hashcode3 --> index3

        System.out.println("HashMap size: " + map.size());
        System.out.println("value for p1: " + map.get(p1));
        System.out.println("value for p3: " + map.get(p3));
        System.out.println(p1);

        Map<String , Integer> map1 = new HashMap<>();
        map1.put("alice" , 90); // hashcode1 --> index1
        map1.put("charlie" , 92); // hashcode2 --> index2
        map1.put("alice" , 99); // hashcode1 --> index1 --> equals() -->replace
    }

}
class Person{
     private String name;

     private int id;

    public Person(String name , int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

    public int hashcode() {
        return Objects.hash(name , id);
    }

    @Override
    public String toString(){
        return "id: " + id + " , name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
        }
}



