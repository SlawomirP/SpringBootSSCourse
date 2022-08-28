package plSlaw.bean.service;

import plSlaw.bean.generator.DocumentGenerator;

public class DocumentService {

//   instacja interfejsu
    private final DocumentGenerator documentGenerator;

//   wstrzykiwanie przez konstruktor - najczestsza metoda
    public DocumentService(DocumentGenerator documentGenerator) {
        this.documentGenerator = documentGenerator;
    }

    public String generate(){
        return documentGenerator.generate();
    }
}

