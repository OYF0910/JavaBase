import org.junit.Test;

/**
 * String字符串，使用一对“”来表示的
 * String 声明为final类型的,表示不可以被继承的
 * String 实现了Serializable接口：可以序列化的
 *        实现了Comparable接口：表示可以比较大小的；
 *   String 内部是使用 final char[]来存储数据的，final定义的变量是不可变的；
 *  通过字面量的方式去赋值的话，此时的字符串是声明在字符串常量池中的
 *  字符串常量池中是不会存储两个相同内容的字符串的；
 *  
 *
 */

public class StirngTest {

    @Test
    public void test(){
        String s1 = "aa";
        String s2 = "aa";
        s2 = "hello";
        System.out.println(s1 == s2);
    }
}
