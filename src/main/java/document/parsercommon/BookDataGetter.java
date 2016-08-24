package document.parsercommon;

import org.jsoup.nodes.Element;

/**
 * Created by ehsan on 24.08.16.
 */
public interface BookDataGetter {

    String getTitle(Element element);

    String getUrl(Element element);

    String getAuthor(Element element);

    String getDescription(Element element);

    String getPrice(Element element);
}
