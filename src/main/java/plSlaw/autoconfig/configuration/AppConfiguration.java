package plSlaw.autoconfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import plSlaw.autoconfig.generator.PdfGenerator;
import plSlaw.autoconfig.generator.XmlGenerator;
import plSlaw.autoconfig.service.DocumentService;

@Configuration
@ComponentScan("plSlaw.autoconfig")
public class AppConfiguration {

}
