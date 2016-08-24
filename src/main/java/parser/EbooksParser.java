package parser;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Utils to parse the books, offers from the page ebooks.com
 */
public class EbooksParser implements BaseParser{

    /**
     * Searching for the books that are offered by the ebooks.com list the offers
     * @return the offers that are found
     * @throws IOException
     */
    public List<Element> getOffers(Document doc){
        // all results. in ebooks.com the result of a category are stored int the list,
        // that are int he table by id lblResults
        Elements elements = doc.select("#lblResults li");
        List<Element> offers = new LinkedList<Element>();
        // TODO streams
        for (Element element : elements) {
            // finding the books that got discount
            if (element.toString().contains("color:red; text-decoration:line-through")) {
                offers.add(element);
            }
        }

        // return the list the offers
        return offers;
    }

}
