package plSlaw.xml;

import org.junit.Assert;
import org.junit.Test;

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
    public void generateXml() {
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

    @Test
    public void generateTxt() {
        //given
        DocumentService documentService = givenDocumentService(new TxtGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assert.assertEquals("Generate Txt", result);
    }


    //aby nie dublowac kodu robimy metode zastepująca
    private DocumentService givenDocumentService(final DocumentGenerator documentGenerator) {
        return new DocumentService(documentGenerator);
    }

}