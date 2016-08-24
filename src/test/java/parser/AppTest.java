package parser;


import document.DocumentBuilder;
import document.parsercommon.BookData;
import document.parsercommon.BookDataFactory;
import document.parsercommon.BookDataGetter;
import document.parsercommon.EBookComDataGetter;
import org.jsoup.nodes.Element;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void justinCase(){

        DocumentBuilder documentBuilder= new DocumentBuilder();

        List<BookData> bookDataList = null;
        String profile = "education";

        BaseParser parser = new EBooksParser();

        try {
            List<Element> elements = parser.getOffers(documentBuilder.setProfile(profile).buildFromUrl());

            BookDataGetter getter = new EBookComDataGetter();
            bookDataList = BookDataFactory.newListBookData(elements,
                    getter, UrlUtil.URL_E_BOOKS_COM,profile);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(bookDataList);
    }


}
