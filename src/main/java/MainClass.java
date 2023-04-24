import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ListCustom list = new ArrayListCustom();
        List LinkList = new LinkedList();
        list.add("dsfdsf");
        list.add("wqddewqd");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(0);

    }
}
