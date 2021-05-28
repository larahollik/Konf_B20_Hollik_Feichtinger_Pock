package at.fhj.iit;

import java.util.Date;

public interface Article {
    double calcPrice();

    void addArticle(Date day, String seller);

}
