package document.parsercommon;

import org.jsoup.nodes.Element;

/**
 * Hello world!
 *
 */
public class EBookComDataGetter implements BookDataGetter{

    public String getUrl(Element element){
        return element.select(".book-title a").attr("href");
    }

    public String getTitle(Element element){
        return element.select(".book-title a").text();
    }

    public String getAuthor(Element element){
        return element.select(".author").text();
    }

    public String getDescription(Element element){
        return element.select("p").text();
    }

    public String getPrice(Element element){
        String str1 = element.select(".additional-info span span span").toString();
        return element.select(".additional-info span span")
                .toString().replace(str1,"")
                .replaceAll("<span>","")
                .replace("</span>","").trim();
    }

}
