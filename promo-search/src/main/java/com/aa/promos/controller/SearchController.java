package com.aa.promos.controller;

import com.aa.promos.models.PromoSearchRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class SearchController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${promo.details.url}")
    private String promo_result_url;


    @RequestMapping("/")
    public String home() {
        return "home";
    }

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
    public ModelAndView search(String promoCode, String promoName, String promoDesc, String promoStartDt, String promoEndDt) throws IOException {
        PromoSearchRsp promoSearchRsp = restTemplate.getForObject(promo_result_url + "/details?promoCode=" + promoCode, PromoSearchRsp.class);
        if(promoSearchRsp.getContent().getPromotionOrChallengeCode().length() == 0) {
            ModelAndView view = new ModelAndView("home");
            view.addObject("error", "error");
            return view;
        }
        ModelAndView view = new ModelAndView("details");
        view.addObject("promoDetails", promoSearchRsp);
        return view;
    }
}
