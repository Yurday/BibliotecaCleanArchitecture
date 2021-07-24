package co.com.sofka;

import co.com.sofka.rest.RestResourceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    RestResourceController restResourceController;

    @PostMapping("/create")
    public String createResource(String name){
        return restResourceController.post(name);
    }
}
