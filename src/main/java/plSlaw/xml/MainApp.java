package plSlaw.xml;

public class MainApp {
    public static void main(String[] args) {

        DocumentGenerator documentGenerator = new XmlGenerator();

        DocumentService documentService = new DocumentService(documentGenerator);

        System.out.println(documentService.generate());
    }
}
