import com.ioc.SequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSequenceGeneratorIoc {
    public static void main(String[] args){
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/spring-ioc.xml");
        SequenceGenerator sequenceGenerator = (SequenceGenerator) ac.getBean("sequenceGenerator1");
        System.out.println(sequenceGenerator.toString());
    }
}
