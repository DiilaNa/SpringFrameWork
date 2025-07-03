package lk.ijse.project.controller;

import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("form")
@MultipartConfig
public class FormController {

    @PostMapping("save")
    public String sayPost(@RequestParam Map<String, String> formData) {
        for (Map.Entry<String, String> entry : formData.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return "save User";
    }
}
