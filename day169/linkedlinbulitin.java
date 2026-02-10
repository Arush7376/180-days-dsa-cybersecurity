package day169;
import java.util.*;
public class linkedlinbulitin {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("list");
        list.addFirst("linked");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println("Null");

        list.remove("list");
        System.out.println(list);
    }
}
