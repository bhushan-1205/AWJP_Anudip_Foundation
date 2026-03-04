import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        System.out.println("HashSet elements: " + set);      
        if (set.contains(10)) {
            System.out.println("HashSet contains 10");
        } else {
            System.out.println("HashSet does not contain 10");
        }      
        set.remove(15);      
        System.out.println("Size of HashSet: " + set.size());
    }
}
