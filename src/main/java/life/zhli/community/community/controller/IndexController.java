package life.zhli.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: community
 * Created by Lee on 2020/9/8 15:50
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";}
}
