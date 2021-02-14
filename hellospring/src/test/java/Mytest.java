import com.jason.POJO.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //w我们的对象现在都在Spring中管理了，需要使用直接去里面取出来就好
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
