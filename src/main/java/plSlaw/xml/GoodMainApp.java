package plSlaw.xml;

public class GoodMainApp {
    public static void main(String[] args) {

        DocumentGenerator documentGenerator = new XmlGenerator();

        DocumentService documentService = new DocumentService(documentGenerator);

        System.out.println(documentService.generate());
    }
}
