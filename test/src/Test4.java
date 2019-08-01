enum Signal {
    GREEN("蓝色", 1), YELLOW("蓝色", 1), RED("蓝色", 1);
    public String name;
    public int index;

    private Signal(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法
    @Override
    public String toString() {
        System.out.println("------------------ 老王 --------------------");
        return this.index + "_" + this.name;

    }
}

public class Test4 {
    static Signal color = Signal.RED;

    public static void main(String[] args) {
        System.out.println(color.toString());
    }

}  