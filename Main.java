import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        HashMap <String, Integer> menuList = new HashMap<>();
        menuList.put("Burger",50);
        menuList.put("Pizza",250);
        menuList.put("Coffee",50);
        menuList.put("Samosa",15);
        menuList.put("Chai",10);
        System.out.println(menuList );
        System.out.println(menuList.containsKey("Pizza"));
        System.out.println(menuList.get("Chai"));

        //Key Sets
        Set<String> myKeys = menuList.keySet();
        System.out.println(myKeys);

        // Iteration
        for (String k : myKeys){
            System.out.println("Key = "+k+" , "+"value = "+menuList.get(k));
        }

        // EntrySets
            System.out.println("Key value"+menuList.entrySet());

    }
}
