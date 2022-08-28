package plSlaw.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

//odwołanie do kontenera springowego
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//pobranie beana przez utorzony applicationContext
        DocumentService documentService = applicationContext.getBean(DocumentService.class);

        //wyswietlenie documentService
        System.out.println(documentService.generate());
    }
}
