import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        genericList.add(4);

//        Iterator<Integer> iterator = genericList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        for (Integer ele : genericList) {
            System.out.println(ele);
        }
    }
}