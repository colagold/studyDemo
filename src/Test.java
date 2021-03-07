import Service.IUserService;
import Service.impl.UserServiceImpl;
import dao.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        //加载Spring上下文，加载IOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring.xml");

        IUserService userService=ioc.getBean(IUserService.class);
        userService.getUser();
    }
}
