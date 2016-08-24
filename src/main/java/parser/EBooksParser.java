package parser;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Utils to parse the books, offers from the page ebooks.com
 */
public class EBooksParser implements BaseParser<Element>{

    /**
     * Searching for the books that are offered by the ebooks.com list the offers
     * @return the offers that are found
     */
    public List<Element> getOffers(Document doc){
        // all results. in ebooks.com the result of a category are stored int the list,
        // that are int he table by id lblResults
        return doc.select("#lblResults li").stream().filter(e->
                e.toString().contains("color:red; text-decoration:line-through"))
                .collect(Collectors.toList());
    }

}
