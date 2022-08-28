package plSlaw.autoconfig.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import plSlaw.autoconfig.generator.XmlGenerator;


@Configuration
@ComponentScan("plSlaw.autoconfig")
public class AppConfiguration {

    //metoda z poprzedniej lekcji
    @Bean
    public XmlGenerator xmlGenerator(){
        return new XmlGenerator();
    }
}
