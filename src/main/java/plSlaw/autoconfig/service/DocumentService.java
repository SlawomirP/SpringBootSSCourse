package plSlaw.autoconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import plSlaw.autoconfig.generator.DocumentGenerator;
@Component
public class DocumentService {

    private final DocumentGenerator documentGenerator;

    //tu wstrzykniemy beana zrobionego z klasy implementujacej interfejs
    //DocumentGenerator
    @Autowired
    public DocumentService(@Qualifier("xmlGenerator") DocumentGenerator documentGenerator) {
        this.documentGenerator = documentGenerator;
    }

    public String generate(){
        return documentGenerator.generate();
    }
}

