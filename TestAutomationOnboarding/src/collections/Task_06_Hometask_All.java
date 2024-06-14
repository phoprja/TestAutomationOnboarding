package collections;
import java.util.*;

public class Task_06_Hometask_All {
	public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Banana");
        System.out.println("ArrayList after deletion: " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("\nLinkedList: " + linkedList);
        linkedList.removeFirst();
        System.out.println("LinkedList after deletion: " + linkedList);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("\nHashMap: " + hashMap);
        hashMap.remove(2);
        System.out.println("HashMap after deletion: " + hashMap);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        System.out.println("\nLinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("LinkedHashMap after deletion: " + linkedHashMap);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("\nHashSet: " + hashSet);
        hashSet.remove("Banana");
        System.out.println("HashSet after deletion: " + hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        System.out.println("\nLinkedHashSet: " + linkedHashSet);
        linkedHashSet.remove(20);
        System.out.println("LinkedHashSet after deletion: " + linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("\nTreeSet: " + treeSet);
        treeSet.remove(10);
        System.out.println("TreeSet after deletion: " + treeSet);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("\nTreeMap: " + treeMap);
        treeMap.remove(2);
        System.out.println("TreeMap after deletion: " + treeMap);
    }
}
