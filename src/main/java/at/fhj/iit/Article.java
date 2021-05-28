package at.fhj.iit;

/**
 * Interface Article
 * adds the methods calcPrice() and addArticle(String day, String seller)
 *
 * @author: Daniela Pock
 * @version v3.0, 28.05.2021
 * @since v3.0
 */
public interface Article {
    double calcPrice();

    void addArticle(String day, String seller);

}
