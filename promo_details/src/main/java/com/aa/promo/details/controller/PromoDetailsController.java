package com.aa.promo.details.controller;

import com.aa.promo.details.model.PromoDetails;
import com.aa.promo.details.model.PromoSearchRsp;
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
        PromoSearchRsp promoSearchRsp = mapper.readValue(rsp, PromoSearchRsp.class);
        view.addObject("promoDetails", promoSearchRsp);
        return view;
    }

    /*private String sampleResponse(String promoCode) {
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
    }*/

    private String sampleResponse(String promoCode) {
        return "{\n" +
                "\t\"Content\": {\n" +
                "\t\t\"PromotionOrChallengeCode\": \""+promoCode+"\",\n" +
                "\t\t\"PromotionType\": \"\",\n" +
                "\t\t\"PromotionName\": \"ARP50 - Title – en_US - Regular Title with Short Description\",\n" +
                "\t\t\"Description\": \"ARP50 - Short Description - en_US - Regular Title with Short Description\",\n" +
                "\t\t\"HighResolutionImage\": \"/content/images/AR5/Promo_ARP50_en_US.png\",\n" +
                "\t\t\"LowResolutionImage\": \"/content/images/AR5/Promo_ARP50_en_US.png\",\n" +
                "\t\t\"Goals\": [{\n" +
                "\t\t\t\"GoalLabel\": \"ARP50 - Goal Label 1 – en_US\",\n" +
                "\t\t\t\"GoalDescription\": \"ARP50 - Goal Description 1 – en_US\",\n" +
                "\t\t\t\"TrackerType\": \"None\",\n" +
                "\t\t\t\"RewardSet\": [{\n" +
                "\t\t\t\t\"RewardType\": \"Fixed\",\n" +
                "\t\t\t\t\"RewardFormat\": \"RewardDescription\",\n" +
                "\t\t\t\t\"RewardDescription\": \"ARP50 - Reward Set 1 - Fixed - Reward Description - en_US\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"RewardType\": \"Fixed\",\n" +
                "\t\t\t\t\"RewardFormat\": \"RewardDescription\",\n" +
                "\t\t\t\t\"RewardDescription\": \"ARP50 - Reward Set 2 - Fixed - Reward Description - en_US\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"Tracker\": [{\n" +
                "\t\t\t\t\"TrackingElement\": \"EQDs\",\n" +
                "\t\t\t\t\"TrackingCode\": \"Number 1\",\n" +
                "\t\t\t\t\"TrackingElementPreview\": \"ARP50 - Tracking ElementPreview - en_US\"\n" +
                "\t\t\t}]\n" +
                "\t\t}],\n" +
                "\t\t\"RulesRestrictions\": [{\n" +
                "\t\t\t\"ParentChild\": \"Parent\",\n" +
                "\t\t\t\"Rules\": \"ARP50 - Rules and Restrictions 1 - Parent 1 – en_US\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"ParentChild\": \"Parent\",\n" +
                "\t\t\t\"Rules\": \"ARP50 - Rules and Restrictions 2 - Parent 2 – en_US\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"ParentChild\": \"Child\",\n" +
                "\t\t\t\"Rules\": \"ARP50 - Rules and Restrictions 3 - Child 2.1 – en_US\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"ParentChild\": \"Parent\",\n" +
                "\t\t\t\"Rules\": \"ARP50 - Rules and Restrictions 4 - Child 2.2 – en_US\"\n" +
                "\t\t}],\n" +
                "\t\t\"TermsCondition\": [{\n" +
                "\t\t\t\"TermsAndCondition\": \"ARP50 - Terms and Conditions 1 - en_US\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"TermsAndCondition\": \"ARP50 - Terms and Conditions 2 - en_US\"\n" +
                "\t\t}]\n" +
                "\t}\n" +
                "}";
    }
}
