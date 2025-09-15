import java.util.*;;

public class linkedlist {
    public static void main(String args[]){
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.add(1,7);
        System.out.println(list);

        //fetxh
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(list.size()-1));

        //contains
        System.out.println(list.contains(10));

        //reverse
        Collections.reverse(list);
        System.out.println(list);

        //remove
        list.remove(0);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
