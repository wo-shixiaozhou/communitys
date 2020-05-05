package life.zxw.community.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    //等价于@RequestMapping(method = RequestMethod.GET)，它将HTTP Get请求映射到特定的处理方法上,精简代码
    @GetMapping("/hello")
    public String Hello(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}
