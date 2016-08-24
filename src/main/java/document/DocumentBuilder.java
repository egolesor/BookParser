package document;

import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Created by ehsan on 24.08.16.
 */
public class DocumentBuilder {

    private String category;
    private File theFile;


    public DocumentBuilder setProfile(String category){
        this.category = category;
        return this;
    }

    public DocumentBuilder setFile(File file){
        this.theFile = file;
        return this;
    }

    public Document buildFromFile() throws IOException {
        return new FileDocument(theFile).getDocument();
    }

    public Document buildFromUrl() throws IOException {
        return new UrlDocument(category).getDocument();
    }


}
