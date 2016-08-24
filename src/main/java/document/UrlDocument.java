package document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parser.UrlUtil;

import java.io.IOException;

/**
 * Created by ehsan on 24.08.16.
 */
class UrlDocument implements DocumentGenerator {

    private final String profile;

    UrlDocument(String profile) {
        this.profile = profile;
    }

    public Document getDocument() throws IOException {
        return Jsoup.connect(UrlUtil.URL_E_BOOKS_COM + profile + "/").get();
    }
}
