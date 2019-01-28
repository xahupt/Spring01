import com.scanning.SequenceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSequenceScanning {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/spring-scanning.xml");
        SequenceService sequenceService = (SequenceService) context.getBean("sequenceService");
        System.out.println(sequenceService.generate("IT"));
        System.out.println(sequenceService.generate("IT"));
    }
}

