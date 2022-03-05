import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args){
        System.out.println('c' - 'a');
        int a = 1;
        System.out.println(getType(a));
        System.out.println(getType('c' - 'a'));
        System.out.println(getType('a'));

    }
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
