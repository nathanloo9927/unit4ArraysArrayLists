import java.util.*;
public class ArrayListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("The names: " + names);
        
        System.out.println("First: " + names.get(0));
        System.out.println("Last: " + names.get(7));
        
        System.out.println("Size: " + names.size());
        System.out.println("Last (Using get()): " + names.get(names.size() - 1));
        
        names.set(0, "Alice B. Tolkas");
        System.out.println("Modified: " + names);
        
        names.add(4, "Doug");
        System.out.println("Modified: " + names);
        
        for (String name : names)
        {
            System.out.println(name);
        }
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("New list: " + names2);
        names.remove(0);
        System.out.println("element 1 removed: " + names);
        System.out.println("but not from list 2: " + names2);
    }
}
