package document;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Created by ehsan on 24.08.16.
 */
class FileDocument implements DocumentGenerator {

    private final File theFile;

    FileDocument(File theFile) {
        this.theFile = theFile;
    }

    public Document getDocument() throws IOException {
        // getting the document by the category
        return Jsoup.parse(theFile, "");
    }
}
