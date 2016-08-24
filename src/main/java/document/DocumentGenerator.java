package document;

import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by ehsan on 24.08.16.
 */
interface DocumentGenerator {

    Document getDocument() throws IOException;
}
