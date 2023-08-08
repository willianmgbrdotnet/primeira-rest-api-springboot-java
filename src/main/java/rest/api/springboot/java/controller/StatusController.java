package rest.api.springboot.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Para certificar se a Api está acessível.
@RestController
public class StatusController {
    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }
}
