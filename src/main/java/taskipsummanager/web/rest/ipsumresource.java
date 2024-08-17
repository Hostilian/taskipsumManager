package taskipsummanager.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taskipsummanager.service.IpsumGeneratorService;

@RestController
@RequestMapping("/api")
public class ipsumresource {

    private final IpsumGeneratorService ipsumGeneratorService;

    public ipsumresource(IpsumGeneratorService ipsumGeneratorService) {
        this.ipsumGeneratorService = ipsumGeneratorService;
    }

    @GetMapping("/bacon-ipsum")
    public ResponseEntity<String> getBaconIpsum() {
        String baconIpsum = ipsumGeneratorService.generateBaconIpsum();
        return ResponseEntity.ok(baconIpsum);
    }
}
