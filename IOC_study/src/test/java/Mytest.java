import com.service.Userservice;
import com.service.UserserviceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取ApplicationContext： 拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么，get什么
        UserserviceImpl userserviceImpl = (UserserviceImpl) context.getBean("UserserviceImpl");
        userserviceImpl.getUser();
    }
}
