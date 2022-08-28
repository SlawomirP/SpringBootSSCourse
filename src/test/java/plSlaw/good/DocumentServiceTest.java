package plSlaw.good;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentServiceTest {

    @Test
    public void generateJson() {
        //given
        //tworzymy obiekt z interfejsu bo mamy wstrzykiwanie przez konstruktor
        DocumentGenerator documentGenerator = new JsonGenerator();
        DocumentService documentService = new DocumentService(documentGenerator);//wstrzykniecie

        //when
        final String result = documentService.generate();

        //then
        Assert.assertEquals("Generate Json", result);
    }

    @Test
    public void generateXnl() {
        //given
//        DocumentGenerator documentGenerator = new XmlGenerator();
//        DocumentService documentService = new DocumentService(documentGenerator);
        //zastosowanie metody
        DocumentService documentService = givenDocumentService(new XmlGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assert.assertEquals("Generate Xml", result);
    }

    //aby nie dublowac kodu robimy metode zastepująca
    private DocumentService givenDocumentService(final DocumentGenerator documentGenerator){
        return new DocumentService(documentGenerator);
    }

}