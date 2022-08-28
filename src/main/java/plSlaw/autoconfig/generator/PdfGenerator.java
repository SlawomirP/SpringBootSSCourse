package plSlaw.autoconfig.generator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PdfGenerator")
public class PdfGenerator implements DocumentGenerator {
    public String generate() {
        return "Generate Pdf";
    }
}
