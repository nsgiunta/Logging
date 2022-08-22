package co.develhope.Logging.controller;

import co.develhope.Logging.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private HomeService homeService;

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String welcomeMessage() {
        logger.info("An INFO Message");
        return "welcome message";
    }

    @GetMapping("/get-errors")
    public void errors() {
        Error error = new Error("This is the error");
        logger.error(error.getMessage());
    }

    @GetMapping("/exp")
    public int exp(){
        int a = Integer.parseInt(environment.getProperty("customEnvs.n1"));
        int b = Integer.parseInt(environment.getProperty("customEnvs.n2"));
        return homeService.getExp(a, b);
    }
}
