package plSlaw.bad;

import java.util.Objects;

public class DocumentService {

    private final PdfGenerator pdfGenerator = new PdfGenerator();
    private final JsonGenerator jsonGenerator = new JsonGenerator();
    private final TxtGenerator txtGenerator = new TxtGenerator();

    //zaleznie od enuma, wygeneruje nam odpowiedni generate()
    public String generate(final DocumentType documentType) {
        if (Objects.isNull(documentType)) {
            throw new BadDocumentTypeException("Bad document type !");
        }
        if (documentType.equals(DocumentType.PDF)) {
            return pdfGenerator.generate();
        } else if (documentType.equals(DocumentType.TXT)) {
            return txtGenerator.generate();
        } else if (documentType.equals(DocumentType.JSON)) {
            return jsonGenerator.generate();
        } else {
            throw new BadDocumentTypeException("Bad document type !");
        }
    }
}
