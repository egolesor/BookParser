package parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;

/**
 * Created by ehsan on 24.08.16.
 */
public interface BaseParser<T> {
    List<T> getOffers(Document doc);
}
