package document.parsercommon;

import org.jsoup.nodes.Element;

/**
 * Created by ehsan on 24.08.16.
 */
public abstract class BookDataGetter {

    public abstract String getTitle(Element element);

    public abstract String getUrl(Element element);

    public abstract String getAuthor(Element element);

    public abstract String getDescription(Element element);

    public abstract String getPrice(Element element);
}
