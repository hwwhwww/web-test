import java.util.ArrayList;
import java.util.List;

/**
 * @author lzl
 * @date 2019/9/1
 */
public class Test1 {

    List<String> list = new ArrayList<String>();

    public void getTest(){
        list.add("老王");
        list.add("老李");
        list.add("老张");
        list.add("老掉");

        list.forEach(e -> System.out.printf(
                e
        ));
    }
}
