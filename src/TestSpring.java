import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        Spring01 spring01 = (Spring01) applicationContext.getBean("Spring01");
        System.out.println(spring01);
    }
}
