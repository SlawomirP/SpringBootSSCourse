package plSlaw.autoconfig.generator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("JsonGenerator")
public class JsonGenerator implements DocumentGenerator {
    public String generate() {
        return "Generate Json";
    }
}
