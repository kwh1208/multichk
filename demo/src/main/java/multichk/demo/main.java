package multichk.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@Slf4j
public class main {
    @GetMapping
    public String main_controller(){
        return "index";
    }

    @GetMapping("/dual")
    public String two(){
        return "two";
    }

    @GetMapping("/three")
    public String three(){
        return "three";
    }

    @GetMapping("/Quad")
    public String four(){
        return "four";
    }

    @GetMapping("/coStream")
    public String broadcast(){
        return "broadcast";
    }

    @PostMapping("/coStream")
    public String broadcast_post(@RequestParam String youtube, Model model){
        String[] split = youtube.split("\"");
        if (split.length>2){
            youtube=split[5];
        }
        model.addAttribute("youtube", youtube);
        return "broadcast_result";
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}