package plSlaw.autoconfig.generator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TxtGenerator")
public class TxtGenerator implements DocumentGenerator {
    public String generate() {
        return "Generate Txt";
    }
}
