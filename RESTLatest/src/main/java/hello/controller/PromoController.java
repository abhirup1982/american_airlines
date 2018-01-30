package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@RestController
public class PromoController  {

    private final Logger log = LoggerFactory.getLogger(PromoController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String getPromoResponse(@RequestParam("promoCode") String promocode) throws KeyManagementException, NoSuchAlgorithmException {
        System.out.println("******** promocode = " + promocode);
        SSLUtil.turnOffSslChecking();
        try {
            ResponseEntity<String> rsp = restTemplate.getForEntity(
                    "https://10.245.9.36/lscs-static/491/1bf/4911bfc4b296798b8bbf3fe37828679c/content/Promotions/en_US/ARP50.json",
                    String.class, new Object[] {});
            return rsp.getBody();
        } catch (Exception e) {
            log.error("Error while searching promotion code", e);
            return errorResponse();
        }
    }

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

    private String errorResponse() {
        return "{\n" +
                "\t\"Content\": {\n" +
                "\t\t\"PromotionOrChallengeCode\": \"\"\n" +
                "\t}\n" +
                "}";
    }
}