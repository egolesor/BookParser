package document.parsercommon;

import org.jsoup.nodes.Element;

/**
 * Created by ehsan on 24.08.16.
 */
public interface BookDataGetter<T> {

    String getTitle(T element);

    String  getUrl(T element);

    String getAuthor(T element);

    String getDescription(T element);

    String getPrice(T element);
}
