package lesson1;

public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("type  " + obj.getClass());
        System.out.println("obj " + obj);
    }
}

class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1);
        Box box2 = new Box("str1");

//        box1.info();
//        box2.info();

        int x = 10;
        x += (Integer) box1.getObj();

        System.out.println(x);
    }
}
