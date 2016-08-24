package document.parsercommon;

import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ehsan on 24.08.16.
 */
public class BookDataFactory {

    private static BookData.BookDataBuilder builder = new BookData.BookDataBuilder();

    private static BookData prepareBookData(Element element, BookDataGetter bookDataGetter, String library, String profile){
        return builder
                .setTitle(bookDataGetter.getTitle(element))
                .setAuthor(bookDataGetter.getAuthor(element))
                .setDescription(bookDataGetter.getDescription(element))
                .setPrice(bookDataGetter.getPrice(element))
                .setUrl(bookDataGetter.getUrl(element))
                .setLibrary(library)
                .setProfile(profile)
                .build();
    }

    public static List<BookData> newListBookData(List<Element> elements, BookDataGetter bookDataGetter, String library, String profile){
        return elements.stream().map(e->
                prepareBookData(e, bookDataGetter, library, profile))
                .collect(Collectors.toList());
    }

}
