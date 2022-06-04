package savvycom.mark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MarkController {

    @GetMapping("mark")
    public String name(){
        return "index";
    }
}
