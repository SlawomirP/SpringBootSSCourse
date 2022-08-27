package plSlaw.bad;

public class BadMainApp {
    public static void main(String[] args) {

        final DocumentService documentService = new DocumentService();

        System.out.println(documentService.generate(DocumentType.XML));

    }
}
