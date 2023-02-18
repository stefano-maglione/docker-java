package com.stefanomaglione.demoCI.CD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    String test(){
        return "Dusica is a bitch!";
    }
}
