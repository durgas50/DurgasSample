package com.example;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class CustomerController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    @RequestMapping("/customer/1")
    public @ResponseBody Customer getCustomer(String name) {
        return new Customer(counter.incrementAndGet(), String.format(template, name));
    }
    
      
    @RequestMapping(method=RequestMethod.POST)
    @RequestMapping("/customer")
    public @ResponseBody Customer postName(@RequestParam(value="Name", required=true, defaultValue="") String name) {
        return new Customer(counter.incrementAndGet(), String.format(template, name));
    }


}
