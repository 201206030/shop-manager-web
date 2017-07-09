package net.happyshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping("/")
    public String pageIndex(){
        return "index";
    }
    
    @RequestMapping("/{page}")
    public String showPage(@PathVariable(value="page") String page){
        return page;
    }
}
