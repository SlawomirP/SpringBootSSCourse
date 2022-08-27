package plSlaw.good;

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

