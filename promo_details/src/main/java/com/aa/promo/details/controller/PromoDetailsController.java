package com.aa.promo.details.controller;

import com.aa.promo.details.model.PromoDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class PromoDetailsController {

    @RequestMapping("/promoDetails")
    public ModelAndView details(@RequestParam(value = "promoCode") String promoCode) throws IOException {
        ModelAndView view = new ModelAndView("details");
        String rsp = sampleResponse(promoCode);
        ObjectMapper mapper = new ObjectMapper();
        PromoDetails promoDetails = mapper.readValue(rsp, PromoDetails.class);
        view.addObject("promoDetails", promoDetails);
        return view;
    }

    private String sampleResponse(String promoCode) {
        return
                "{\n" +
                        "\t\"LSCS\":{\n" +
                        "\t\t\"rewardType\":\"XYZ\",\n" +
                        "\t\t\"rewardFormat\":\"XYZ\",\n" +
                        "\t\t\"promoCode\":\""+promoCode+"\"\n" +
                        "\t},\n" +
                        "\t\"Ventana\":{\n" +
                        "\t\t\"trackerType\":\"XYZ\",\n" +
                        "\t\t\"goal\":\"XYZ\",\n" +
                        "\t\t\"promoCode\":\""+promoCode+"\"\n" +
                        "\t}\n" +
                        "}";
    }
}
