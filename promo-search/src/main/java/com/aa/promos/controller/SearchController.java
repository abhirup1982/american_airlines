package com.aa.promos.controller;

import com.aa.promos.models.SearchResults;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class SearchController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @Value("${promo.details.url}")
    private String promo_result_url;

/*    @RequestMapping("/search")
    public ModelAndView search(String searchPromo) throws IOException {
        ModelAndView view = new ModelAndView("search");
        String rsp = sampleResponse(searchPromo);
        ObjectMapper mapper = new ObjectMapper();
        JavaType listType = mapper
                .getTypeFactory()
                .constructCollectionType(List.class, SearchResults.class);
        List<SearchResults> searchResults = mapper.readValue(rsp, listType);
        view.addObject("searchResults", searchResults);
        return view;
    }*/

    @RequestMapping("/search")
    public void search(HttpServletResponse rsp, String searchPromo) throws IOException {
        rsp.sendRedirect(promo_result_url + "/promoDetails?promoCode=" + searchPromo);
    }

    private String sampleResponse(String searchPromo) {
        return
                "[{\n" +
                        "\t\"promoCode\":\""+searchPromo+"1\",\n" +
                        "\t\"promoName\":\"Promo-ABCD\",\n" +
                        "\t\"promoStartDt\":\"01/12/2017\",\n" +
                        "\t\"promoEndDt\":\"\"\n" +
                        "},{\n" +
                        "\t\"promoCode\":\""+searchPromo+"2\",\n" +
                        "\t\"promoName\":\"Promo-XYZ\",\n" +
                        "\t\"promoStartDt\":\"01/12/2017\",\n" +
                        "\t\"promoEndDt\":\"\"\n" +
                        "},{\n" +
                        "\t\"promoCode\":\""+searchPromo+"3\",\n" +
                        "\t\"promoName\":\"Promo-ABC\",\n" +
                        "\t\"promoStartDt\":\"01/12/2017\",\n" +
                        "\t\"promoEndDt\":\"\"\n" +
                        "},{\n" +
                        "\t\"promoCode\":\""+searchPromo+"4\",\n" +
                        "\t\"promoName\":\"Promo-AB\",\n" +
                        "\t\"promoStartDt\":\"01/12/2017\",\n" +
                        "\t\"promoEndDt\":\"01/12/2018\"\n" +
                        "}]";
    }
}
