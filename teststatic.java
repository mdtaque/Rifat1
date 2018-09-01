package staticvariable_method;

public class teststatic {

    public static void main(String[] args) {

        statickeyword s = new statickeyword();
        s.age=20;
        System.out.println(s.age);

        statickeyword k = new statickeyword();
        k.age=30;
        System.out.println(k.age);

        System.out.println(s.age);
    }
}
