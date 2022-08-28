package plSlaw.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import plSlaw.bean.configuration.AppConfiguration;
import plSlaw.bean.service.DocumentService;

public class MainApp {
    public static void main(String[] args) {

        //korzystajac z annotacji trzeba dodac taka linijke, na koncu plik z konfiguracja
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        DocumentService documentService = applicationContext.getBean(DocumentService.class);
        System.out.println(documentService.generate());
    }
}
