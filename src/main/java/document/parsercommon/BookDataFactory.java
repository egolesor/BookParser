package document.parsercommon;

import org.jsoup.nodes.Element;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by ehsan on 24.08.16.
 */
public class BookDataFactory {

    private static BookData.BookDataBuilder builder = new BookData.BookDataBuilder();

    /**
     *
     * @param element
     * @param bookDataGetter
     * @param library
     * @param profile
     * @return
     *          <ul>
     *              <li>
     *                  {@link BookData} - in valid situation
     *              </li>
     *              <li>
     *                  null - Otherwise
     *              </li>
     *          </ul>
     *
     */
    private static <T> BookData prepareBookData(T element, BookDataGetter<T> bookDataGetter, String library, String profile){
        BookData retData =null;
        try{
            retData = builder
                    .setTitle(bookDataGetter.getTitle(element))
                    .setAuthor(bookDataGetter.getAuthor(element))
                    .setDescription(bookDataGetter.getDescription(element))
                    .setPrice(bookDataGetter.getPrice(element))
                    .setUrl(bookDataGetter.getUrl(element))
                    .setLibrary(library)
                    .setProfile(profile)
                    .build();
        }catch (Exception e){
            // TODO log because something goes very very very bad here
        }finally {

            return retData;
        }
    }

    /**
     *
     * @param elements
     * @param bookDataGetter
     * @param library
     * @param profile
     * @param <T>
     * @return {@link List}
     */
    public static <T>
    List<BookData> newListBookData(List<T> elements, BookDataGetter<T> bookDataGetter, String library, String profile){
        return elements.stream().map(e->
                prepareBookData(e, bookDataGetter, library, profile))
                .filter(e->!e.equals(null))
                .collect(Collectors.toList());
    }

}
