package plSlaw.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import plSlaw.bean.generator.DocumentGenerator;
import plSlaw.bean.generator.XmlGenerator;
import plSlaw.bean.service.DocumentService;

@Configuration // oznacza dla springa ze to klasa z konfiguracja
public class AppConfiguration {

    //tworzymy klasy które zwróca nam instancje generatorow
    @Bean
    public XmlGenerator xmlGenerator(){
        return new XmlGenerator();
    }

    //kolejna metoda zwroci instancje DocumentService, pamietac o wstrzykiwaniu
    //wstzykniemy beana wyzej
    @Bean
    public DocumentService documentGenerator(){
        return new DocumentService(xmlGenerator());
    }
}
