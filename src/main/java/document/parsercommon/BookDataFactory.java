package document.parsercommon;

import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

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
                .setprice(bookDataGetter.getPrice(element))
                .setUrl(bookDataGetter.getUrl(element))
                .setLibrary(library)
                .setProfile(profile)
                .build();
    }

    public static List<BookData> newListBookData(List<Element> elements, BookDataGetter bookDataGetter, String library, String profile){
        List<BookData> bookDataList = new ArrayList<>(elements.size());

        for(Element element:elements){
            bookDataList.add(prepareBookData(element, bookDataGetter, library, profile));
        }

        return bookDataList;
    }


}
