import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("第一个git");
        System.out.println("yiersan");
        System.out.println("继续来");
        System.out.println("还用再来一波");
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.forEach(t -> {
            System.out.println(t);
        });
    }
}
