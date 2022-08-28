package plSlaw.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plSlaw.autoconfig.service.DocumentService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
    //standardowa formułka przy aplikacjach spring boota
        SpringApplication.run(MainApp.class, args);
    }

    //stworzenie instancji DocumentService i wstrzykniemy przez konstruktor
    private DocumentService documentService;
@Autowired
    public MainApp(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostConstruct
    public void init(){
        System.out.println(documentService.generate());
    }
}
