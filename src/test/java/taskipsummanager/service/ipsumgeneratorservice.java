package taskipsummanager.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ipsumgeneratorservice {

    private static final String BACON_IPSUM_API = "https://baconipsum.com/api/?type=all-meat&paras=5&format=text";

    public String generateBaconIpsum() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(BACON_IPSUM_API, String.class);
    }
}
