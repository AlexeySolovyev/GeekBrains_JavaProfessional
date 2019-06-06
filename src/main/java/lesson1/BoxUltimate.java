package lesson1;

public class BoxUltimate<T> {
    private T obj;

    public BoxUltimate(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("type  " + obj.getClass());
        System.out.println("obj " + obj);
    }
}

class MainUltimate {
    public static void main(String[] args) {
        BoxUltimate<String> wSt = new BoxUltimate<String>("Hello");
        BoxUltimate<Integer> wIn = new BoxUltimate<Integer>(123);

        wSt.info();
        wIn.info();

//        int x = 10;
//        x += (Integer) wIn.getObj();
//        System.out.println(x);

        int x = 10;
        x += wSt.getObj();
        System.out.println(x);
    }
}

